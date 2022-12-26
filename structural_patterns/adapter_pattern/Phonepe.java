public class Phonepe {

    private BankAdapterAPI bankAdapterAPI;

    public Phonepe(BankAdapterAPI bankAdapterAPI)   {
        this.bankAdapterAPI = bankAdapterAPI;
    }

    public static void main(String[] args) throws InterruptedException {
        Phonepe phonepe = new Phonepe(new YesBankAdapterAPI());
        phonepe.doPaisaDouble();
    }

    public void doPaisaDouble() {
        double balance = bankAdapterAPI.getBalance();
        System.out.println(balance * 2);
    }
}
