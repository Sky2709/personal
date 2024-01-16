package LLD_DesignPattern.Factory;

import LLD_DesignPattern.Factory.Component.Button.Button;
import LLD_DesignPattern.Factory.Component.DropDown.DropDown;
import LLD_DesignPattern.Factory.Component.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
