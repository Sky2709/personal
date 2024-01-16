import java.util.Scanner;
public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();
        for (int i=1; i<=input; i++){
            int digit= sc.nextInt();
            int div;
            int count=0;
            for (int j=1; j<digit; j++){
                if (digit%j==0) {
                    div=j;
                    count=count+div;
                   // System.out.println(div );
                }
            }
          //  System.out.println(count);
            if (count==digit){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
