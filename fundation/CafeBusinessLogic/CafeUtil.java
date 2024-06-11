//package CafeBusinessLogic;

import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal(){
        int sum =0 ;
        for(int i=0;i<=10;i++){
            sum +=i ; 
        }
        return sum ;
    }
    public int getStreakGoal(int numOfWeek){
        int sum =0 ;
        for(int i=0;i<=numOfWeek;i++){
            sum +=i ; 
        }
        return sum ;
    }
    public double getOrderTotal(double[] prices){
        double total =0;
        for(int y=0;y<prices.length;y++){
            total = total+prices[y];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int x=0 ; x < menuItems.size(); x++){
            System.out.println(x+"  "+menuItems.get(x));
        }
         
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("hello" + username);
      //  String str = String.format("There are %d people in front of you", customers.size())
        System.out.println("There are "+ customers.size()+" people in front of you");
        customers.add(username);
        System.out.println(customers);
    }
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        double total = 0 ; 
        for(int z=1;z<=maxQuantity;z++){
            //System.out.println(z+" - $"+(price*z));
            total = (z*price) -((z-1)*.5);
            System.out.format("%d - $ %.2f\n",z,total);
        }
    }
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size()==prices.size()){
            for(int x=0;x<menuItems.size();x++){
                System.out.println(x+" "+menuItems.get(x)+" -- $"+ prices.get(x)) ;
            }
            return true ; 
        }
        return false ; 
    }
}
