package linkedListCycle;
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
public class Solution {
	 public static boolean hasCycle(ListNode head) {  
	     boolean cycle=false; 
	     if(head==null) return false;
    	 ListNode slow=head;
	     ListNode fast=head.next;     
	     while(fast!=null&&fast.next!=null){
		     if(fast.equals(slow)){
		       cycle=true;
		       break;
		     }
		     slow=slow.next;
		     fast=fast.next.next;
	     }
	    return cycle;
	       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ListNode A=new ListNode(1);
     ListNode B=new ListNode(2);
     ListNode C=new ListNode(3);
     ListNode D=new ListNode(4);
     //A=null;
   //  A.next=B;
    // B=null;
   // B.next=C;
   //  C.next=A;
     System.out.println(hasCycle(A));
	}

}
