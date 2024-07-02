package com.mydomain.authentication.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.mydomain.authentication.models.LoginUser;
import com.mydomain.authentication.models.User;
import com.mydomain.authentication.repositories.UserRepository;

@Service
public class UserSerivce {
	@Autowired
	UserRepository userRepository ; 
	
	public User createUesr(User u) {
		return userRepository.save(u);
	} 
	
	public User findUser(Long id) {
		Optional<User> userOptional = userRepository.findById(id);
		if(userOptional.isPresent()) {
			return userOptional.get();
		}
		return null ; 
	}
	
	 // This method will be called from the controller
    // whenever a user submits a registration form.
    
    public User register(User newUser, BindingResult result) {
    
    	// TO-DO - Reject values or register if no errors:
        
        // Reject if email is taken (present in database)
    	Optional<User> optional = userRepository.findByEmail(newUser.getEmail());
    	if(optional.isPresent()){
    		result.rejectValue("email", "exist", "The Email already used by other user!");
    	}
        // Reject if password doesn't match confirmation
        if(!newUser.getPassword().equals(newUser.getConfirmPassword())){
        	 result.rejectValue("confirmPassword", "Matches", "The Confirm Password must match Password!");
        }
        // Return null if result has errors
        if(result.hasErrors()) {
            // Exit the method and go back to the controller 
            // to handle the response
            return null;
        }
        // Hash and set password, save user to database
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
        return userRepository.save(newUser);
    
        
    }
    // This method will be called from the controller
    // whenever a user submits a login form.
        public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO - Reject values:
        
    	// Find user in the DB by email
        	Optional<User> optional = userRepository.findByEmail(newLoginObject.getEmail());
        // Reject if NOT present
        	System.out.println(">>>>>>>>>>>>>>>>>>>>");
        	if(!optional.isPresent()) {
        		result.rejectValue("email", "notmatch", "Login error: The Email or password wrong!");
        		return null ;
        	}
        	System.out.println(optional.get());
        	String passwordEntered = newLoginObject.getPassword();
        	User user = optional.get();
        // Reject if BCrypt password match fails
        	if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
        	    result.rejectValue("password", "Matches", "Invalid Password!");
        	}
        // Return null if result has errors
        	if(result.hasErrors()) {
                // Exit the method and go back to the controller 
                // to handle the response
                return null;
            }
        // Otherwise, return the user object
        	return user;
    }
}
