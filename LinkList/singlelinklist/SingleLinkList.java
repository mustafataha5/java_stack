public class SingleLinkList {
    private Node head ; 

    public SingleLinkList(){
        this.head = null ; 
    }

    public void add(int value){
        Node newNode = new Node(value) ; 

        if(this.head == null){
            head = newNode ; 
        } else {
            Node temp = head ; 
            while(temp.next !=null){
                temp = temp.next ; 
            }
            temp.next = newNode ; 
        }
    }

    public void remove(){
        if(head == null){
            System.err.println("Nothing to remove : List is empty");
        } else if (head.next == null){
            head = null ; 
        } else {
            Node temp = head ; 
            while(temp.next.next !=null){
                temp = temp.next ; 
            }
            temp.next = null; 
        }
    }

    public void removeAt(int n){
        if(head == null){
            System.err.println("Nothing to remove : List is empty");
        }
        else{
            Node temp = head ; 
            if(n == 0){
                head = head.next ; 
                temp.next = null ; 
                temp = null ; 
            }
            else{
                try {
                for(int i =0 ; i <n-1 ;i++){
                    temp=temp.next ;
                } 
            System.out.println(">>> "+temp.value);
            Node delNode = temp.next ;      
            temp.next = temp.next.next ;
            delNode.next=null ; 
            delNode=null ;
            }
            catch(Exception ex){
                System.out.println("Out of range");
            } 
          }
        }
    }

    public Node findN(int key){
        if(head == null){
            System.err.println("Nothing to print : List is empty");
            return null ; 
        } else {
            Node temp = head ; 
            while(temp !=null ){
                if(temp.value == key){
                    return temp ; 
                }
                temp = temp.next;
            } 
            return null ; 
        }
    }

    public void printValues() {
        if(head == null){
            System.err.println("Nothing to print : List is empty");
        } else {
            Node temp = head ; 
            while(temp !=null){
                System.out.print(""+temp.value+"-->"); 
                temp = temp.next;
            } 
            System.out.println("Null");
        }
    }
    
    private class Node {
         int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SingleLinkList list = new SingleLinkList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printValues(); // 1-->2-->3-->Null

        list.remove();
        list.printValues(); // 1-->2-->Null

        Node found = list.findN(2);
        if (found != null) {
            System.out.println("Found node with value: " + found.value); // Found node with value: 2
        } else {
            System.out.println("Node not found");
        }

        found = list.findN(3);
        if (found != null) {
            System.out.println("Found node with value: " + found.value);
        } else {
            System.out.println("Node not found"); // Node not found
        }
    }
}
