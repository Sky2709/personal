import java.util.*;

public class Modulo {
    /*public static int solve(ArrayList<Integer> A, int B) {

        if (A.size()<=1){
            return 0;
        }
        HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
        long mod = 1000000007;
        for (int i=0; i< A.size(); i++){
            int key= A.get(i) % B;
            hm.putIfAbsent(key,0);
            hm.put(key, hm.get(key)+1);
        }

        long sumPair= 0L;
        if (hm.containsKey(0)){
            sumPair = sumPair + calculateNCR(hm.get(0));
        }
        sumPair= sumPair % mod;
        int start=1;
        int end =B-1;
        while (start<end){
            if (hm.containsKey(start) && hm.containsKey(end)){
                sumPair += (long) (hm.get(start) * hm.get(end));
            };
            start++;
            end--;
        }

        if (B%2==0 && hm.containsKey(B/2)){
            sumPair += (calculateNCR(hm.get(B/2)));
        }
        return (int) (sumPair % (1000000000 +7));
    }

    private static long calculateNCR(long n) {
        return ((n * (n - 1)) / 2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(5);
        arr.add(17);
        arr.add(100);
        arr.add(11);
        int k= 28;
        System.out.println(solve(arr,k));
    }

    public static int pow(int A, int B, int C) {
         if(A==0){
             return 0;
         }
         if(B==0){
             return 1;
         }

         long halfPower= pow(A, B/2, C) % C;
         halfPower = ((halfPower % C * halfPower % C) + C) % C;
         if( B%2 != 0){
             halfPower= ((halfPower % C * A % C) + C) % C;
         }
         return (int)halfPower;
    }

    public static void main(String[] args) {
        int A= 2;
        int B= 5;
        int C= 13;
        System.out.println(pow(A, B, C));
    }

    public void arrange(ArrayList<Integer> a) {
        int n= a.size();
        for (int i=0; i <n; i++){
            int x= a.get(i);
            int y= a.get(x);
            a.set(i, (x+ (y%n)*n));
        }
        for (int i=0; i<n; i++){
            a.set(i, a.get(i)/n);
        }
    }

    public static int solve(int a, int b){
        while( a!=0){
            int A= b%a;
            int B= a;
            a= A;
            b=B;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();

        for (int i=1; i<=T; i++ ) {
            System.out.println(solve(a, b));
        }
    }


    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i=0; i<A.size(); i++){
            Integer frequency= (Integer) map.get(A.get(i));
            if (frequency ==  null){
                frequency =0;
                }
            map.put(A.get(i), frequency+1);
        }
        for (int j= 0; j<A.size();j++){
            result.add(map.get((Integer)A.get(j)));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        result.add(5);
        result.add(2);
        result.add(5);
        result.add(5);
        result.add(1);
        result.add(5);
        result.add(1);
        result.add(9);
        System.out.println(solve(result));
    }

    public static int solve(ArrayList<Integer> A, int B) {

        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i=0; i< A.size(); i++){
            if (!map.containsKey(A.get(i))){
                map.put(A.get(i), 0);
            }
            else{
                map.put(A.get(i), map.get(A.get(i))+1);
            }
        }
        int twiceCount=0;

        for (int i=0; i<A.size(); i++){
           if( map.get(B- A.get(i)) != null){
               twiceCount += map.get(B- A.get(i));
           }

            if (B - A.get(i) == A.get(i)) {
                twiceCount--;
            }
        }
        return twiceCount/2;

    }

    public static void main(String[] args) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(2);
        result.add(1);
        int B= 5;
        System.out.println(solve(result,B));

        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int i=1; i<=T; i++){
            int N= sc.nextInt();
            int [] arr= new int[N];
            for (int j=0; j<N; j++){
                arr[j]= sc.nextInt();
            }
            Arrays.sort(arr);
            HashMap<Integer, Integer> map= new HashMap<>();
            for (int num:arr) {
                Integer occurence=map.get(num);

                map.put(num, occurence== null ? 1 : occurence+1 );
            }
            for (Map.Entry<Integer,Integer> e: map.entrySet()) {
                if (e.getValue()==1){
                    System.out.print( e.getKey() + " ");
                }
            }

        }
    }

    public static  int solve(final String A) {

        int let= 0;
        int dig=0;
        for (int i=0; i< A.length(); i++){
            if (A.charAt(i) >='a' || A.charAt(i)<='z' || A.charAt(i)>= 'A' || A.charAt(i)<= 'Z'){
                let++;
            }
            else {
                dig++;
            }
        }
        return Math.max(dig,let);
    }

    public static void main(String[] args) {
        String str= "UEbS1X7wGNCmV1682fjG6a";
        System.out.println(solve(str));
    }*/





}
