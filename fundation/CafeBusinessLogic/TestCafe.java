//package CafeBusinessLogic;

import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafe = new CafeUtil(); 
        double [] prices= {2,5,4,3,7,8,10} ; //new  double[6];
        ArrayList<String> menu = new ArrayList<String>() ;
        ArrayList<Double> pricesArrayList = new ArrayList<Double>() ; 
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        pricesArrayList.add(5.0);
        pricesArrayList.add(7.0);
        pricesArrayList.add(10.0);
        pricesArrayList.add(15.0);


        System.out.println(cafe.getStreakGoal(5));
        System.out.println(cafe.getOrderTotal(prices));
        cafe.displayMenu(menu);

        ArrayList<String> customer=new ArrayList<String>();
        customer.add("mustafa");
        customer.add("laith");
        cafe.addCustomer(customer);
       // System.out.println(customer);
        // String productName = "latte" ;
        // double price = 10 ; 
        // int maxQuantity = 4 ; 
        cafe.printPriceChart("latte",10, 4);
       // cafe.printPriceChart(productName, price, maxQuantity);
       cafe.displayMenu(menu, pricesArrayList); 
    }

    
}
