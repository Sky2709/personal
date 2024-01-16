import java.util.PriorityQueue;

public class Heaps {
    class maxHeap {
        int[] arr;
        int capacity;
        int size;

        maxHeap(int maxLimit) {
            capacity = maxLimit;
            size = 0;
            arr = new int[capacity + 1];
        }


        void insert(int data) {
            size = size + 1;
            int idx = size;
            arr[idx] = data;
            while (idx > 1 && arr[idx] > arr[idx / 2]) {
                swap(arr[idx], arr[idx / 2]);
                idx = idx / 2;
            }
        }

        void swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
        }


        int getMax() {
            return arr[1];
        }

        void removeMax() {
            swap(arr[1], arr[size]);
            size = size - 1;
            int idx = 1;
            while (idx <= size) {
                int maxIdx = idx;
                int left = 2 * idx;
                int right = 2 * idx + 1;

                if (left <= size && arr[left] > arr[idx]) {
                    maxIdx = left;
                }
                if (right <= size && arr[right] > arr[maxIdx]) {
                    maxIdx = right;
                }
                if (maxIdx == idx) {
                    break;
                }

                swap(arr[idx], arr[maxIdx]);
                idx = maxIdx;

            }
        }

//        public int solve(int[] A) {
//            PriorityQueue<Integer> pq= new PriorityQueue<>();
//            for (int x:A) {
//                pq.add(x);
//            }
//            int cost=0;
//            while (pq.size()>1){
//                int r1=pq.poll();
//                int r2=pq.poll();
//                cost=cost+(r1+r2);
//                pq.add(r1+r2);
//            }
//            return cost;
//        }
    }
//        public int[] solve(int[] A) {
//        int[] answer = new int[A.length];
//        PriorityQueue<Integer> pq= new PriorityQueue<>();
//        int val=1;
//        for (int i=0; i<3; i++){
//            pq.add(A[i]);
//            val*=A[i];
//            if (i<2){
//                answer[i]=-1;
//            }
//            else{
//                answer[i]=val;
//            }
//        }
//        for (int i=3; i<A.length; i++) {
//            if(A[i]> pq.peek()){
//                val=val/pq.poll()*A[i];
//                pq.add(A[i]);
//            }
//            answer[i]=val;
//        }
//        return answer;
//    }





}
