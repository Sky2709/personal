package LLD_DesignPattern.Factory;

import LLD_DesignPattern.Factory.Component.Button.IOSButton;
import LLD_DesignPattern.Factory.Component.DropDown.IOSDropDown;
import LLD_DesignPattern.Factory.Component.Menu.IOSMenu;

public class IOSFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropDown createDropDown() {
        return new IOSDropDown();
    }
}
