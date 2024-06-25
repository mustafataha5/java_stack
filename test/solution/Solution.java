import javax.naming.directory.DirContext;

class Solution {
    public ListNode deleteMiddle(ListNode head) {

        ListNode middel ,current ;
        current = head ; 
        middel = head;

        while(current !=null){
            System.out.print(">>>> "+current);
            if(current.next !=null && current.next.next !=null){
                current = current.next.next ;
            }
            else{
                current = current.next ;
            }
             
            middel  = middel.next ; 
        }
        System.out.println("\n>>>> "+middel.val);
       DirContext.getAttributes
        
        return head ;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,null);
        
    }
}