package LLD_DesignPattern.Factory;

import LLD_DesignPattern.Factory.Component.Button.AndroidButton;
import LLD_DesignPattern.Factory.Component.DropDown.AndroidDropDown;
import LLD_DesignPattern.Factory.Component.Menu.AndroidMenu;

public class AndroidFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }
}
