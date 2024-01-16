package OOPS_Kunal;

public class BabyBox extends Box{
    double weight;

    public BabyBox() {
        this.weight = -1;
    }

    public BabyBox(double length, double width, double height, double weight) {
        super(length, width, height);//used to initialise values present in parent class
        this.weight = weight;
    }
}
