package src;

public class BankSystem {

    int balance = 10000;
    public void withdraw(int amount){
        try{
            if(amount > balance){
                    throw new insufficientbalanceException ("insufficient balance");
            }
            balance = balance - amount;
            System.out.println("Amount withdraw sucessfully;" + balance);
        }
        catch(insufficientbalanceException e){
            System.out.println("Exception handle inside the method:"+ balance);
        }
    }
    public static void main(String args[]){
        BankSystem bs = new BankSystem();
        bs.withdraw("amount:20000");
    }

}
