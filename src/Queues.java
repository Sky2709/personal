import java.util.*;

//import static sun.jvm.hotspot.code.CompressedStream.L;

public class Queues {
//    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
//        Queue<Integer> q= new LinkedList<Integer>();
//        int n= A.size();
//        for (int i=0; i<n; i++){
//            q.add(A.get(i));
//        }
//
//        Stack<Integer> stk= new Stack<>();
//        for (int i=0;i<B; i++){
//            stk.push(q.remove());
//        }
//
//        ArrayList<Integer> ans= new ArrayList<>();
//        while (!stk.empty()){
//            ans.add(stk.pop());
//        }
//        while (q.size()!=0){
//            ans.add(q.remove());
//        }
//
//        return ans;
//
//    }

//    public String solve(int A) {
//        Queue<String> q= new LinkedList<>();
//        q.add("11");
//        q.add("22");
//
//        while(A-1!=0){
//            String str= q.peek();
//            int size= str.length();
//
//            String s1= str.substring(0,size/2);
//            String s2= str.substring(size/2,size);
//
//            q.add(s1+ "11" +s2);
//            q.add(s1+ "22" +s2);
//
//            q.remove();
//            A--;
//        }
//
//        return q.peek();
//
//    }
//
//    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
//        Queue<Integer> q= new LinkedList<>();
//        int count=0;
//        for (int i=0; i<A.size(); i++){
//            q.add(A.get(i));
//        }
//
//        for (int i=0; i<B.size();i++){
//            while (B.get(i)!=q.peek()){
//                count++;
//                int no=q.peek();
//                q.remove();
//                q.add(no);
//            }
//            count++;
//            q.remove();
//        }
//
//        return count;
//    }
//
//    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
//        Deque<Integer> dq= new LinkedList<>();
//        ArrayList<Integer> ans= new ArrayList<>();
//
//
//        for (int i=0; i<A.size(); i++){
//            if (i>=B){
//                if (A.get(i-B)==dq.peek()){
//                    dq.removeFirst();
//                }
//            }
//            if (dq.isEmpty()==false && A.get(i)>dq.getLast()){
//                while (dq.isEmpty()==false && dq.getLast()<A.get(i)){
//                    dq.removeLast();
//                }
//            }
//            dq.add(A.get(i));
//            if( ( i+1 ) >= B )
//            {
//                ans.add(dq.peek());
//            }
//        }
//        return ans;
//    }

//    public String solve(String A) {
//        HashMap<Character,Integer> map= new HashMap<>();
//        Deque<Character> q= new LinkedList<>();
//        StringBuilder str= new StringBuilder();
//        for (int i=0; i<A.length();i++){
//            q.add(A.charAt(i));
//            map.put(A.charAt(i), map.getOrDefault(A.charAt(i), 0) + 1);
//
//            while (!q.isEmpty() && map.get(q.peek()) > 1){
//                q.remove();
//            }
//            if (!q.isEmpty()){
//                str.append(q.peek());
//            }
//            else {
//                str.append("#");
//            }
//        }
//        return str.toString();
//    }


//    public int solve(ArrayList<Integer> A, int B) {
//        long maxSum = 0 L;
//        long minSum = 0 L;
//        long total = 0 L;
//        int aLen = A.size();
//        Deque<Integer> deque = new ArrayDeque();
//        int window_start = 0;
//        int modulo = 1000 * 1000 * 1000 + 7;
//
//        for (int window_end = 0; window_end < aLen; window_end++) {
//            while (!deque.isEmpty() && deque.peekLast() < A.get(window_end)) {
//                deque.pollLast();
//            }
//
//            deque.offerLast(A.get(window_end));
//
//            if (window_end - window_start + 1 >= B) {
//                int max = deque.peekFirst();
//                maxSum = ((maxSum % modulo) + (max % modulo)) % modulo;
//
//                if (max == A.get(window_start)) {
//                    deque.pollFirst();
//                }
//
//                window_start++;
//            }
//
//        }
//
//        window_start = 0;
//        deque = new ArrayDeque();
//
//        for (int window_end = 0; window_end < aLen; window_end++) {
//            while (!deque.isEmpty() && deque.peekLast() > A.get(window_end)) {
//                deque.pollLast();
//            }
//
//            deque.offerLast(A.get(window_end));
//
//            if (window_end - window_start + 1 >= B) {
//                int min = deque.peekFirst();
//                minSum = ((minSum % modulo) + (min % modulo)) % modulo;
//
//                if (min == A.get(window_start)) {
//                    deque.pollFirst();
//                }
//
//                window_start++;
//            }
//        }
//
//        total = (maxSum % modulo + minSum % modulo) % modulo;
//        return (int)(total + modulo) % modulo;
//    }
}
