public class Client {
    public static void main(String[] args) {
        IceCreamConstituents icecream = new ChocoChips(
                                            new ChocolateScoop(
                                                    new VanillaScoop(
                                                            new ChocolateCone()
                                                    )
                                                )
                                            );

        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
    }
}