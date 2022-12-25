package flutter.flutter;

public class Flutter {
    
    private SupportedPlatforms platform;

    public Flutter(SupportedPlatforms platform)  {
        this.platform = platform;
    }

    public void setTheme () {
        
        System.out.println("Setting Theme");
    }

    public void setRefreshRate () {
        
        System.out.println("Setting Refresh Rate");
    }

    public UIFactory createUIFactory () {
        
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
