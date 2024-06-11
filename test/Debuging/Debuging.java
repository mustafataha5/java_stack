package Debuging;

import java.util.ArrayList;
public class Debuging {
    public static void main(String[] args){
        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");
        System.out.println(snacks);
        for(int i=0; i<snacks.size(); i++) {
            System.out.println(String.format("i = %d AND snack = %s", i, snacks.get(i)));
            if(snacks.get(i).charAt(0) == 'A') {
                System.out.println(String.format("i = %d AND we are removing %s", i, snacks.get(i))); 
                snacks.remove(i);
                i--;
            }
        }
        System.out.println(snacks);
    }
}