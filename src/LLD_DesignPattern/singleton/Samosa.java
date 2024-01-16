package LLD_DesignPattern.singleton;

public class Samosa {
    private static Samosa samosa;
    private Samosa(){}
    //lazy way of creation
//    public synchronized static Samosa getSamosa(){    //Method synchronization
//        if (samosa==null){
//            return samosa=new Samosa();
//        }
//        return samosa;
//    }


    public static Samosa getSamosa(){    //Method synchronization
        if (samosa==null){
            synchronized (Samosa.class){
                if (samosa==null){
                    return samosa=new Samosa();
                }
            }
        }
        return samosa;
    }
}
