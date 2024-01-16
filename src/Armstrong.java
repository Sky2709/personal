import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int digit;
        for (int i=0; i<=N; i++){
            i=N/10;
            digit=i;
            System.out.println(digit);
        }
    }
}
