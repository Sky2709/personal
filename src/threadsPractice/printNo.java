package threadsPractice;

public class printNo implements Runnable {
    private int no;
    public printNo(int no){
       this.no=no;
    }

    @Override
    public void run() {
        System.out.println("Print No. " + no +" "+ Thread.currentThread().getName() );
    }
}
