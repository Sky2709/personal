package LLD_DesignPattern.singleton;

public class Jalebi {
    private static Jalebi jalebi =new Jalebi();
    //Eager way of creation
    public static Jalebi getJalebi(){
        return jalebi;
    }
}
