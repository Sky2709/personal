/*class Employee{
   String name;
   int salary;
   public int getSalary(){
       return salary;
   }
   public String getName(){
       return name;
   }
   public void setName(String n) {
       name=n;
    }
}
class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}*/

/*class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
public class Practice {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        Collections.reverse(A);
        int carry=0;
        int n=A.size();
        for (int i=0; i<n; i++){
            if (i==0){
                A.set(i, A.get(i)+1+carry);
            }
            else if (carry!=0) {
                A.set(i,A.get(i)+carry);
            }
            carry=A.get(i)/10;
            if (carry!=0){
                A.set(i,A.get(i)%10);
            }
        }

        if (carry!=0){
            A.set(A.size()-1,carry);
        }
        Collections.reverse(A);
        return A;
    }

    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        int n=A.size();
        int sum=0;
        int i=0;
        int max=-1;
        while (i<n){
            while (i<n && A.get(i)<0){
                i++;
                continue;
            }
            while (i<n && 0<A.get(i)){
                sum+=A.get(i++);
                max=Math.max(max,sum);
            }
            sum=0;
        }
        return max;
    }

    public int solve(ArrayList<Integer> A, int B) {
        int curPoint=0;
        int maxPoint=0;
        for (int i=0; i<B;i++){
            curPoint+=A.get(i);
        }
        maxPoint=curPoint;
        int j=A.size()-1;
        for (int i=B-1; i>=0; i--){
            curPoint=curPoint+A.get(j)-A.get(i);
            maxPoint=Math.max(curPoint,maxPoint);
            j--;
        }
        return maxPoint;
    }

    public int solve(ArrayList<Integer> A) {
        int sum=0;
        int leftSum=0;
        for (int i=0; i<A.size(); i++){
            sum+=A.get(i);
    }
        for (int i=0; i<A.size(); i++){
            sum -=A.get(i);
            if (leftSum==sum){
                return i;
            }
            leftSum+=sum;
        }
        return -1;
}

    public int maximumGap(final List<Integer> A) {
        int len= A.size();
        int []rightMax= new int[len];
        rightMax[len-1]= A.get(len-1);
        for (int i=0; i<len; i++){
            rightMax[len-1-i]= Math.max(rightMax[len-i],A.get(len-i-1));
        }

        int p1=0;
        int p2=0;
        int ans= Integer.MIN_VALUE;
        while (p1<len && p2<len){
            if (rightMax[p1]>=A.get(p2)){
                ans=Math.max(ans, p1-p2);
                p1++;
            }
            else {
                p2++;
            }
        }
        return ans;
    }

    public int solve(ArrayList<Integer> A, int B) {
        int snowBalls=0;
        for (int i=0; i<A.size(); i++){
            if (A.get(i)<=B){
                snowBalls++;
            }
        }

        int swap=0;
        int ansSwap= Integer.MAX_VALUE;
        for (int i=0; i<snowBalls; i++){
            if (A.get(i)>B){
                swap++;
            }
        }

        ansSwap=Math.min(ansSwap,swap);

        for (int i=snowBalls; i<A.size();i++){
            if (A.get(i-snowBalls) <= B && A.get(i)>B){
                swap++;
            }
            else if (A.get(i-snowBalls) > B && A.get(i)<=B) {
                swap--;
            }
            ansSwap=Math.min(swap,ansSwap);
        }
        return ansSwap;
    }

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int top=0;
        int bottom= A-1;
        int left=0;
        int right= A-1;
        int d=0;
        ArrayList<ArrayList<Integer>> answer= new ArrayList<ArrayList<Integer>>();
        int num=1;

        while (left<=right && top<=bottom){
            if (d==0){
                for (int i=left; i<=right;i++){
                    answer.get(top).set(i,num);
                    num++;
                }
                d=1;
                top++;
            }
            else if (d==1) {
                for (int i=top; i<=bottom;i++){
                    answer.get(i).set(right,num);
                    num++;
                }
                d=2;
                right--;
            }
            else if (d==2) {
                for (int i=right; i>=left;i--){
                    answer.get(bottom).set(i,num);
                    num++;
                }
                d=3;
                bottom--;
            }
            else if (d==3) {
                for (int i=bottom; i>=top;i--){
                    answer.get(left).set(left,num);
                    num++;
                }
                d=0;
                left++;
            }
        }
        return answer;
    }
}*/
