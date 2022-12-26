public class OrangeCone implements IceCreamConstituents {

    private IceCreamConstituents iceCreamConstituents;

    public OrangeCone() {}

    public OrangeCone(IceCreamConstituents iceCreamConstituents) {
        this.iceCreamConstituents = iceCreamConstituents;
    }


    @Override
    public int getCost() {

        if (iceCreamConstituents != null) {
            return iceCreamConstituents.getCost() + 5;
        }
        return 5;
    }

    @Override
    public String getDescription() {

        if (iceCreamConstituents != null) {
            return iceCreamConstituents.getDescription() + "OrangeCone + ";
        }
        return "OrangeCone + ";
    }
}