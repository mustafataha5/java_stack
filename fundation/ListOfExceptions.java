import java.util.ArrayList;

public class ListOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                    Integer castedValue = (Integer) myList.get(i);
                    System.out.println(castedValue);

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println( "Can not cast at ["+i+"]  = "+myList.get(i)+"  Type:"+ myList.get(i).getClass());
            }
        }

    }

}
