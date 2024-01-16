import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class activity{
    //String name;
    int startTime;
    int endTime;

    activity(int s, int e){
        startTime=s;
        endTime=e;
    }
    int getKey(){
        return endTime;
    }

    /*int getKeys(){
        return startTime;
    }*/

    void print(){
        System.out.println(startTime + " - " + endTime);
    }

}

public class SortingActivity {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        activity []arr= new activity[n];
        for(int i=0; i<n; i++){
            int s= sc.nextInt();
            int e= sc.nextInt();
            arr[i]= new activity(s,e);
        }

        Arrays.sort(arr, Comparator.comparing(activity ::getKey));
       // Arrays.sort(arr, Comparator.comparing(activity ::getKey).thenComparing(activity::getKeys));

        //algorithm
        int cnt=1;
        int endTime= arr[0].endTime;
        for (int i=1; i<n; i++){
            if (arr[i].startTime >= endTime){
                cnt++;
                endTime=arr[i].endTime;
            }
        }
        System.out.println(cnt);

        //for (activity a: arr) {
        //    a.print();
        //}
    }
}
