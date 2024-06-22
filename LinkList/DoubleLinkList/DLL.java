public class DLL {

    public Node head;
    public Node tail;
    private static int numOfNode = 0;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    public static int getnumOfNode() {
        return numOfNode;
    }

    public int size() {
        return numOfNode;
    }

    // the push method will add a new node to the end of the list
    public void push(Node newNode) {
        // if there is no head in the list, aka, an empty list, we set the newNode to be
        // the head and tail of the list
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            numOfNode++;
            return;
        }

        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we
        // found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.prev = lastNode;
        this.tail = newNode;
        numOfNode++;
    }

    public Node pop() {
        if (tail == null) {
            System.err.println("DLL is Empty");
            numOfNode = 0;
            return null;
        } else {
            Node temp = this.tail;
            this.tail = temp.prev;
            temp.prev = null;
            tail.next = null;
            numOfNode--;
            return temp;
        }
    }

    public boolean contains(Integer value) {
        if (this.tail == null) {
            System.out.println("DLL is Empty");
            return false;
        } else {
            Node current = this.head;

            while (current != null) {
                if (current.value == value) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }

    public void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;

        // while the current node exists...
        while (current != null) {
            // print its value
            System.out.print(current.value + " --> ");
            // and move on to its next node.
            current = current.next;
        }
        System.out.println("Null");
    }

    void printValuesBackward() {
        Node current = this.tail;

        // while the current node exists...
        while (current != null) {
            // print its value
            System.out.print(current.value + " --> ");
            // and move on to its next node.
            current = current.prev;
        }
        System.out.println("Null");
    }

    public void insert(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
            numOfNode++;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            numOfNode++;
        }
    }

    public void insertAt(Node newNode, int index) {
        if (index == 0) {
            this.insert(newNode);
        } else if (index == numOfNode) {
            this.push(newNode);
        } else {
            try {
                Node temp;
                if (index < (numOfNode ) / 2) {
                    temp = head;
                    for (int i = 0; i < index - 1; i++) {
                        temp = temp.next;
                    }
                } else {
                    temp = tail;
                    for (int i = numOfNode; i > (index  ); i--) {  
                        temp = temp.prev;
                    }
                }
                
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev =newNode ; 
                temp.next = newNode;
            
                numOfNode++;
            } catch (Exception ex) {
                System.out.println("inserteAt : Out of range index:"+index);
            }
        }
    }

    public void shift(){
        if(head == null){
            System.out.println("DLL is Empty");
        }
        else{
            Node temp =head ; 
            head = head.next ; 
            head.prev = null ; 
            temp.next=null ; 
            numOfNode-- ; 
        }
    }
    public void removeAt( int index) {
        if (index == 0) {
            this.shift();
        }
        else if(index >= numOfNode){
            System.out.println("removeAt : Out of range index:"+index);
        } 
        else if (index == numOfNode-1) {
            this.pop();
        } else {
            try {
                Node temp;
                if (index < (numOfNode ) / 2) {
                    temp = head;
                    for (int i = 0; i < index ; i++) {
                        temp = temp.next;
                    }
                } else {
                    temp = tail;
                    for (int i = numOfNode-1; i > (index); i--) {
                        
                        temp = temp.prev;
                    }
                    
                }
                Node myprev = temp.prev ; 
                Node mynext = temp.next ; 
                myprev.next = mynext ; 
                mynext.prev = myprev ; 
                temp.next = null ;
                temp.prev = null ; 
                numOfNode--;
            } catch (Exception ex) {
                System.out.println("removeAt : Out of range index:"+index);
            }
        }
    }

    public boolean isPalindrome(){
        Node temp1,temp2 ;
        int count = 0  ;  
        temp1 = head ; 
        temp2 = tail ; 
        while(count < numOfNode/2){
            if(temp1.value != temp2.value){
                return false ; 
            }
            temp1=temp1.next; 
            temp2=temp2.prev;
            count++;
        }
        return true ; 
    }
}