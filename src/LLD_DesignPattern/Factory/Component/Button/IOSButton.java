package LLD_DesignPattern.Factory.Component.Button;

public class IOSButton implements Button{
    @Override
    public IOSButton clickButton() {
        return new IOSButton();
    }
}
