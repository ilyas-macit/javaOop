public class CustomerManager {
    private Customer customer;
    private CreditManager creditManager;
    public CustomerManager(Customer customer, CreditManager creditManager)
    {
        this.customer = customer;
        this.creditManager = creditManager;
    }
    public void Save(){
        System.out.println("Saved");
    }
    public void GiveCredit(){
        creditManager.Calculate();
    }
}
