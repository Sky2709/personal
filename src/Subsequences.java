import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Subsequences {
    /*public static void subSets(int[] Arr){
        int n=Arr.length;
        for (int i=0; i<(1<<n); i++ ){
            filter(Arr, i);
            System.out.println(filter(Arr,i));
        }
    }
    public static ArrayList<Integer> filter(int[] arr, int A){
        ArrayList<Integer> sub= new ArrayList<>();
          int j= arr.length -1;
          while( A>0){
              int lastBit= (A & 1);
              if (lastBit==1){
                  sub.add(arr[j]);
              }
              j--;
              A= A>>1;
          }
          return sub;
    }

    public static void main(String[] args) {
        int [] input={54, 25, 36};
        subSets(input);
    }*/

    /*public static String solve(String A, String B) {
        int i= A.length();
        int j=B.length();
        int a=0,b=0;
        while( a<i && b< j){
            if (A.charAt(a) == B.charAt(b)){
                a++;
                b++;
            }
            else{
                b++;
            }
        }
        if (a==i){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        String str1= "asdkljpt";
        String str2= "alt";
        System.out.println(solve(str2, str1));
    }*/
    public static int solve(int[]A, int S) {
        /*HashSet<Integer> hs=new HashSet<>();
        for (int j=0; j<n-3;j++) {
            int a= A[j];
            for (int i = j + 1; i < n-1; i++) {
                int b = A[i];
                int c = S - b;
                if (hs.contains(c)) {
                    count++;
                } else {
                    hs.add(b);
                }
            }
        }
        if (cnt>0){
            return cnt;
        }
        return 0;*/
        int n= A.length;
        int cnt=0;
        Arrays.sort(A);
        int k=n-1;
        for (int i=0; i<n-3; i++){
            int a= A[i];
            int j=i+1;
            while(j<k){
                if (A[j]+ A[k] > S-a){
                    k--;
                }
                else if (A[j]+ A[k]<= S-a){
                    cnt+= k-j;
                    j++;
                }
            }
        }
        return cnt;

    }

    public static void main(String[] args) {
        int[] arr={2, 3, 4, 7, 1, 8, 10, 6 };
        int A= 12;
        System.out.println(solve(arr,A));
    }
}
