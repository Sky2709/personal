package LLD_DesignPattern.AbstractFactory;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Web Developer Salary");
        return 9000;
    }

    @Override
    public String name() {
        return "I am Web Developer";
    }
}
