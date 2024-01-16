import java.util.ArrayList;

public class equilibriumIndex {
    public static int solve(ArrayList<Integer> A){
        int n= A.size();
        int[] pSum=new int[n];
        pSum[0]=A.get(0);
        for (int i=1; i<n;i++){
            pSum[i]= pSum[i-1] + A.get(i);
        }
        if (pSum[n-1]-pSum[0]==0){
            return 0;
        }

        for (int k=1; k<n; k++){
            if( pSum[k-1]== pSum[n-1]- pSum[k]){
                return k;
            }
        }
        return -1;
    }
}
