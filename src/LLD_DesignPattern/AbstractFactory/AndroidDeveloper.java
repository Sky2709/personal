package LLD_DesignPattern.AbstractFactory;

public class AndroidDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("Android Developer Salary");
        return 5000;
    }

    @Override
    public String name() {
        return "I am Android Developer";
    }
}
