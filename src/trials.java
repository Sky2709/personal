import java.util.*;



public class trials {
    /*public static int solve(ArrayList<Integer> A) {
        int maxData= Integer.MIN_VALUE;
        for (int i=0; i<A.size()-1;i++){
            maxData= Math.max(maxData,A.get(i));
        }
        int output=0;
        for (int i=0; i<A.size(); i++){
            output += maxData- A.get(i);
        }
        return output;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(6);
        arr.add(9);
        arr.add(4);
        arr.add(3);
        System.out.println(solve(arr));
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> product=new ArrayList<>();
        int products=1;
        for (int i=0; i<A.size(); i++){
            products= products * A.get(i);
        }
        for (int i=0; i<A.size(); i++){
            product.add((int) (products * Math.pow(A.get(i),-1)));
        }
     return product;
     }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> newArr= new ArrayList<>();
          int ans=1;
          int n= A.size();
          newArr.add(A.get(n-1));
          int largest= A.get(n-1);
          for (int i=n-2; i>=0; i--){
              if (A.get(i) > largest){
                  ans = ans+1;
                  largest= A.get(i);
                  newArr.add(A.get(i));
              }
          }
          return newArr;
    }

    public int solve(String A) {
        int count=0;
        int ans=0;
        int n= A.length()-1;
        int modulo= (int) Math.pow(10,9) +7;
        for (int i=n; i>=0; i--){
            if (A.charAt(i)=='G'){
                count =count +1;
            }
            else if (A.charAt(i)=='A') {
                ans= (ans+ count) modulo;
            }
        }
        return ans % modulo;
        }

   public static int max(ArrayList<Integer> A) {
       int max= A.get(0);
        for (int i=1; i<A.size();i++){
            if (A.get(i)>max){
                max=A.get(i);
            }
        }
        return max;
    }
    public static int min(ArrayList<Integer> A) {
        int min = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) < min) {
                min = A.get(i);
            }
        }
        return min;
    }

    public static int solve(ArrayList<Integer> A) {
       int smallest=0;
       for (int i=0; i<A.size(); i++){
           if (A.get(i)==min(A)){
               for (int j=i+1; j<A.size();j++){
                   if (A.get(j)==max(A)){
                       smallest= Math.max(smallest,j-i+1);
                   }
                   break;
               }
           }
       }
       return smallest;

    }
    public static void main(String[] args) {
        ArrayList<Integer> A= new ArrayList<>();
        A.add(14);
        A.add(12);
        A.add(36);
        A.add(99);
        A.add(45);
        A.add(86);
        System.out.println(solve(A));
    }
    public static int maxSubArrays(final List<Integer> A, int B) { //KADANES ALGORITHM
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < A.size(); i++) {
            curSum = curSum + A.get(i);
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (maxSum<=B){

        }
            }
        return 0;
    }
    public static void main(String[] args) {

        int B= 7;
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(8);
        A.add(8);
        A.add(9);
        A.add(7);
        // A.add(36);
        //A.add(99);
        //A.add(45);
        //A.add(86);
        System.out.println(maxSubArrays(A,B ));
    }

   public static Long subarraySum(ArrayList<Integer> A) {
        long sum= 0;
        long result=0;
        int[] pSum= new int [A.size()];
        pSum[0]= A.get(0);
        for (int i=1; i<A.size(); i++){
            pSum[i]= pSum[i-1] + A.get(i);
        }
        for (int i=0; i<A.size(); i++){
            sum=0;
            for (int j=i; j< A.size(); j++){
                if (i!=0){
                    sum= pSum[j]- pSum[i-1];
                }
                else {
                    sum= pSum[j];
                    result+=sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A= new ArrayList<>();
        A.add(14);
        A.add(12);
       // A.add(36);
        //A.add(99);
        //A.add(45);
        //A.add(86);
        System.out.println(subarraySum(A));
    }

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> colSum= new ArrayList<>();
        int sum=0;
        int col= A.get(0).size();
        int row= A.size();
        for( int j=0; j<col; j++){
            sum=0;
            for (int i=0; i< row; i++){
                sum+= A.get(i).get(j);
            }
                colSum.add(sum);
        }
        return colSum;
    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int m= A.size();
        int n= A.get(0).size();
        for (int i=0; i<m; i++){
            for (int j=0; j<n; i++){
                int sum= A.get(i).get(j) + B.get(i).get(j);
                A.get(i).set(j,sum);
            }
        }
        return A;

    }

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> diag= new ArrayList<>(N);
        int N= A.size();
        int total= 2*N-1;
        for (int i=0; i<total; i++){
            diag.add(new ArrayList<Integer>(N));
            for (int j=0; j<N; j++){
                diag.get(i).add(0);
            }
        }

        for (int i=0; i<total; i++){
            for(int j=0; j<N; j++){
                diag.get(i+j).add(A.get(i).get(j));
            }
        }
        return diag;

    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> multiply= new ArrayList<>();
        int R1= A.size();
        int C2= B.get(0).size();

        for (int i=0; i<R1; i++){
            ArrayList<Integer> row= new ArrayList<>();
            multiply.add(row);
            for (int j=0; j< C2; j++){
                int sum=0;
                for (int k=0; k<B.size(); k++){
                    sum+= A.get(i).get(k) * B.get(k).get(j);
                }
                multiply.get(i).add(sum);
            }
        }
        return multiply;
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> transpose= new ArrayList<ArrayList<Integer>>();
        int n= A.get(0).size();
        for (int i=0; i<n; i++){
            ArrayList<Integer> col= new ArrayList<>();
            for (ArrayList<Integer> row:A) {
                col.add(row.get(i));
            }
            transpose.add(col);
        }
        return transpose;
    }

    public void solve(ArrayList<ArrayList<Integer>> A) {

        for (int i=0; i<A.size(); i++){
            int j=0;
            while(j!=i) {
                int temp = A.get(i).get(j);
                A.get(i).set(j,A.get(j).get(i));
                A.get(j).set(i,temp);
                j++;
            }
        }
        for (int i=0; i<A.size();i++){
            Collections.reverse(A.get(i));
        }
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        for (int i=0; i<A.size(); i++){
            for (int j=0; j<A.get(0).size(); j++){
                int product= A.get(i).get(j) * B;
                A.get(i).set(j, product);
            }
        }
        return A;
    }

    public int solve(final List<ArrayList<Integer>> A) {
        int sum=0;
        for(int i=0; i<A.size(); i++){
            int j=i;
             sum +=A.get(i).get(j);
        }
        return sum;
    }

    public int solve(ArrayList<ArrayList<Integer>> A) {
        int sum=0;
        int m= A.size();
        int n= A.get(0).size();
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                sum+= (i+1) * (j+1) * (n-1) * (m-j) * A.get(i).get(j);
            }
        }
        return sum;
    }

    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int row= A.size();
        int col= A.get(0).size();
        int maxSum= Integer.MIN_VALUE;
        int [][] pSum= new int[row][col];
        pSum[0][0]= A.get(0).get(0);
        for (int i=1; i<row; i++){
            pSum[0][i]= pSum[0][i-1] + A.get(0).get(i);
        }
        for (int i=1; i<col; i++){
            pSum[i][0]= pSum[i-1][0] + A.get(i).get(0);
        }
        for (int i=1; i<row; i++){
            for (int j=1; j<col; j++){
                pSum[i][j]= pSum[i-1][j] + pSum[i][j-1] -pSum[i-1][j-1] + A.get(i).get(j);
            }
        }

        for (int i=0; i< pSum.length; i++){
            for (int j=0; j< pSum.length; j++){
                int sum= Integer.MIN_VALUE;
                if (i-B>=0 && j-B>=0){
                    sum= pSum[i][j] -pSum[i-B][j]-pSum[i][j-B]+pSum[i-B][j-B];
                    maxSum= Math.max(sum,maxSum);
                }
            }
        }
        return maxSum;
    }


    public int trap(final List<Integer> A) {
        int n=A.size();
        int []left= new int[n];
        int []right= new int[n];

        int water=0;
        left[0]=A.get(0);
        for (int i=0; i<n; i++){
            left[i]= Math.max(left[i-1],A.get(i));
        }

        right[n-1]=A.get(n-1);
        for (int i=n-2; i>=0; i--){
            right[i]= Math.max(right[i+1], A.get(i));
        }

        for (int i=0; i<n; i++){
            water+= Math.min(left[i], right[i])-A.get(i);
        }
        return water;
    }

    public int maxSubArray(final List<Integer> A) {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0; i<A.size(); i++){
            curSum+=A.get(i);
            if (curSum>maxSum){
                maxSum=curSum;
            }
            if (curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }

    public int firstMissingPositive(ArrayList<Integer> A) {
      int n= A.size();
      for (int i=0; i<n; i++){
          int element= A.get(i);
          if (element >=1 && element<n){
              int chair= element -1;
              if (A.get(chair)!=element){
                  swap(A.get(chair), A.get(i));
                  i--;
              }
          }
      }
      for (int i=0; i<n; i++){
          if ((i+1) != A.get(i)){
              return i+1;
          }
      }
      return n+1;
    }
    private void swap(int a, int b){
        int temp= a;
        a=b;
        b=temp;
    }


    public int solve(ArrayList<ArrayList<Integer>> A, int B) {

        int M= A.size();
        int N= A.get(0).size();
        int x=0;
        int y= N-1;
        int minRes= Integer.MAX_VALUE;
        while(x<=M-1 && y>=0){
            if (A.get(x).get(y) >B) {
                y--;
            }
            else if (A.get(x).get(y) < B) {
                x++;
            }
            else{
                minRes= Math.min(minRes, (x+1)*1009 +y+1);
                if (A.get(x).get(y) ==B){
                    y--;
                }
                else {
                    break;
                }
            }
        }
        if (minRes==Integer.MAX_VALUE){
            return -1;
        }
        return minRes;
    }


    public int repeatedNumber(final List<Integer> a) {

        HashMap<Integer,Integer> hm= new HashMap<>();
        for (int i=0; i<a.size(); i++){
            if (hm.containsKey(a.get(i))){
                hm.put(a.get(i), hm.get(a.get(i))+1);
            }
            else{
                hm.put(a.get(i),1);
            }
        }
        for (int i=0; i<a.size(); i++){
            if (hm.get(a.get(i))>a.size()/3){
                return a.get(i);
            }
        }
        return -1;
    }

    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int start=0;
        int end=A.size()-1;
        int curIdx=0;
        while (start<end && curIdx<=end){
            if (A.get(curIdx)==0){
                A.set(curIdx, A.get(start));
                A.set(start,0);
                curIdx++;
                start++;
            }
            else if (A.get(curIdx)==1) {
                curIdx++;
            }
            else if (A.get(curIdx)==2) {
                A.set(curIdx, A.get(end));
                A.set(end,2);
                end--;
            }
        }
        return A;
    }
    public void bubbleSort(ArrayList<Integer> A){
        int n= A.size();
        for (int i=1; i<=n-1; i++){
            for (int j=0; j<=n-i-1; j++){
                if (A.get(j)> A.get(j+1)){
                    int temp= A.get(j);
                    A.add(j, A.get(j+1));
                    A.add(j+1, temp);
                }
            }
        }
    }

    public int solve(ArrayList<Integer> A) {

        Collections.sort(A);
        int n=A.size();
        if (A.get(n-1)==0){
            return 1;
        }
        for (int i=0; i<n-1; i++){
            if (A.get(i) != A.get(i+1) && A.get(i)==n-i-1 ){
                return 1;
            }
        }
        return -1;
    }
      public static int solve(int[] A) {
         if(A.length==0){
        return 0;
        }
        int sum=0;
        for(int i=0;i<A.length;i++){
        sum+=A[i];
        }
        Arrays.sort(A);
        int ans=0;
        int diff=0;
        for(int i=A.length-1;i>=0;i--){
        ans+=(sum-diff);
        diff+=A[i];
        }
        return ans;
        }

    public static void main(String[] args) {
        int [] sol= {8, 0 ,10};
        System.out.println(solve(sol));
    }

    public static String solve(String A) {
        String[] splitString= A.split(" ");
        StringBuilder reverse= new StringBuilder();
        for (int i=splitString.length-1; i>=0; i--){
            if (i==0){
                reverse.append(splitString[i]);
            }
            else{
                reverse.append(splitString[i] + " ");
            }
        }
        return reverse.toString();
    }
    public String solve(String A) {
        StringBuilder result = new StringBuilder();
        int i = A.length() - 1;
        while(i >= 0) {
            // Decreasing i until we find alphabet
            while(i >= 0 && A.charAt(i) == ' ') {
                i--;
            }
            int j = i;  // j represents last character of word
            if(i < 0) {
                break;  // Edge case check
            }
            // Decreasing i until we find space
            while(i >= 0 && A.charAt(i) != ' ') {
                i--;
            }
            // Adding the word
            if(result.length() == 0) {
                result.append(A.substring(i + 1, j + 1));  //If this is first word we get, we don't need to add space before that
            } else {
                result.append(" " + A.substring(i + 1, j + 1));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str= "the sky is blue ";
        System.out.println(solve(str));
    }

    public int solve(ArrayList<Character> A) {
        for(int i=0; i<A.size(); i++){
            char ch= A.get(i);
            boolean isUpper= ch>= 'A' && ch<='Z';
            boolean isLower= ch>= 'a' && ch<='z';
            boolean isDigit= ch>= '0' && ch<='9';
            if (!(isDigit || isLower || isUpper)){
                return 0;
            }
        }
        return 1;
    }

    public String solve(String A) {
        String s= A+A;
        String newer,newest;
        newer= s.replaceAll("([A-Z])","");
        newest=newer.replaceAll("([aeiou])","#");
        return newest;
    }
    public String longestCommonPrefix(ArrayList<String> A) {
        String prefix= A.get(0);
        for (int i=1; i<A.size(); i++){
            while (A.get(i).indexOf(prefix) != 0){
                prefix= prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;

    }

    public int singleNumber(final List<Integer> A) {
        int sum[]= new int[32];
        Arrays.fill(sum,0);
        for (int x:A) {
         int p=0;
         while (x>0){
             int lastBit= x&1;
             sum[p] += lastBit;
             p=p+1;
             x= x>>1;
         }
        }
        int ans=0;
        int power=1;
        for (int i=0; i<32; i++){
            sum[i]= sum[i]%3;
            ans= ans+ sum[i]* power;
            power= power<<1;
        }
      return ans;
    }*/

