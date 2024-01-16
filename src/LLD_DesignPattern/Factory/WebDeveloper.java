package LLD_DesignPattern.Factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Web Developer Salary");
        return 7800;

    }
}
