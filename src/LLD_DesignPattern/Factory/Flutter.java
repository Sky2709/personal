package LLD_DesignPattern.Factory;

public class Flutter {


    public void setTheme(){
        System.out.println("Setting Theme");
    }
    public void setRefreshRate(){
        System.out.println("Setting Refresh Rate");
    }



    public UIFactory createUIFactory(String platform){
//        if (platform.trim().equalsIgnoreCase("Android")){
//            return new AndroidFactory();
//        } else if (platform.trim().equalsIgnoreCase("IOS")){
//            return new IOSFactory();
//            }
//        else{
//            return null;
//        }

        return UIFactoryFactory.getUIFactoryForPlatform(platform);

    }
}
