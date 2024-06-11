import java.util.ArrayList;
import java.util.Random;

public class Puzzle {
    
// To use methods from the Random library you will need to create an instance of Random
    
   public ArrayList<Integer>  getTenRolls(){
        Random randMachine = new Random();
        //randMachine.setSeed(35679);
        ArrayList<Integer> arr = new ArrayList<Integer>() ; 
        for(int i = 0 ; i<10;i++){
             arr.add(randMachine.nextInt(1000));
        }
        return arr ; 
   }

   public String getRandomLetter(){
    char [] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                     'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'} ; 
    Random randMachine = new Random();
   // randMachine.setSeed(35679); 
    String letter = "" ;                 
    for(int i=0;i<randMachine.nextInt(50);i++){
        letter += alpha[randMachine.nextInt(26)] ; 
    }
    return letter; 
   }
   public String getRandomLetter(int size){
    char [] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                     'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'} ; 
    Random randMachine = new Random();
   // randMachine.setSeed(35679); 
    String letter = "" ;                 
    for(int i=0;i<size;i++){
        letter += alpha[randMachine.nextInt(26)] ; 
    }
    return letter; 
   }

   public String generatePassword(){
     return getRandomLetter(8); 
   }

   public ArrayList<String> getNewPasswordSet(int size){
    ArrayList<String> words = new ArrayList<String>() ; 
    for(int i =0 ;i < size ; i++){
        words.add(generatePassword()) ; 
    }
    return words ; 
   }
   public ArrayList<Integer> shuffleArray( ArrayList<Integer> myarray,int numOfShuffle){
        Random randMachine = new Random();
        // randMachine.setSeed(35679); 
        Integer temp =  0 ; 
        int x,y,size = myarray.size() ; 
        for(int i = 0 ;i< numOfShuffle; i++){
            x = randMachine.nextInt(size) ; 
            y = randMachine.nextInt(size) ; 
            temp = myarray.get(x);
            myarray.set(x, myarray.get(y)); 
            myarray.set(y, temp) ; 
        }
        return myarray; 

   }
}
