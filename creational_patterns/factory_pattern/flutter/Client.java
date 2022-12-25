package flutter.flutter;

import flutter.flutter.flutter.components.buttonComponent.Button;
import flutter.flutter.flutter.components.dropdownComponent.DropDown;
import flutter.flutter.flutter.components.menuComponent.Menu;

class Client {

    public static void main(String[] args)  {
    
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);

        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.createButton();
    
        Menu menu = uiFactory.createMenu();

        DropDown dropDown = uiFactory.createDropdown();
    }
}
