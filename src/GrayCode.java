import java.util.ArrayList;
import java.util.Scanner;

public class GrayCode {
    public static ArrayList<Integer> grayCode(int A){
        ArrayList<Integer> result= new ArrayList<>();
        result.add(0);
        result.add(1);
        for (int i=2; i<=A; i++){
            for (int j=result.size()-1; j>=0; j-- ){
                result.add(result.get(j)+ (1<<(i-1)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        System.out.println(grayCode(A));
    }
}
