package LLD_DesignPattern.Factory;

public class Client {
    public static void main(String[] args) {
        Employee employee= EmployeeFactory.getEmployee("Android Developer");
        System.out.println( employee.salary());

        Employee employee1=EmployeeFactory.getEmployee("   Web Developer  ");
        System.out.println(employee1.salary());





        //Android IOS Flutter
        Flutter flutter=new Flutter();
        UIFactory factory= flutter.createUIFactory("android");
        factory.createButton();
        factory.createDropDown();
        factory.createMenu();

    }




}
