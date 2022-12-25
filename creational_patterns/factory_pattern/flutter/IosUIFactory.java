package flutter.flutter;

import flutter.flutter.flutter.components.buttonComponent.Button;
import flutter.flutter.flutter.components.buttonComponent.IosButton;
import flutter.flutter.flutter.components.dropdownComponent.DropDown;
import flutter.flutter.flutter.components.dropdownComponent.IosDropDown;
import flutter.flutter.flutter.components.menuComponent.IosMenu;
import flutter.flutter.flutter.components.menuComponent.Menu;

class IosUIFactory implements UIFactory {
    
    public Button createButton () {
        return new IosButton();
    }

    public Menu createMenu () {
        return new IosMenu();
    }

    public DropDown createDropdown () {
        return new IosDropDown();
    }
}
