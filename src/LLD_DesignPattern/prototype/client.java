package LLD_DesignPattern.prototype;

public class client {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Creating object using prototype design pattern");
//
//        NetworkConnection networkConnection= new NetworkConnection();
//        networkConnection.setIp("132.25.63.4");
//        networkConnection.loadVeryImportantData();
//
//
//        System.out.println(networkConnection);
//
//        try {
//            NetworkConnection  networkConnection1=(NetworkConnection) networkConnection.clone();
//            System.out.println(networkConnection1);
//        }catch (CloneNotSupportedException e){
//            e.printStackTrace();
//        }


        //Student related

//        StudentRegistry registry= new StudentRegistry();
//        fillRegistry(registry);
//
//        Student x= registry.get("march21")







    }

    private static void fillRegistry(StudentRegistry registry){
        Student march23Batch=new Student();
        march23Batch.setBatchName("march23");
        march23Batch.setAvgBatchPsp(87);
        registry.register("march23Batch", march23Batch);
    }
}
