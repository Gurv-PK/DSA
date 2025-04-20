
public class LinkedListPalindrome{

     public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }

    public boolean isPalindrome(ListNode head){
        StringBuilder org = new StringBuilder();
        int size =0;
        while(head!=null){
            org.append(head.val);
            head = head.next;
            size++;
        }

        if(size == 1)
        {
            return true;
        }
        else{
            if(size<3)
            {
                return false;
            }
            else{
                return org.toString()==org.reverse().toString();
            }
        }
    }

    public static void main(String[] args) {
        
    }
    
}