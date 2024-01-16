package threadsPractice;

public class helloWorldPrinter implements Runnable {

    public void printName(){
        System.out.println("Inside Print Name Method " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        printName();
        System.out.println("Hello World " + Thread.currentThread().getName());
    }
}
