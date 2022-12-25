package flutter.flutter;

import flutter.flutter.flutter.components.buttonComponent.AndroidButton;
import flutter.flutter.flutter.components.buttonComponent.Button;
import flutter.flutter.flutter.components.dropdownComponent.AndroidDropDown;
import flutter.flutter.flutter.components.dropdownComponent.DropDown;
import flutter.flutter.flutter.components.menuComponent.AndroidMenu;
import flutter.flutter.flutter.components.menuComponent.Menu;

class AndroidUIFactory implements UIFactory {
    
    @Override
    public Button createButton () {
        
        return new AndroidButton();
    }

    @Override
    public Menu createMenu () {
        
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropdown () {
        
        return new AndroidDropDown();
    }
}
