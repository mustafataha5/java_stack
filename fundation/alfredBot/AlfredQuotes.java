import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class AlfredQuotes{

    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?"; 
    }
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, "+ name+". Lovely to see you.";
    }
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return "Good "+dayPeriod+" ,  "+ name+". Lovely to see you.";
    }
    public String guestGreeting(){
       
        String dayPeriod = "" ; 
         Date now = new Date();
        SimpleDateFormat day = new SimpleDateFormat("HH") ;
        int hour = Integer.parseInt(day.format(now)) ; 
        if (hour == 12){
            dayPeriod = "noon" ; 
        }
        else if (hour >=9 &&  hour <  12){
            dayPeriod = "morning" ; 
        }
        else if (hour > 12 &&  hour <  17){
            dayPeriod = "afternoon" ; 
        }
        else if (hour >=17 &&  hour <  21){
            dayPeriod = "evening" ; 
        }
        else if (hour >=21 &&  hour <  24){
            dayPeriod = "night" ; 
        }
        else if (hour >=0 &&  hour <  9){
            dayPeriod = "early morning" ; 
        }

        return String.format("Good %s Sir.",dayPeriod) ;  
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date() ; 
        return String.format("It is currently %s",date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE 
        int alex = conversation.indexOf("Alexis") ;
        if (alex >=0){  
            return  "Right away, sir. She certainly isn't sophisticated enough for that." ; 
        } 
        int alfred = conversation.indexOf("Alfred") ;
        if (alfred>=0){  
            return  "At your service. As you wish, naturally." ; 
        }
        return "Right. And with that I shall retire." ;
    }

    public  String isAngry(String angry){
        if (angry.equals("angry")) {
            return ("Alferd is "+angry);
        }
        else {
            return ("Alferd is "+angry);
        }
    }
}




