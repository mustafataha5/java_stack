public class Tester {
    public static void main(String[] args) {
        SingleLinkList sll = new SingleLinkList();
        sll.add(3);
        sll.printValues();
        sll.add(4);
        sll.printValues();
        sll.add(10);
        sll.printValues();
        sll.add(5);
        sll.printValues();
        sll.add(15);
        sll.printValues();
        sll.add(2);
        sll.printValues();
        sll.remove();
        sll.printValues();
        sll.remove();
        sll.printValues();
        // System.out.println(sll.findN(10));
        // System.out.println(sll.findN(15));
        // System.out.println(sll.findN(5));
        //sll.removeAt(0);
        //sll.printValues();

        sll.removeAt(6);
        sll.printValues();
        sll.removeAt(2);
        sll.printValues();

    }
}
