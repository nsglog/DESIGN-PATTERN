public class ChocolateScoop implements IceCreamConstituents {

    private IceCreamConstituents iceCreamConstituents;

    public ChocolateScoop(IceCreamConstituents iceCreamConstituents) {
        this.iceCreamConstituents = iceCreamConstituents;
    }


    @Override
    public int getCost() {
        return iceCreamConstituents.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return iceCreamConstituents.getDescription() + "ChocolateScoop + ";
    }
}
