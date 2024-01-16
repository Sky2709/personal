import java.util.ArrayList;

public class pSum2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(6);
        ArrayList<Integer> arrA= new ArrayList<>();
        arrA.add(6);
        arrA.add(5);
        arrA.add(1);
        ArrayList<Integer> arrB= new ArrayList<>();
        arrB.add(9);
        arrB.add(5);
        arrB.add(8);
        array.add(arr);
        array.add(arrA);
        array.add(arrB);
        System.out.println(array);
        System.out.println(prefixSum(array));;


    }
    /*public static void pSumArray(ArrayList<ArrayList<Integer>> A){ // pSum Array of arraylist
        int row=A.size();
        int col= A.get(0).size();
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
        for (int i=0; i< pSum.length;i++){
            for (int j=0; j<pSum[i].length; j++){
                System.out.print(pSum[i][j] + " ");
            }
            System.out.println();
        }
    }*/


  /*  public static ArrayList<ArrayList<Long>> prefixSum(ArrayList<ArrayList<Long>> A){
        ArrayList<ArrayList<Long>> Sum= new ArrayList<ArrayList<Long>>();
        int N= A.size();
        int M= A.get(0).size();
        for (int i=0; i<N; i++){
            Sum.add(new ArrayList<Long>());
            for (int j=0; j<M; j++){
                Sum.get(i).add((long)0);
            }
        }
        //Set first cell
        Sum.get(0).set( 0, (long)A.get(0).get(0));
        //set first column
        for (int i=1; i<N; i++){
            Sum.get(i).add(0, (long) A.get(i).get(0) +Sum.get(i-1).get(0));
        }
        // Set first row
        for (int i=1; i<M; i++){
            Sum.get(0).set(i,(long) A.get(0).get(i)+ Sum.get(0).get(i-1));
        }

        //Set rest of
        for (int i=1; i<N; i++){
            for (int j=1; j<M; j++){
                long value= (long)( Sum.get(i-1).get(j) + Sum.get(i).get(j-1) + A.get(i).get(j)- Sum.get(i-1).get(j-1));
                Sum.get(i).set(j,value);
            }
        }
        return Sum;
    }*/


    public static ArrayList<ArrayList<Integer>> prefixSum(ArrayList<ArrayList<Integer>> A){
        ArrayList<ArrayList<Integer>> Sum= new ArrayList<ArrayList<Integer>>();
        int N= A.size();
        int M= A.get(0).size();
        for (int i=0; i<N; i++){
            Sum.add(new ArrayList<Integer>());
            for (int j=0; j<M; j++){
                Sum.get(i).add(0);
            }
        }
        //Set first cell
        Sum.get(0).set( 0, A.get(0).get(0));
        //set first column
        for (int i=1; i<N; i++){
            Sum.get(i).add(0,  A.get(i).get(0) +Sum.get(i-1).get(0));
        }
        // Set first row
        for (int i=1; i<M; i++){
            Sum.get(0).set(i, A.get(0).get(i)+ Sum.get(0).get(i-1));
        }

        //Set rest of
        for (int i=1; i<N; i++){
            for (int j=1; j<M; j++){
                int value= ( Sum.get(i-1).get(j) + Sum.get(i).get(j-1) + A.get(i).get(j)- Sum.get(i-1).get(j-1));
                Sum.get(i).set(j,value);
            }
        }
        return Sum;
    }
}
