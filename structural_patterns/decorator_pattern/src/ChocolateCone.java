public class ChocolateCone implements IceCreamConstituents {

    private IceCreamConstituents iceCreamConstituents;
    public ChocolateCone() {}

    public ChocolateCone(IceCreamConstituents iceCreamConstituents) {
        this.iceCreamConstituents = iceCreamConstituents;
    }
    @Override
    public int getCost() {
        if (iceCreamConstituents != null) {
            return iceCreamConstituents.getCost() + 10;
        }
        return 10;
    }

    @Override
    public String getDescription() {

        if (iceCreamConstituents != null) {
            return iceCreamConstituents.getDescription() + "ChocolateCone + ";
        }
        return "ChocolateCone + ";
    }
}
