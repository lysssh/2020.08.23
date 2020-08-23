/**
 * @author liye
 * @create 2020-07-26-20:14
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) {
         val = x;
     }
  }
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
public class Test {
    public static void main(String[] args) {

    }
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) {
            return;
        }
        ListNode start=head;
        ListNode end=head;
        while (end.next!=null&&end.next.next!=null) {
            start=start.next;
            end=end.next.next;
        }
        ListNode pre=start.next;
        start.next=null;
        ListNode pev=null;
        while (pre!=null) {
            if(pev==null) {
                pev=pre;
                pre=pre.next;
                pev.next=null;
            }else {
                ListNode preNext=pre.next;
                pre.next=pev;
                pev=pre;
                pre=preNext;
            }
        }
        start=head;
        pre=null;
        while (start!=null&&pev!=null) {
            if(pre==null) {
                pre=start;
                pre.next=pev;

            }
        }
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null) {
            return null;
        }
        ListNode start=head;
        ListNode end=head;
        while (end.next!=null&&end.next.next!=null) {
            start=start.next;
            end=end.next.next;
            if(start==end) {
                start=head;
                while (start!=end) {
                    start=start.next;
                    end=end.next;
                }
                return start;
            }
        }
        return null;
    }
    public boolean hasCycle(ListNode head) {
        if(head==null) {
            return false;
        }
        ListNode start=head;
        ListNode end=head;
        while (end!=null&&end.next!=null) {
            start=start.next;
            end=end.next.next;
            if(start==end) {
                return true;
            }
        }
        return false;
    }
}
