package threadsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class mergeSorterTask implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    public mergeSorterTask(List<Integer> arrayToSort) {
        this.arrayToSort=arrayToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size() <=1){
            return arrayToSort;
        }

        int mid= arrayToSort.size()/2;

        List<Integer> left= new ArrayList<>();
        for (int i=0; i<mid;i++){
            left.add(arrayToSort.get(i));
        }
        List<Integer> right= new ArrayList<>();
        for (int i=mid; i<arrayToSort.size();i++){
            right.add(arrayToSort.get(i));
        }

        mergeSorterTask leftSorter= new mergeSorterTask(left);
        mergeSorterTask rightSorter= new mergeSorterTask(right);

        List<Integer> leftSortedArray= leftSorter.call();
        List<Integer> rightSortedArray= rightSorter.call();

        List<Integer> sortedArray= new ArrayList<>();

        int i=0;
        int j=0;


        return null;
    }
}
