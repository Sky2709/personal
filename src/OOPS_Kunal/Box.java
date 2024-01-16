package OOPS_Kunal;

public class Box {
   double length;
   double width;
   double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(){
        this.length=-1;
        this.width=-1;
        this.height=-1;
    }

    Box (Box old){
        this.length=old.length;
        this.width=old.width;
        this.height=old.height;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
