public class IciciBankAdapterAPI implements BankAdapterAPI {

//    IciciBankAPI iciciBankApi = new IciciBankAPI();

    @Override
    public Double getBalance() {
        return (double)1000;
    }

    @Override
    public String getAccountDetails() {
        return null;
    }
}
