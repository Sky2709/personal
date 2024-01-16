import java.util.ArrayList;

class Student{
    int rno;
    String name;
    float marks;



    Student(String name, int rno, float marks){
        this.name=name;
        this.rno=rno;
        this.marks=marks;
    }
//    Student(String naam, int roll, float markss){ //to use same variable as class have to use 'this' keyword
//        name=naam;
//        rno=roll;
//        marks=markss;
//    }

//    Student(Student other){
//        name=other.name;
//        marks=other.marks;
//        rno=other.rno;
//    }
}
public class Main {
    public static void main(String[] args) {
        var kunal= new Student("Kunal Kushwaha", 13, 87f);
//        kunal.name="Kunal Kushwaha";
//        System.out.println(kunal.name);
//        var random= new Student(kunal);
//        System.out.println(random.marks);
    }
}
