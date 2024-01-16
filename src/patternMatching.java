import java.util.*;
public class patternMatching {
//    public int solve(String A) {
//        int n= A.length();
//        int lps[]= new int[n];
//        computeLPSArray(A,n,lps);
//        return n-lps[n-1];
//    }
//
//    public static void computeLPSArray(String str, int n, int lps[]){
//        int len=0;
//        int i;
//        lps[0]=0;
//        i=1;
//        while (i<n){
//            if (str.charAt(i)==str.charAt(len)){
//                len++;
//                lps[i]=len;
//                i++;
//            }
//            else {
//                if (len!=0){
//                    len=lps[len-1];
//                }
//                else {
//                    lps[i]=0;
//                    i++;
//                }
//            }
//        }
//    }

//    public static int solve(String A){
//        int n=A.length();
//        int [] lps= new int[n];
//        lps[0]=0;
//        for (int i=1; i<=n-1; i++){
//            int x=lps[i-1];
//            while (A.charAt(x)!=A.charAt(i)){
//                if (x==0){
//                    x=-1;
//                    break;
//                }
//                else {
//                    x=lps[x-1];
//                }
//            }
//            lps[i]=x+1;
//        }
//        return n-lps[n-1];
//    }

//    public String smallestPrefix(String A, String B) {
//        String ans="";
//        ans= ans+ A.charAt(0);
//        int i=1;
//        int j=0;
//        while (i<A.length()){
//            if (A.charAt(i)<B.charAt(j)){
//                ans=ans+ A.charAt(i);
//                i++;
//            }
//            else {
//                break;
//            }
//        }
//        ans= ans+ B.charAt(0);
//        return ans;
//    }

//    public int solve(String A) {
//        StringBuilder sb= new StringBuilder(A);
//        sb.reverse();
//        String str= A+ "@" +sb;
//        int n= str.length();
//        int[]lps= new int[n];
//        lps[0]=0;
//        for (int i=1; i<n-1; i++){
//            int x= lps[i-1];
//            while (str.charAt(x)!=str.charAt(i)){
//                if (x==0){
//                    x=-1;
//                    break;
//                }
//                else {
//                    x=lps[x-1];
//                }
//            }
//            lps[i]=x+1;
//        }
//        return A.length()-lps[n-1];
//    }

//    public static void createLPS(String A, int[]lps){
//        int i=1;
//        int j=0;
//        while (i<A.length()){
//        if (A.charAt(i)==A.charAt(j)){
//            lps[i]= j+1;
//            i++;
//            j++;
//        }
//        else {
//            if (j > 0) {
//                j = lps[j - 1];
//            } else {
//                i++;
//            }
//        }
//        }
//    }

//    public int solve(String A) {
//        int n=A.length();
//        int count=0;
//        for (int i=0; i<n; i++){
//            if (A.charAt(i)=='a'){
//                count++;
//            }
//        }
//        return (count*(count+1))/2;
//    }

//    public int solve(String A) {
//        String odd="";
//        String even="";
//        for (int i=0; i<A.length(); i++){
//            if (A.charAt(i)%2==0){
//                odd+=A.charAt(i);
//            }
//            else {
//                even+=A.charAt(i);
//            }
//        }
//
//        char []oddArray= odd.toCharArray();
//        Arrays.sort(oddArray);
//        odd= new String(oddArray);
//
//        char []evenArray= even.toCharArray();
//        Arrays.sort(evenArray);
//        even= new String(evenArray);
//
//        if (check(odd+even)){
//            return 1;
//        }
//        else if (check(even+odd)){
//            return 1;
//        }
//        return 0;
//    }
//
//    public static boolean check(String A){
//        boolean ok=true;
//        for (int i=0; i+1<A.length(); i++){
//            ok &= (Math.abs(A.charAt(i)-A.charAt(i+1))!=1);
//        }
//        return ok;
//    }

//    public int solve(String A, String B) {
//    }

}
