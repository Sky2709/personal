import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class binarySearch {
   public static int binary(int []arr, int T){
        Arrays.sort(arr);
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;  // == (start+end)/2
            if (arr[mid]==T){
                return mid;
            }
            else if (arr[mid]>T) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int recursiveBSearch(int[] arr, int T, int s, int e){
        if (s>e){
            return -1;
        }

        int mid=s+ (e-s)/2; // == (start+end)/2
        if (arr[mid]==T){
            return mid;
        }
        if(arr[mid]>T){
            return recursiveBSearch(arr, T, s, mid-1);
        }
        return recursiveBSearch(arr, T, mid+1, e);
    }

    public static void main(String[] args) {
        int[] arr= {45, 36, 74, 12, 8, 14, 38, 29, 99, 1};
        int target= 38;
        int start=0;
        int end= arr.length-1;
        System.out.println(binary(arr, target));
        System.out.println("recursively "+ recursiveBSearch(arr, target,start,end));
    }
}
