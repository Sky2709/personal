import StackTestingAkash.Stack;

import java.util.*;
public class Hashinggg {
//    public int solve(ArrayList<Integer> A) {
//    HashMap<Integer,Integer> map= new HashMap<>();
//    int ans= Integer.MAX_VALUE;
//    for (int i=0; i<=A.size()-1; i++){
//        if (!map.containsKey(A.get(i))){
//            map.put(A.get(i),i);
//        }
//        else {
//            int dist= i- map.get(A.get(i));
//            ans= Math.min(ans,dist);
//            map.put(A.get(i),i);
//        }
//    }
//        if(ans == Integer.MAX_VALUE)
//            return -1;
//        else
//            return ans;
//    }

//

//    public int solve(ArrayList<Integer> A) {
//    HashSet<Integer> map= new HashSet<>();
//    int sum=0;
//    for (int i=0; i<=A.size()-1; i++){
//        sum+= A.get(i);
//        if (A.get(i)==0 || sum==0 || map.contains(sum)){
//            return 1;
//        }
//        map.add(sum);
//    }
//    return 0;
//    }


//    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
//    HashMap<Integer,Integer> map= new HashMap<>();
//    int maxLength= 0;
//    int sum=0;
//    int index=-1;
//    int startIndex=0;
//    map.put(sum,index);
//    for (int i=0; i<= A.size()-1; i++){
//        sum+= A.get(i);
//        if (!map.containsKey(sum)){
//            map.put(sum,i);
//        }
//        else{
//            int len= i- map.get(sum);
//            if (len>maxLength){
//                maxLength=len;
//                startIndex= map.get(sum)+1;
//            }
//        }
//    }
//    ArrayList<Integer> ans= new ArrayList<>();
//    for (int i=0; i<maxLength; i++){
//         ans.add(i, A.get(i+startIndex));
//    }
//    return ans;
//    }


//    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
//        HashMap<Integer,Integer> map= new HashMap<>();
//        for(int val : A){
//            if(map.containsKey(val)){
//                map.put(val , map.get(val)+1);
//            }
//            else{
//                map.put(val , 1);
//            }
//        }
//       ArrayList<Integer> ans= new ArrayList<>();
//        for (int val : B){
//            if(map.containsKey(val)){
//                int frq= map.get(val);
//                while (frq !=0){
//                    ans.add(val);
//                    frq--;
//                }
//                map.remove(val);
//            }
//        }
//        ArrayList<Integer> rest= new ArrayList<>();
//        for (int val : A){
//            if (map.containsKey(val)){
//                rest.add(val);
//            }
//        }
//        Collections.sort(rest);
//        ans.addAll(rest);
//    return ans;
//    }


//    public static HashMap<Integer,Integer> solve(ArrayList<Integer> A){
//        HashMap<Integer,Integer> map= new HashMap<>();
//        for(int val : A){
//            if(map.containsKey(val)){
//                map.put(val , map.get(val)+1);
//            }
//            else{
//                map.put(val , 1);
//            }
//        }
//        return map;
//    }

//    public static void main(String[] args) {
//        ArrayList<Integer> A1= new ArrayList<>();
//        A1.add(3);
//        A1.add(7);
//        A1.add(5);
//        A1.add(3);
//        A1.add(8);
//        A1.add(8);
//        A1.add(9);
//        A1.add(7);
//        A1.add(5);
//        A1.add(6);
//        A1.add(8);
//        A1.add(4);
//        ArrayList<Integer> A2= new ArrayList<>();
//        A2.add(3);
//        A2.add(7);
//        A2.add(5);
//        System.out.println(solve(A1,A2));
//    }

//    public int solve(String A) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (char val : A.toCharArray()) {
//            map.put(val,(map.getOrDefault(val,0)+1));
//        }
//        int singleCnt=0;
//        for(char val: A.toCharArray()){
//            if (map.containsKey(val)){
//                if ((map.get(val) %2) !=0){
//                    singleCnt++;
//                    map.remove(val)
//                }
//            }
//        }
//        if(singleCnt>1){
//            return 0;
//        }
//        return 1;
//    }

//    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
//        long m= 1000000007;
//        HashMap<Integer,Integer> hA= new HashMap<>();
//        HashMap<Integer,Integer> hB= new HashMap<>();
//        int N= A.size();
//        for (int i=0; i<A.size(); i++){
//            hA.put(A.get(i), hA.getOrDefault(A.get(i),0)+1);
//            hB.put(B.get(i), hB.getOrDefault(B.get(i),0)+1);
//        }
//        int res=0;
//        for (int i=0; i< B.size();i++){
//            res = (int)((res + (1L*(hA.get(A.get(i))-1)*(hB.get(B.get(i))-1))%m)%m);
//        }
//        return res;
//    }

//    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
//        HashSet<String> setMap = new HashSet<>();
//        for (int i = 0; i < A.size(); i++) {
//            setMap.add(A.get(i).toString() + "@" + B.get(i).toString());
//        }
//        int count = 0;
//        for (int i = 0; i < A.size(); i++) {
//            int x1 = A.get(i);
//            int y1 = B.get(i);
//            for (int j = i + 1; j < B.size(); j++) {
//                int x2 = A.get(j);
//                int y2 = B.get(j);
//                if (x1 == x2 || y1 == y2) {
//                    continue;
//                }
//                String c1 = x1 + "@" + y2;
//                String c2 = x2 + "@" + y1;
//                if (setMap.contains(c1) && setMap.contains(c2)) {
//                    count++;
//                }
//            }
//        }
//        return (count / 2);
//    }
//    public static int gcd(int a, int b) {
//        if (b==0){
//            return a;
//        }
//        int c= a%b;
//        return gcd(b,c);
//    }
//
//    public int solve (ArrayList<Integer> A, ArrayList<Integer> B) {
//        if (A.size()<=2){
//            return A.size();
//        }
//
//
//    }
}
