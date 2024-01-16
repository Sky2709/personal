import java.util.Scanner;

public class oddEvenSeparate { //testCaseBasis
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int testCase = sc.nextInt();
            for (int i = 1; i <= testCase; i++) {
                int num = sc.nextInt();
                int[] arr = new int[num];
                for (int j = 0; j <= num-1; j++) {
                    arr[j] = sc.nextInt();
                }
                int evenSize=0;
                int oddSize=0;
                for (int k=0; k<=num-1;k++) {
                    if (arr[k]%2==0){
                        evenSize++;
                    }
                    else {
                        oddSize++;
                    }
                }
                int[] odd= new int[oddSize];
                int[] even= new int[evenSize];
                int j = 0, k = 0;
                for (int l = 0; l < num; l++) {
                    if (arr[l] % 2 == 0)
                        even[j++] = arr[l];
                    else
                        odd[k++] = arr[l];
                }
                printArray(odd);
                printArray(even);
            }
        }

        public static void printArray(int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
