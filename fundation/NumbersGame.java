import java.util.Random;

public class NumbersGame {
    public static void main(String[] args) {
        
        int end = 0 ;  
        while (end != -1 ){
        System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
        System.out.println("*********************************************************");
        System.out.println("Can you guess the number?");
        System.out.println("If you are not up to the task, you can always type 'q' to quit.");
        
        int answer = new Random().nextInt(0, 10);
        int counter = 0 ;
        while (counter <= 3) {
           
            String guess = System.console().readLine();
            try {
                if (guess.equals("q")) {
                    end = -1 ; 
                    System.out.println("I knew you didn't have it in you.");
                    System.out.println("Shutting down...");
                    break;
                }
                int num_guess = Integer.parseInt(guess) ;
                if ( num_guess== answer) {
                    System.out.println("Lucky guess! But can you do it again?");
                    break;
                }
                else if (num_guess < 0 || num_guess >10){
                    System.out.print("Invalid input its range [0 - 10]");
                } 
                else {
                    System.out.print("Swing and a miss! ");
                }
            } catch (NumberFormatException e) {
                System.out.print(guess+"  is not Number ");
            }
            finally{
                System.out.println(String.format("!!! Keep trying... Counter %d:3",counter));
                counter ++ ; 
            }
        }
        System.out.println("Game over. Shutting down...");
    }
  }
}
