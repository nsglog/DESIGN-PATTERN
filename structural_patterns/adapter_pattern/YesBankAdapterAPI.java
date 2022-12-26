public class YesBankAdapterAPI implements BankAdapterAPI {
//    YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public Double getBalance() {
        return (double)100;
    }
    @Override
    public String getAccountDetails() {
        return null;
    }
}
