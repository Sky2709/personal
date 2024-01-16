import java.util.Arrays;
import java.util.Scanner;
public class Jail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= 101;
        int[] arr= new int[N];
        Arrays.fill(arr,1);
        int count=0;
        for (int r=0; r<= arr.length; r++ ){
            for (int i=r; i<= arr.length; i=i+r){
               arr[i]= 1- arr[i];
            }
        }
        for (int i=1; i<=N; i++ ){
            if(arr[i]==1){
                count++;
            }
            System.out.println(count);
        }

    }
}
