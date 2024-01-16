import java.util.Scanner;

public class ArrayRotation {//right code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayDig = sc.nextInt();
        int[] arr = new int[arrayDig];
        for (int i = 0; i < arrayDig; i++) {
            arr[i] = sc.nextInt();
        }
        int arrayRot = sc.nextInt();
        int arrRot= arrayRot % arrayDig;
        reverse(arr,0, arrayDig-1);
        reverse(arr, 0, arrRot-1);
        reverse(arr, arrRot,arrayDig-1 );

        for( int i=0; i< arrayDig;i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void reverse( int[] arr, int start, int end){
        while (start<end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

}
