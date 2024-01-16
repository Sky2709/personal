import java.util.ArrayList;

public class Divisor {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> sol= new ArrayList<>();
        int count=0;
        for (int i=0; i<A.size(); i++) {
            count = 0;
            for (int j = 1; j <= Math.sqrt(A.get(i)); j++) {
                if (A.get(i) % j == 0) {
                    if (A.get(i) / j == j) {
                        count++;
                    } else {
                        count = count + 2;
                    }
                }
            }
            sol.add(count);
        }
        return sol;

    }

    public static void main(String[] args) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(10);

        System.out.println(solve(result));
    }
}
