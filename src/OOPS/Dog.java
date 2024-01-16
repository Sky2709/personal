package OOPS;

public class Dog {
    String name;
    int power;
    void introduce(){
        System.out.println("My Name is " + name);
        System.out.println("Power is "+ power);
    }
    void bark(){
        for (int i=0; i<power; i++){
            System.out.print("Bhow ! ");
        }
        System.out.println();
    }
}
