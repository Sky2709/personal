import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

public class masking {
   /* public static void UniqueNumbers2(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum ^ arr[i]);
        }
        sum = (sum & -sum);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & sum) > 0) {
                sum1 = (sum1 ^ arr[i]);
            }
            else {
                sum2 = (sum2 ^ arr[i]);
            }
        }
        System.out.println("The non-repeating elements are "
                + sum1 + " and " + sum2);
    }

    public static void main(String[] args)
    {
        int[] arr = new int[] { 2, 3, 7, 9, 11, 2, 3, 11 };
        int n = arr.length;
        UniqueNumbers2(arr, n);*/
   /*public ArrayList<Integer> solve(ArrayList<Integer> A) {
       int xor=0;
       for (int i=0; i<A.size();i++){
           xor= xor^A.get(i);
       }
       int count=0;
       while ((xor&1)!=1){
           xor=xor>>1;
           count++;
       }
       int X=0;
       int Y=0;
       for (int x:A) {
           if ((x& (1<<count))>0){
               X= X^x;
           }
           else {
               Y=Y^x;
           }
       }
       ArrayList<Integer> arr = new ArrayList<Integer>()
       arr.add(Math.min(X,Y));
       arr.add(Math.max(X,Y));
       return arr;
   }
   public static void main(String[] args) {
       /*char s1[]="aBcDEfgH".toCharArray();
       for (int i=0; i<s1.length; i++){
           if (s1[i]>='a' && s1[i]<='z'){
               s1[i]= (char) (s1[i]-32);
           }
           else {
               s1[i]= (char) (s1[i]+32);
           }
       }
       System.out.println(String.valueOf(s1));
       HashMap<String,Integer> menu= new HashMap<>();
       menu.put("Pizza", 500);
       menu.put("Burger", 100);
       menu.put("Cake",100);
       menu.put("noodles", 59);
       if (menu.containsKey("noodles")){
           System.out.println(menu.get("noodles"));
       }
       else {
           System.out.println("not available");
       }
       menu.put("Cake", menu.getOrDefault("Cake", 90)+ 14);
       System.out.println(menu.get("Cake"));
       for (String key:menu.keySet()) {
           System.out.println(key +" "+ menu.get(key));

       }
       int[] arr={5,4,6,4,5,7,9};
       HashMap<Integer, Integer> hm= new HashMap<>();
       for (int x:arr) {
        int freq= hm.getOrDefault(x,0);
        hm.put(x, freq+1);
       }
       for (int x:arr) {
       if (hm.get(x) > 1){
           System.out.println(x);
       }
       break;
       }
       HashSet<Integer> hs=new HashSet<>();
       int[] arr= {3,5,2,7,8,10,20,6};
       int TS=26;
       for (int x:arr) {
           int A=x;
           int B= TS-A;
           if (hs.contains(B)){
               System.out.println(A+","+B);
           }
           hs.add(A);
       }
       int[] arr= {2,4,3,8,3,9,4,9,4,10};
       int k=4;
       HashMap<Integer, Integer> Hm= new HashMap<>();
       for (int i=0; i<k;i++ ){
           int key= arr[i];
           int val= Hm.getOrDefault(key,0)+1;
           Hm.put(key,val);
       }
       System.out.print(Hm.size()+",");
       int s=1;
       int e=k;
       while(e<arr.length){
           int out=arr[s-1];
           Hm.put(out, Hm.get(out)-1);
           if (Hm.get(out)==0){
               Hm.remove(out);
           }
           int in=arr[e];
           Hm.put(in, Hm.getOrDefault(in,0)+1);
           System.out.print(Hm.size()+",");
           s=s+1;
           e=e+1;
       }
       }
       //prefix Sum question
       static boolean hasZeroSum(int[] arr){
           HashSet<Integer> hs= new HashSet<>();
           int cumsum=arr[0];
           hs.add(cumsum)
           for (int i=1; i< arr.length; i++){
               cumsum+=arr[i];
               if (hs.contains(cumsum)){
                   return true;
               }
               hs.add(cumsum);
           }
           return false;
       }

    public static void main(String[] args) {
        int[] arr = {1, 4, 9, -1, 2, -1, 6, 5};
        System.out.println(hasZeroSum(arr));
    }*/
   /*public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
       ArrayList<Integer> common= new ArrayList<Integer>();
       HashMap<Integer,Integer> hm= new HashMap<>();
       for (int i=0; i<B.size();i++){
           int frq=hm.getOrDefault(B.get(i),0);
           hm.put(B.get(i), frq+1);
       }
       for (int i=0; i<A.size(); i++){
           if (hm.containsKey(A.get(i))){
               common.add(A.get(i));
               hm.put(A.get(i), hm.get(A.get(i))-1);
               if (hm.get(A.get(i))==0){
                   hm.remove(A.get(i));
               }
           }
       }
       return common;
   }
   public int solve(ArrayList<Integer> A) {
       HashMap<Integer,Integer> hm= new HashMap<>();
       for (int i=0;i< A.size(); i++){
           if (hm.containsKey(A.get(i))){
               hm.put(A.get(i), hm.get(A.get(i))+1);
           }
           else {
               hm.put(A.get(i),1);
           }
       }
       for (int i=0;i< A.size();i++){
           if (hm.get(A.get(i))>1){
               return A.get(i);
           }
       }
       return -1;
   }
   public int solve(ArrayList<Integer> A) {
       HashSet<Long> hs= new HashSet<>();
       long cumSum=A.get(0);
       hs.add(cumSum);
       for (int i=1; i<A.size(); i++){
           cumSum+=(long) A.get(i);
           if (hs.contains(cumSum) || cumSum==0){
               return 1;
           }
           hs.add(cumSum);
       }
       return 0;
   }
   public ArrayList<Integer> lsZero(ArrayList<Integer> A) {
       HashMap<Integer,Integer> hm= new HashMap<>();
       int max= Integer.MIN_VALUE;
       int sum=0;
       hm.put(sum,-1);
       int start=-1;
       int end=-1;
       for (int i=0;i< A.size();i++){
           sum +=A.get(i);
           if (hm.containsKey(sum)){
               int ln= i- hm.get(sum);
               if (ln>max){
                   max=ln;
                   start=hm.get(sum)+1;
                   end=i;
               }
           }
           else {
               hm.put(sum,i);
           }
       }
       ArrayList<Integer> list= new ArrayList<Integer>();
       if (start>=0 && end>=0){
           for (int i=start; i<=end; i++){
               list.add(A.get(i));
           }
       }
       return list;
   }
   public int solve(ArrayList<Integer> A) {
       HashMap<Integer,Integer> hm= new HashMap<>();
       int ans= Integer.MAX_VALUE;
       for (int i=0; i<A.size(); i++){
           if (hm.containsKey(A.get(i))){
               int oldIdx= hm.get(A.get(i));
               int diff= i- oldIdx;
               ans= Math.min(ans, diff);
           }
           hm.put(A.get(i),i);
       }
       return ans==Integer.MAX_VALUE ? -1 : ans;
   }
   public static int solve(String A) {
       HashMap<Character,Integer> hm= new HashMap<>();
       for (int i=0; i<A.length(); i++){
           if (hm.containsKey(A.charAt(i))){
               hm.put(A.charAt(i), hm.get(A.charAt(i))+1);
           }
           else {
               hm.put(A.charAt(i),1);
           }
       }
       int counter=0;
       for (int val: hm.values()){
           if (val%2!=0){
               counter++;
               if (counter==2){
                   return 0;
               }
           }
           else {
               continue;
           }
       }
       return 1;
   }
    public static void increasing(int n){
     if(n==1){
         System.out.println(1);
         return;
     }
     increasing(n-1);
        System.out.println(n);
    }
    public static void decreasing(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }
     public static int sum(int n){
        if (n==0){
            return 0;
        }
         return n+ sum(n-1);
     }

     public static int multiply(int n, int m){
      if(m==0){
          return 0;
      }
      return n+ multiply(n,m-1);
     }
     public static int power(int n, int m){
        if (m==0){
            return 1 ;
        }
        return n * power(n, m-1);
     }
   public static int solve(String A) {
       int n= A.length()-1;
       int j=0;
       return solve2(A,j,n);
   }
   public static int solve2(String A, int j, int n){
    if (j>=n){
        return 1;
    }
    if (A.charAt(j) != A.charAt(n)){
        return 0;
    }
    return solve2(A, j+1, n-1);
   }
   public static int findAthFibonacci(int A) {
       if (A==0 || A==1){
           return A;
       }
       return findAthFibonacci(A-1)+ findAthFibonacci(A-2);
   }
   public static int solve(int A) {
       if(A==1){
           return 1;
       }
       return A* solve(A-1);
   }
    public static String reverse(String str, int s, int e){
         if (s>e){
             return str;
         }
         StringBuilder sb= new StringBuilder(str);
         char temp= sb.charAt(s);
         sb.setCharAt(s, sb.charAt(e));
         sb.setCharAt(e, temp);

         return reverse(sb.toString(), s+1,e-1);
    }*/
   public int solve(int A) {
    if (addition(A)==1){
        return 1;
    }
    return 0;
   }
   public static int addition(int A){
       if (A==0){
           return 0;
       }
       if (A==1){
           return 1;
       }
       int ans= A%10+ addition(A/10);
       if (ans/10==0){
           return ans;
       }
       return addition(ans);
   }
    public static void main(String[] args) {
       //int n=5;
        //int m=6;
        //increasing(n);
       //decreasing(n);
        //System.out.println(sum(n));
        //System.out.println(multiply(n,m));
        //System.out.println(power(n,m));
        //Scanner sc= new Scanner(System.in);
       // String str= sc.nextLine();
        //int n= str.length();
        //int s=0;
        //int e=n-1;
        //System.out.println(reverse(str,s,e));

    }
}
