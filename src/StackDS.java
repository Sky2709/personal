import java.util.Collections;
import java.util.Stack;
import java.util.ArrayList;


public class StackDS {
//    public int solve(String A) {
//        Stack<Character> s= new Stack<>();
//        int n=A.length();
//
//        s.push(A.charAt(0));
//        for (int i=1; i<n; i++){
//            if (!s.empty() &&
//                    ((s.peek()=='{' && A.charAt(i)=='}') ||
//                    (s.peek()=='(' && A.charAt(i)==')') ||
//                    (s.peek()=='[' && A.charAt(i)==']')))
//            {
//                s.pop();
//            }
//            else {
//                s.push(A.charAt(i));
//            }
//        }
//        if (s.empty()){
//            return 1;
//        }
//        return 0;
//
//    }
//
//

//
//
//    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
//        Stack<Integer> stk= new Stack<>();
//        ArrayList<Integer> output= new ArrayList<>();
//
//        for (int i=0; i<A.size(); i++){
//            int x=A.get(i);
//            while (!stk.empty() && A.get(stk.peek())>= x){
//                stk.pop();
//            }
//            if (stk.empty()){
//                output.add(-1);
//            }
//            else {
//                output.add(stk.peek());
//            }
//            stk.push(i);
//        }
//
//        return output;
//    }
//
//    public static ArrayList<Integer> nextSmaller(ArrayList<Integer> A) {
//        Stack<Integer> stk= new Stack<>();
//        ArrayList<Integer> output= new ArrayList<>();
//
//        for (int i=A.size()-1; i>=0; i--){
//            int x=A.get(i);
//            while (!stk.empty() && A.get(stk.peek()) >= x){
//                stk.pop();
//            }
//            if (stk.empty()){
//                output.add(A.size());
//            }
//            else {
//                output.add(stk.peek());
//            }
//            stk.push(i);
//        }
//        Collections.reverse(output);
//        return output;
//    }

//    public static int largestRectangleArea(ArrayList<Integer> A) {
//        int n=A.size();
//        if (n==1){
//            return A.get(0);
//        }
//        ArrayList<Integer> prev=prevSmaller(A);
//        ArrayList<Integer> next=nextSmaller(A);
//
//        int ans= Integer.MIN_VALUE;
//        for (int i=0; i<n; i++){
//            int val=next.get(i)-prev.get(i)-1;
//            ans= Math.max(ans,val*A.get(i));
//        }
//        return ans;
//
//    }
//
//    public int solve(ArrayList<ArrayList<Integer>> A) {
//        ArrayList<Integer> curRow=A.get(0);
//        int maxAns= largestRectangleArea(curRow);
//        for (int i=1; i<A.size();i++){
//            for (int j=0; j<A.get(0).size(); j++){
//                if (A.get(i).get(j)==1){
//                    curRow.set(j,curRow.get(j)+1);
//                }
//                else {
//                    curRow.set(j,0);
//                }
//            }
//            int curAns=largestRectangleArea(curRow);
//            maxAns=Math.max(curAns,maxAns);
//        }
//
//        return maxAns;
//    }

//    public String solve(String A) {
//        Stack<Character> stk= new Stack<>();
//        for (int i=0; i<A.length();i++){
//            if (!stk.isEmpty() && stk.peek()==A.charAt(i)){
//                stk.pop();
//            }
//            else {
//                stk.push(A.charAt(i));
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        while( !stk.isEmpty()){
//            sb.append(stk.peek());
//            stk.pop();
//        }
//        sb.reverse();
//        return sb.toString();
//    }


    public static ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        Stack<Integer> stk= new Stack<>();
        ArrayList<Integer> output= new ArrayList<>();

        for (int i=A.size()-1; i>=0; i--){
            int x= A.get(i);
            while (!stk.empty() && stk.peek()<=x){
                stk.pop();
            }
            if (stk.empty()){
                output.add(-1);
            }
            else {
                output.add(stk.peek());
            }
            stk.push(i);
        }
        Collections.reverse(output);
        return output;

    }
    public static ArrayList<Integer> prevGreater(ArrayList<Integer> A) {
        Stack<Integer> stk= new Stack<>();
        ArrayList<Integer> output= new ArrayList<>();

        for (int i=0; i<A.size(); i++){
            int x= A.get(i);
            while (!stk.empty() && stk.peek()<=x){
                stk.pop();
            }
            if (stk.empty()){
                output.add(-1);
            }
            else {
                output.add(stk.peek());
            }
            stk.push(i);
        }
        return output;

    }



}
