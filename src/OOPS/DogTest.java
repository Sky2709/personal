package OOPS;

public class DogTest {
    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.name= "Bruno";
        d1.power= 5;
        Dog d2= new Dog();
        d2.name= "Pluto";
        d2.power= 8;
        d1.introduce();
        d1.bark();
        d2.introduce();
        d2.bark();
     }
}
