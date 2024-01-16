import java.util.Arrays;
class employee{
    int id;
    String name;
    int salary;
    public void PrintDetails(){
        System.out.println("My ID is: " + id);
        System.out.println("My name is: " + name);
    }
    public void getSalary(){
        System.out.println("My Salary is: " + salary);;
    }
}
public class SumArray {
    public static void main(String[] args) {
        employee sky= new employee();
        sky.id=14;
        sky.name="Akash";
        sky.salary= 13000;
        sky.PrintDetails();
        sky.getSalary();

        employee rohan= new employee();
        rohan.id=17;
        rohan.name="Rohan";
        rohan.salary= 11000;
        rohan.PrintDetails();
        rohan.getSalary();

    }
}
