public class GreetingTest{
    public static void main (String [] args){
        Greeting greet = new Greeting(); 
        String dateMassage = greet.getCurrentDate();
        System.out.println(dateMassage);
    }
}