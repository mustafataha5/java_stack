import java.util.ArrayList;

public class ArrayListTest {
    
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<Integer>() ; 


        System.out.println(mylist);
        mylist.add(1);
        mylist.add(5);
        mylist.add(3);
        mylist.add(2);
        mylist.add(10);
        mylist.add(8);
        System.out.println(mylist+"  Size:"+mylist.size());
        mylist.sort(null);
        System.out.println(mylist+"  Size:"+mylist.size());System.out.println(mylist+"  Size:"+mylist.size());
        System.out.println(mylist.indexOf(8));
        Integer a = 5 ; 
        mylist.remove(a);
        System.out.println(mylist+"  Size:"+mylist.size());

    }
}
