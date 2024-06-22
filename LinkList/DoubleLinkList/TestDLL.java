



public class TestDLL {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(30);
        Node n5 = new Node(20);
        Node n6 = new Node(10);
        
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);
        dll.printValuesForward();
         System.out.println("-------------------------------110 0");
         dll.insertAt(new Node(110),3);
         dll.insertAt(new Node(110),3);
        dll.printValuesForward();
         System.out.println("size >> "+dll.getnumOfNode());
        // System.out.println("-------------------------------130 3");
        // dll.insertAt(new Node(130),3);
        // dll.printValuesForward();
        // System.out.println("size >> "+dll.getnumOfNode());
        // System.out.println("------------------------------- 180 8");
        // dll.insertAt(new Node(180),8);
        // dll.printValuesForward();
        // System.out.println("size >> "+dll.getnumOfNode());
        // System.out.println("-------------------------------150 6");
        // dll.insertAt(new Node(150),6);
        // dll.printValuesForward();
        // System.out.println("size >> "+dll.getnumOfNode());
        // System.out.println("-------------------------------removeAt 6");
        // dll.removeAt(6);
        // dll.printValuesForward();
        System.out.println("isPalindorm >> "+dll.isPalindrome());
        // dll.printValuesForward();
        // dll.printValuesBackward();
        // System.out.println("size >> "+dll.getnumOfNode());
        // System.err.println("pop :"+dll.pop().value);

        // dll.printValuesForward();
        // System.out.println("size >> "+dll.getnumOfNode());
    }
}
