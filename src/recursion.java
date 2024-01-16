import java.util.ArrayList;
import java.util.Scanner;

public class recursion {

   /* static ArrayList<ArrayList<Integer>> result= new ArrayList<>();
    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
         int s=1;
         int t=2;
         int d=3;
         compute(A,s,t,d);
         return result;


    }

    public static void compute(int N, int start, int temp, int destination){
        if (N==0){
            return;
        }

        compute(N-1, start, destination, temp);
        ArrayList<Integer> tempList= new ArrayList<>();
        tempList.add(N);
        tempList.add(start);
        tempList.add(destination);
        result.add(tempList);

        compute(N-1,temp, start, destination);
    }

    public static int tower(int A){
        if(A==1){
            return 1;
        }
        return 1+ 2 * tower(A-1);
        //return tower(1<<A-1) ;
    }*/


    public static void starPattern(int r, int c){
        if (r==0){
            return;
        }

        if (c<r){
            System.out.print("*");
            starPattern(r,c+1);
        }
        else {
            System.out.println();
            starPattern(r-1,0);
        }
    }

     public static boolean sortedArray(int []array, int index){
        if (index==array.length-1){
            return true;
        }

        return array[index] <array[index+1] && sortedArray(array,index+1);
    }
        public static int count(int n){
        return helper(n, 0 );
       }
    public static int helper(int n, int c){
        if (n==0){
            return c;
        }
        int rem= n%10;
        if (rem==0){
            return helper(n/10, c+1);
        }
        return helper(n/10,c);

    }

    public static void decreasing(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        decreasing(n-1);
    }

    public static void increasing(int n){
        if(n==0){
            return;
        }
        increasing(n-1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n<=1){
            return n;
        }

        return n * factorial(n-1);
    }

    public static int sumOfNum(int n){
        if (n==0){
            return 0;
        }

        return n+sumOfNum(n-1);
    }

    public static int sumOfDigit(int n){
        if (n==0){
            return 0;
        }

        int m=n%10;
        return m + sumOfDigit(n/10);
    }


    public static int productOfDigit(int n){
        if (n%10==n){
            return n;
        }

        int m=n%10;
        return m * productOfDigit(n/10);
    }


    public static void skipA(String pro, String unPro){
        if (unPro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch=unPro.charAt(0);
        if (ch=='a'){
            skipA(pro,unPro.substring(1));
        }
        else {
            skipA(pro+ch,unPro.substring(1));
        }
    }
    public static String skipAStringReturn(String unPro){
        if (unPro.isEmpty()){
            return "";
        }
        char ch=unPro.charAt(0);
        if (ch=='a'){
            return skipAStringReturn(unPro.substring(1));
        }
        else {
            return ch + skipAStringReturn(unPro.substring(1));
        }
    }

    public static String skipApple(String unPro){
        if (unPro.isEmpty()){
            return "";
        }

        if (unPro.startsWith("apple")){
            return skipApple(unPro.substring(5));
        }
        else {
            return unPro.charAt(0)+ skipApple(unPro.substring(1));
        }
    }

    public static void subSeq(String pro, String unPro){
        if (unPro.isEmpty()){
            System.out.println(pro);
            return;
        }

        char ch=unPro.charAt(0);
        subSeq(pro+ch,unPro.substring(1));
        subSeq(pro,unPro.substring(1));

    }
    public static ArrayList<String> subSeqRet(String pro, String unPro){
        if (unPro.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(pro);
            return list;
        }

        char ch=unPro.charAt(0);
        ArrayList<String>left=subSeqRet(pro+ch,unPro.substring(1));
        ArrayList<String>right=subSeqRet(pro,unPro.substring(1));

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {

//        increasing(5);
//        decreasing(5);
//        System.out.println(factorial(5));
//        System.out.println(sumOfNum(5));
//        System.out.println(sumOfDigit(54321));
//        System.out.println(productOfDigit(543021));
//        System.out.println(count(890000504));

//        int[] arr= new int[]{5,6,11,9,10};
//        System.out.println(sortedArray(arr,0));

//        starPattern(4,0);

//        skipA("","bhavcadfa");
//        System.out.println(skipAStringReturn("bhavcadfa"));
//        System.out.println(skipApple("bhavcappledfa"));

//        subSeq("", "abcde");
        System.out.println(subSeqRet("", "abcde"));

    }


}
