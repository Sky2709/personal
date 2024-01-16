import java.util.ArrayList;

public class maxFromBothSides {
    public int solve(ArrayList<Integer> A, int B) {
        int currPoints=0;
        int maxPoints=0;
        for (int i=0; i< B; i++){
            currPoints +=A.get(i);
        }

        maxPoints= currPoints;

        int n= A.size()-1;
        for (int i= B-1; i>=0;i--){
            currPoints= currPoints + A.get(n) - A.get(i);
            maxPoints= Math.max(currPoints, maxPoints);
            n--;
        }
        return maxPoints;
    }
}
