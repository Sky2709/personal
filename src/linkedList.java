class ListNode{
    int val;
    ListNode next;

    ListNode(int d){
        val=d;
        next=null;
    }


}
//public class linkedList {
//    public ListNode reverseList(ListNode A, int B) {
//        if (length(A)<B){
//            return A;
//        }
//        ListNode p=null;
//        ListNode c=A;
//        ListNode t=null;
//        int cnt=0;
//        while (cnt<B){
//            t=c.next;
//            c.next=p;
//            p=c;
//            c=t;
//        }
//        A.next=reverseList(c,B);
//        return p;
//
//    }
//
//    public static int length(ListNode A){
//        int cnt=0;
//        ListNode t=A;
//        while (t!=null){
//            cnt=cnt+1;
//            t=t.next;
//        }
//        return cnt;
//    }


//    public static ListNode reverseList(ListNode A) {
//        ListNode prev=null;
//        ListNode c=A;
//        ListNode temp=null;
//        while(c!=null){
//            temp=c.next;
//            c.next=prev;
//            prev=c;
//            c=temp;
//        }
//        return prev;
//    }


//    public ListNode reverseBetween(ListNode A, int B, int C) {
//        ListNode curr=A;
//        ListNode prev=null;
//        int i;
//        for (i=1; i<B; i++){
//            prev=curr;
//            curr=curr.next;
//        }
//
//        ListNode rtail=curr;
//        ListNode rhead=null;
//
//        while (i <= C) {
//            ListNode next = curr.next;
//            curr.next = rhead;
//            rhead = curr;
//            curr = next;
//            i++;
//        }
//
//        if (prev != null) {
//            prev.next = rhead;
//        }
//        else {
//            A = rhead;
//        }
//        rtail.next = curr;
//        return A;
//
//    }



//    public ListNode solve(ListNode A) {
//        ListNode fast=A;
//        ListNode slow=A;
//        ListNode slowPre=A;
//        int cnt=0;
//        if (fast.next==null){
//            return null;
//        }
//
//        while (fast != null && fast.next!=null){
//            cnt++;
//            slow=slow.next;
//            fast=fast.next.next;
//
//            if (cnt>=2){
//                slowPre=slowPre.next;
//            }
//        }
//
//        slowPre.next=slow.next;
//        slow.next=null;
//        return A;
//
//
//    }

//    public ListNode removeNthFromEnd(ListNode A, int B) {
//        ListNode fast=A;
//        ListNode slow=A;
//        for (int i=0; i<B; i++){
//            fast=fast.next;
//            if (fast==null){
//                return A.next;
//            }
//        }
//
//        while (fast.next!=null){
//            fast=fast.next;
//            slow=slow.next;
//        }
//
//        slow.next=slow.next.next;
//        return A;
//    }


//    public static ListNode mergeTwoLists(ListNode A, ListNode B) {
//        if (A==null){
//            return B;
//        }
//        if (B==null){
//            return A;
//        }
//
//        ListNode head;
//        if (A.val<B.val){
//            head=A;
//            head.next=mergeTwoLists(A.next,B);
//        }
//        else {
//            head=B;
//            head.next=mergeTwoLists(A,B.next);
//        }
//
//        return head;
//    }
//
//    public static ListNode mid(ListNode A) {
//        ListNode fast=A.next;
//        ListNode slow=A;
//
//        while (fast.next != null && fast.next.next !=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        return slow;
//    }
//
//
//    public ListNode sortList(ListNode A) {
//        if (A==null || A.next==null){
//            return A;
//        }
//
//        ListNode mid= mid(A);
//
//        ListNode a= A;
//        ListNode b=mid.next;
//        mid.next=null;
//
//        a=sortList(a);
//        b=sortList(b);
//
//        return mergeTwoLists(a,b);
//      }


//    public ListNode deleteDuplicates(ListNode A) {
//        if (A==null){
//            return A;
//        }
//
//        ListNode current= A;
//        while (current != null && current.next.next != null){
//            if (current.val==current.next.val){
//                ListNode nextToNext= current.next.next;
//                current.next= nextToNext;
//            }
//            else {
//                current=current.next;
//            }
//        }
//        return A;
//    }


//    public ListNode detectCycle(ListNode a) {
//        if(a==null ||a.next==null){
//            return null;
//        }
//        ListNode slow=a;
//        ListNode fast=a;
//
//        while (fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if (slow==fast){
//                ListNode meet=slow;
//                ListNode start=a;
//                while (start!=meet){
//                    start=start.next;
//                    meet=meet.next;
//                }
//                return start;
//            }
//        }
//        return null;
//    }
//
//
//
//    public int lPalin(ListNode A) {
//
//    }

//    class ListNode {
//        int val;
//        ListNode right, down;
//        ListNode(int x) {
//            val = x;
//            right = down = null;
//        }
//    }
//
//    ListNode flatten(ListNode root) {
//        if (root==null || root.right==null){
//            return root;
//        }
//
//        root.right=flatten(root.right);
//
//        root=merge(root,root.right);
//
//        return root;
//
//    }
//
//    ListNode merge( ListNode a, ListNode b){
//        if (a==null){
//            return b;
//        }
//        if (b==null){
//            return a;
//        }
//
//        ListNode result;
//
//        if (a.val<b.val){
//            result=a;
//            result.down=merge(a.down,b);
//        }
//
//        else{
//            result=b;
//            result.down=merge(a,b.down);
//        }
//
//        result.right=null;
//        return result;
//    }


//      public ListNode partition(ListNode A, int B) {
//          ListNode smallerHead = null, smallerLast = null;
//          ListNode greaterLast = null, greaterHead = null;
//          ListNode equalHead = null, equalLast = null;
//
//          while (A!=null) {
//              if (A.val == B){
//                  if (equalHead == null) {
//                      equalHead=equalLast=A;
//                  }
//                  else {
//                      equalLast.next=A;
//                      equalLast=equalLast.next;
//                  }
//              }
//              else if (A.val<B) {
//                  if (smallerHead == null)
//                      smallerLast = smallerHead = A;
//                  else {
//                      smallerLast.next = A;
//                      smallerLast = A;
//                  }
//              }
//              else{
//                  if (greaterHead == null)
//                      greaterLast = greaterHead = A;
//                  else {
//                      greaterLast.next = A;
//                      greaterLast = A;
//                  }
//              }
//              A=A.next;
//          }
//
//          if (greaterLast != null) {
//              greaterLast.next = null;
//          }
//
//          if (smallerHead == null) {
//              if (equalHead == null) {
//                  return greaterHead;
//              }
//              equalLast.next = greaterHead;
//              return equalHead;
//          }
//          if (equalHead == null) {
//              smallerLast.next = greaterHead;
//              return smallerHead;
//          }
//
//          smallerLast.next = equalHead;
//          equalLast.next = greaterHead;
//          return smallerHead;
//
//
//      }
//}