    /*public static String addBinary(String A, String B) {
        int a = A.length()-1;
        int b = B.length()-1;
        int sum ,digit, carry=0;
        StringBuilder res = new StringBuilder();
        while(b>=0 || a>=0 || carry!=0){
            sum = carry;
            if(a>=0){
                sum += A.charAt(a) -'0';
            }
            if(b>=0){
                sum += B.charAt(b) -'0';
            }
            digit = sum %2;
            carry = sum /2;
            res.insert(0,digit);
            a--;b--;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String a= "1111";
        String b= "111";
        System.out.println(addBinary(a,b));
    }

    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int minXor=Integer.MAX_VALUE;
        int val=0;
        for (int i=0; i<A.size()-1;i++){
            val= A.get(i) ^ A.get(i+1);
            minXor= Math.min(val,minXor);

        }
        return minXor;
    }
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {

        ArrayList<Integer> result= new ArrayList<>();
        int i=0;
        int k=0;
        int j=0;
        while (i<= A.size()-1 && j<=B.size()-1){
            if (A.get(i) <= B.get(j)){
                result.add(k, A.get(i));
                i++;
                k++;
            }
            else{
                result.add(k, B.get(j));
                j++;
                k++;
            }
        }

        while(i<=A.size()-1){
            result.add(k, A.get(i));
            i++;
            k++;
        }

        while(j<=B.size()-1){
            result.add(k, B.get(j));
            j++;
            k++;
        }

        return result;
    }*/
    /*static int mod = 1000 * 1000 * 1000 + 7;
    public int solve(ArrayList<Integer> A) {
        int start=0;
        int end= A.size()-1;
        int x= cntInv(A,start,end);
        return x;

    }

    public static int cntInv(ArrayList<Integer> A, int start, int end){
     if (start>=end){
         return 0;
     }

     int mid= (start+end)/2;
     int cntLft= cntInv(A, start, mid) % mod;
     int cntRt= cntInv(A, mid+1, end) % mod;

     int crossCnt=merge(A, start,mid,end) % mod;
     return (cntLft+ cntRt+ crossCnt) % mod;

    }

    public static int merge(ArrayList<Integer> A, int start, int mid, int end){
         int n= A.size();
         int [] temp= new int[n];

         int i=start;
         int k=start;
         int j=mid +1;
         int count=0;

        while(i<=mid && j<=end) {
            if (A.get(i) <= A.get(j)) {
                temp[k] = A.get(i);
                i++;
                k++;
            }
            else {
                count = count+(mid-i+1)%mod;
                temp[k] = A.get(j);
                j++;
                k++;
            }
        }

        while(i<=mid){
            temp[k]= A.get(i);
            k++;
            i++;
        }
        while(j<=end){
            temp[k]= A.get(j);
            k++;
            j++;
        }

        for (int l=start; l<end; l++){
            A.set(l, temp[l]);
        }

        return count % mod;
    }*/



}


