import java.util.ArrayList;

public class twoPointers {

//    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
//        int p1=0;
//        int p2=0;
//        long curSum= A.get(0);
//        ArrayList<Integer> answer= new ArrayList<>();
//        answer.add(-1);
//        while (p1 < A.size() && p2 < A.size()){
//            if (curSum==B){
//                answer.clear();
//                for (int i=p1; i<= p2; i++ ){
//                    answer.add(A.get(i));
//                }
//                return answer;
//            }
//            else if (curSum<B && p2 < A.size()-1) {
//                p2++;
//                curSum += A.get(p2);
//            }
//            else {
//                curSum -= A.get(p1);
//                p1++;
//            }
//        }
//        return answer;
//    }
}
