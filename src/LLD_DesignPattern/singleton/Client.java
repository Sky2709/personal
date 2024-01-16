package LLD_DesignPattern.singleton;

public class Client {
    public static void main(String[] args) {
       Samosa s1= Samosa.getSamosa();
       Samosa s2= Samosa.getSamosa();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Jalebi j1=Jalebi.getJalebi();

        Jalebi j2 = Jalebi.getJalebi();
        System.out.println(j1.hashCode());
        System.out.println(j2.hashCode());


        Samosa s3= Samosa.getSamosa();
        System.out.println(s3.hashCode());

    }
}
