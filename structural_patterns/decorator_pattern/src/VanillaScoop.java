public class VanillaScoop implements IceCreamConstituents   {

    private IceCreamConstituents iceCreamConstituents;

    public VanillaScoop(IceCreamConstituents iceCreamConstituents) {
        this.iceCreamConstituents = iceCreamConstituents;
    }

    @Override
    public int getCost() {
        return iceCreamConstituents.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCreamConstituents.getDescription() + "Vanilla scoop + ";
    }
}
