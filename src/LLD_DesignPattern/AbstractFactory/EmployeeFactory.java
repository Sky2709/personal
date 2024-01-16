package LLD_DesignPattern.AbstractFactory;

public class EmployeeFactory {
    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();

    }
}
