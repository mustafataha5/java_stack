import javax.swing.text.StyledEditorKit;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 5.5 ; 
        double lattePice = 4.5 ;
        double cappuccinoPrice = 5 ; 
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam" ; 
        String customer3 = "Jimmy" ; 
        String customer4 =  "Noah" ; 
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false ; 
        boolean isReadyOrder3 = false ; 
        boolean isReadyOrder4 = true ; 

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println("The  Total price of coffe: 1x"+ dripPrice+" = "+dripPrice+"$");
        if(isReadyOrder1 ){
            System.out.println(customer1+" "+readyMessage);
        }
        else{
            System.out.println(customer1+" "+pendingMessage);
        }

        System.out.println(generalGreeting + customer4);
        System.out.println("The  Total price of Cappuccino : 1x"+ cappuccinoPrice+" = "+cappuccinoPrice+"$");
        if(isReadyOrder4 ){
            System.out.println(customer4+" "+readyMessage);
            
        }
        
        else{
            System.out.println(customer2+" "+pendingMessage);
        }


        System.out.println(generalGreeting + customer2);
        System.out.println("The  Total price of Latte : 2x"+lattePice+" = "+lattePice*2+"$");
        isReadyOrder2 = !isReadyOrder2 ; 
        if(isReadyOrder2 ){
            System.out.println(customer2+" "+readyMessage);
            
        }
        
        else{
            System.out.println(customer2+" "+pendingMessage);
        }

        System.out.println(generalGreeting + customer3);
        System.out.println("The  Total price of Latte : 1x"+dripPrice+" = "+dripPrice*1+"$");
        System.out.println("We are sorry youe order  was  latte not coffe, The diffrence between the  Prices "+(lattePice-dripPrice)+"$");
        if(isReadyOrder3){
            System.out.println(customer3+" "+readyMessage);
            
        }
        
        else{
            System.out.println(customer3+" "+pendingMessage);
        }

    }
}
