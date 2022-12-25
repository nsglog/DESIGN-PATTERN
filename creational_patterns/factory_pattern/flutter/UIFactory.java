package flutter.flutter;

import flutter.flutter.flutter.components.buttonComponent.Button;
import flutter.flutter.flutter.components.dropdownComponent.DropDown;
import flutter.flutter.flutter.components.menuComponent.Menu;

public interface UIFactory {
    
    public Button createButton();
    public Menu createMenu();
    public DropDown createDropdown();

}
