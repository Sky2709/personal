package LLD_DesignPattern.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(String platform){
        if (platform.trim().equalsIgnoreCase("Android")){
            return new AndroidFactory();
        } else if (platform.trim().equalsIgnoreCase("IOS")){
            return new IOSFactory();
        }
        else return null;
    }
}
