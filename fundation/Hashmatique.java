import java.util.HashMap; 
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args) {
            HashMap<String,String>  trackList = new  HashMap<String,String>() ; 
            trackList.put("Imagine", "Imagine there's no heaven\n" + //
                                "It's easy if you try\n" + //
                                "No hell below us\n" + //
                                "Above us only sky");

            trackList.put("Bohemian Rhapsody","Is this the real life?\n" +"Is this just fantasy?");
            trackList.put("Hotel California", "Welcome to the Hotel California");
            trackList.put("Like a Rolling Stone","How does it feel\n" + //
                                "To be without a home\n" + //
                                "Like a complete unknown\n" + //
                                "Like a rolling stone?");

            System.out.println("ashMap('Imagine') : "+trackList.get("Imagine"));
            System.out.println(" ------------------------->Task 2 ");
            Set<String> keys = trackList.keySet() ; 

            for(String key : keys){
                System.out.println("Tilte : "+key);
                System.out.println("lyrics : \n"+trackList.get(key));
                System.out.println(" ................................");
            }
    }    
}
