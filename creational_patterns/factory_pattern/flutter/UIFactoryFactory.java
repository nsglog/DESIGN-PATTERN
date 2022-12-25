package flutter.flutter;

import flutter.flutter.SupportedPlatforms;
import flutter.flutter.UIFactory;

public class UIFactoryFactory {
    
    public static UIFactory getUIFactoryForPlatform (SupportedPlatforms platform) {
        
        switch (platform)    {
            
            case ANDROID : return new AndroidUIFactory();
            
            case IOS : return new IosUIFactory();

            default : return new AndroidUIFactory();
        }
    }
}
