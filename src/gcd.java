import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class gcd {
    /*public int solve(ArrayList<Integer> A) {
        int n= A.size();
        int[] preGcd= new int[n];
        int[] postGcd= new int[n];

        preGcd[0]= A.get(0);
        for (int i=1; i<n; i++){
            preGcd[i]= gcd(preGcd[i-1],A.get(i) );
        }

        postGcd[n-1]= A.get(n-1);
        for (int i=n-2; i>=0; i--){
            postGcd[i]= gcd(postGcd[i=1], A.get(i) );
        }

        int result= postGcd[1];
        for (int i=1; i<n; i++ ){
            if (i==n-1){
                result= Math.max(result, preGcd[i-1]);
            }
            else{
                result= Math.max(result, gcd(preGcd[i-1], postGcd[i+1] ));
            }
        }
        return result;

    }

    public static int gcd(int A, int B) {
        if(A==0){
            return B;
        }

        return gcd(B%A, A);
    }*/

    public static int cpFact(int A, int B) {
        ArrayList<Integer> divisor = new ArrayList<>();
        for (int j = 1; j <= Math.sqrt(A); j++) {
            if (A % j == 0) {
                if (A / j == j) {
                    divisor.add(j);
                } else {
                    divisor.add(j);
                    divisor.add(A / j);
                }
            }
        }
        Collections.sort(divisor);
        int max=Integer.MIN_VALUE;
        for (int i=0; i<divisor.size(); i++){
             if (gcd(B, divisor.get(i))==1){
                 int curMax= divisor.get(i);
                 max= Math.max(curMax,max);
             }
        }
        return max;
    }/*
    public static int cpFact(int A, int B) {
    while(gcd(A,B) != 1)
    {
        A=A/gcd(A,B);
    }
    return A;
    }*/


    public static void main(String[] args) {
        int n=12;
        int m=3;
        int k=2;
        System.out.println(cpFact(n,m));
    }

    public static int gcd(int A, int B) {
        if(A==0){
            return B;
        }

        return gcd(B%A, A);
    }

}
