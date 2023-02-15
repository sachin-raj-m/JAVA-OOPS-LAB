import Bank.Balance;

class BalanceMain {
    
    public static void main(String args[])
    {
        Balance p1 = new Balance("Surya",45000);
        Balance p2 = new Balance("Jassie",25000);
        
        p1.show();
        p2.show();
    }
}