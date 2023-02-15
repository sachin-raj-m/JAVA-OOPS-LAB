package Bank;

public class Balance{
    
    String name;
    double balance;
    
    public Balance(String n, double b)
    {
        name = n;
        balance = b;
    }
    
    public void show(){
        if(balance<0)
        System.out.println("Insufficient Balance to Display");
        
        System.out.println("Name: "+name+"\nBalance : "+balance);
    }
}