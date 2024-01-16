import java.util.Arrays;

public class
SortingClasses {

    public static void bubbleSort(int[] arr){  //Bubble Sorting (Stable Sort)
        int n= arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<=n-i-2; j++){
                if (arr[j]> arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.print("Bubble sort " + Arrays.toString(arr));
        System.out.println();
    }

    public static void selectionSort(int[] arr){  //Selection Sorting (Unstable Sort)
        int n= arr.length;
        for (int i=0; i<=n-2; i++){
            int smallestIdx=i;
            for (int j=i+1; j<=n-1; j++){
                if (arr[j] < arr[smallestIdx]){
                    smallestIdx=j;
                }
            }
            int temp= arr[i];
            arr[i]= arr[smallestIdx];
            arr[smallestIdx]= temp;
        }
        System.out.print("Selection sort " + Arrays.toString(arr));
        System.out.println();
    }

    public static void insertionSort(int[] arr){ //Insertion Sorting (Stable Sort)
        int n= arr.length;
        for (int i=1; i<n-1; i++){
            int j=i-1;
            int temp= arr[i];
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= temp;
        }
        System.out.print("Insertion sort " + Arrays.toString(arr));
        System.out.println();
    }

    public static void countingSort(int[] arr){ //Counting Sorting

        int n= arr.length;
        int[] output= new int[n+1];

        int max=arr[0];
        for (int i=1; i<n; i++ ){
            if (arr[i]> max){
                max=arr[i];
            }
        }

        int [] count= new int[max+1];
        for (int i = 0; i <=max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

        System.out.print("Counting Sort " + Arrays.toString(arr));
        System.out.println();
    }

    public static void mergeSort(int [] arr, int start, int end){
        if (end-start==1){  //Base Case
            return;
        }

        int mid= (start+end)/2;
        //Recursive Case
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        mergeFunction(arr,start,mid,end);
    }

    public static void mergeFunction(int[] arr, int start, int mid, int end){
        int n= arr.length;
        int []temp= new int[n];

        int i=start;
        int j= mid;
        int k=start;

        while(i<mid && j<end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //copy remaining elements
        while(i<mid){
            temp[k]= arr[i];
            k++;
            i++;
        }
        while(j<end){
            temp[k]= arr[j];
            k++;
            j++;
        }

        // copy all elements from temp to arr

        for (int l=start; l<temp.length; l++){
            arr[start+l]= temp[l];
        }
    }

    public static int[] mergeSortArray(int[]arr){
        if (arr.length==1){
            return arr;
        }

        int mid=arr.length/2;
        int[] left= mergeSortArray(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergeSortArray(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeFunctionArray(left,right);
    }

    private static int[] mergeFunctionArray(int[] first, int[] second) {
        int[]merged= new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i< first.length && j<second.length){
            if (first[i]<second[j]){
                merged[k]=first[i];
                i++;
            }
            else{
                merged[k]=second[j];
                j++;
            }
            k++;
        }

        while (i<first.length){
            merged[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length){
            merged[k]=second[j];
            j++;
            k++;
        }
        return merged;
    }



   public static void quickSort(int []arr, int start, int end){
        int n= arr.length;
        if (start>=end){
            return;
        }
        int p= partition(arr, start, end);
        quickSort(arr,start,p-1);
        quickSort(arr,p+1, end);

       System.out.println("Quick Sort "+Arrays.toString(arr));
    }
    public static int partition(int[]arr, int start, int end){
        int pivot= arr[end];
        int i=start-1;
        for (int j=start; j<=end-1; j++){
            if (arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }
        int temp=arr[end];
        arr[end]= arr[i+1];
        arr[i+1] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr= {1,5,6,4,8,2,4,0,3};
        int start= 0;
        int end= arr.length;
//        bubbleSort(arr);               //right
//        selectionSort(arr);            //right
//        insertionSort(arr);            //right
//        countingSort(arr);             //right
//        quickSort(arr,start,end);
          mergeSort(arr,start,end);
          System.out.println("Merge Sort " + Arrays.toString(arr));
//        arr=mergeSortArray(arr);
//        System.out.println("Merged Sorted New Array " + Arrays.toString(arr));
    }

    public static void swap(int a, int b){
        int temp= a;
        a= b;
        b= temp;
    }
}
