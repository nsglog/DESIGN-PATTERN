//this is the implementation of practical factory

package flutter.flutter;

import flutter.flutter.SupportedPlatforms;
import flutter.flutter.UIFactory;

public class UIFactoryFactory {
    
    public static UIFactory getUIFactoryForPlatform (SupportedPlatforms platform) {
        
        // this code structure below will return the desired object from the factory of various available classes
        switch (platform)    {
            
            case ANDROID : return new AndroidUIFactory();
            
            case IOS : return new IosUIFactory();

            default : return new AndroidUIFactory();
        }
    }
}
