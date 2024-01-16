package LLD_DesignPattern.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Employee employee= EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(employee.name());
        System.out.println(employee.salary());

        Employee employee1= EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(employee1.name());
        System.out.println(employee1.salary());
    }
}
