public class backtracking {
    /*public static void main(String[] args) {
//        ArrayList<Integer> output=new ArrayList<>();

        int []output=new int[3];
          generateString(3,0,output);
    }

    public static void generateString(int n, int i, int[]output){
        if (i==n){
            System.out.println(Arrays.toString(output));
            return;
        }

//        output.add(i,4);
        output[i]=4;
        generateString(n,i+1,output);
//        output.add(i,5);
        output[i]=5;
        generateString(n,i+1,output);
        output[i]=6;
        generateString(n,i+1,output);
    }*/

//    Given an array A of size N denoting collection of numbers
//    that might contain duplicates, return all possible unique permutations.
//
//    NOTE: No 2 entries in the permutation sequence should be the same
//    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
//
//
//    }

    /*public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        int n=A.size();
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        returnSubsets(ans,A,res,n,0);
        Comparator com=new comImp();
        Collections.sort(res,com);
        return res;
    }

    private void returnSubsets(ArrayList<Integer> ans, ArrayList<Integer> a, ArrayList<ArrayList<Integer>> res, int n, int i) {
        if (i==n){
            res.add(new ArrayList<>(ans));
            return;
        }

        ans.add(a.get(i));
        returnSubsets(ans,a,res,n,i+1);
        ans.remove(ans.size()-1);
        returnSubsets(ans,a,res,n,i+1);
    }


    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> b= new ArrayList<>();
        int n=A.size();
        returnPermute(A,ans,b,n);
        return ans;
    }

    private void returnPermute(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> b, int n) {
        if (b.size()==n){
            ans.add(new ArrayList<>(b));
            return;
        }
        for ( int i=0; i<n; i++){
            if (b.contains(a.get(i))) {
                continue;
            }
                b.add(a.get(i));
                returnPermute(a,ans,b,n);
                b.remove(b.size()-1);


        }
    }


}

//class comImp implements Comparator<ArrayList<Integer>>{
//    @Override
//    public int compare(ArrayList<Integer> A, ArrayList<Integer> B) {
//
//        for (int i=0; i<A.size() && i<B.size();i++){
//            if (A.get(i)<B.get(i)){
//                return -1;
//            }
//            if (A.get(i)>B.get(i)){
//                return 1;
//            }
//        }
//        if(A.size() > B.size()){
//            return 1;
//        }
//        else{
//            return -1;
//        }
//    }*/
}






