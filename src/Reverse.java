import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int N= sc.nextInt();
            long ans=0;
            int P=1;
            while(N>0){
                int rem=N%2;
                ans= ans + rem * P;
                N=N/2;
                P=10*P;
            }
        System.out.println(ans);

            int sum=0;
            

           /* int sum=0;
        while (ans!=0){
            int rem = ans%10;
            if (rem==1){
                sum =
            }

        }*/
    }
   /*public static ArrayList<Integer> solve(final List<Integer> A) {
       int a=0;
       int b= A.size - 1;
       while(a<b){
           Swap((ArrayList<Integer>) A, a,b);
           a++;
           b--;
       }
       return (ArrayList<Integer>) A;

   }
    public static void Swap(ArrayList<Integer> arr, int i, int j){
        Integer temp= arr.get(i);
        arr.get(i)=arr.get(j);
        arr.get(j)=temp;
   }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> input= new ArrayList<Integer>();
        while(sc.hasNextInt()){
            input.add(sc.nextInt());
        }
        System.out.println(solve(input));*/
   /*public static int solve(ArrayList<Integer> A, int B) {
       int count=0;
       boolean test = false;
       for (int i=0; i<A.size();i++) {
           if (A.get(i) > B) {
               test = true;
               count = +1;
           }
           return count;
       }
       return -1;
       }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        ArrayList<Integer> input= new ArrayList<>();
        for(int i=0; i<5;i++){
            input.add(sc.nextInt());
        }
        int T= sc.nextInt();
        System.out.println(solve(input, T));
    }*/
   /*public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int T= sc.nextInt();
       int j,a=0,b=0;
       for (int i=1; i<=T; i++){
            int A= sc.nextInt();
           int[] arr= new int[A];
           for (j=0; j<A; j++){
               arr[j]= sc.nextInt();
           }
           int[] arrE={A};
           int[] arrO={A};
           for (j=0; j< arr.length; j++){
               if (arr[j]%2==0) {
                   arrE[a] = arr[j];
               }
               else {
                   arrO[b]= arr[j];
               }
           }
           for ( int t:arrE) {
               System.out.print(t +" ");
           }
           for ( int f:arrO) {
               System.out.print(f +" ");
           }
       }
   }*/
   /* public static void main(String[] args) {
       int n, j = 0, k = 0;
       Scanner s = new Scanner(System.in);
       int T = s.nextInt();
       for (int i=1; i<=T; i++) {
           n = s.nextInt();
           int a[] = new int[n];
           int odd[] = new int[n];
           int even[] = new int[n];
           for (i = 0; i < n; i++) {
               a[i] = s.nextInt();
           }
           for (i = 0; i < n; i++) {
               if (a[i] % 2 != 0) {
                   odd[j] = a[i];
                   j++;
               } else {
                   even[k] = a[i];
                   k++;
               }
           }
       }
       System.out.print("Even:");
       if(k > 1)
       {for(int i = 0; i < (k-1); i++)
       {
           System.out.print(even[i]+",");
       }
           System.out.print(even[k-1]);
       }
       else
       {
           System.out.println("");
       }
       System.out.println("");
       System.out.print("Odd:");
       if(j > 1)
       {
           for(int i = 0;i < (j-1); i++)
           {
               System.out.print(odd[i]+",");
           }
           System.out.print(odd[j-1]);
       }
       else
       {
           System.out.println("");
       }
   }*/
}
