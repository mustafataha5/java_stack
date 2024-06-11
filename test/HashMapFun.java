import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String,String> userMap = new HashMap<String,String>() ; 

        userMap.put("taha@mail.com","Taha Taha") ; 
        userMap.put("mustafa@mail.com", "Mustafa Taha"); 
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");

        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}
