package bird;

public abstract class bird {
    String name;
    int age;
    String colour;
    public abstract void fly();
    public abstract void makeSound();


}

class sparrow extends bird{

    @Override
    public void fly() {

    }

    @Override
    public void makeSound() {

    }
}
