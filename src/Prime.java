import java.util.Arrays;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
     int n= 100;
     sieveOfEratosthenes(n);
    }
    public static void sieveOfEratosthenes(int n){
        boolean []prime= new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]=false;
        for (int i=2; i * i<=n; i++){
            if (prime[i]== true){
                for (int j= i*i; j<=n; j= j+i){
                    prime[j]=false;
                }
            }
        }
        for (int j=2; j<=n; j++){
            if (prime[j]==true){
                System.out.print(j + " ");
            }
        }
    }

}
