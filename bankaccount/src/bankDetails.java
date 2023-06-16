public class bankDetails {
    String LName;
    double balance;
    public bankDetails(String Name){
        this.LName = Name;
        balance = 0.0;
    }
    public double Balance(){
        return balance;
    }
    public String Name(){
        return LName;
    }
    public void deposit(double amount){
        balance +=amount;
        System.out.println(LName +", your new balnce is KSH."+balance);   
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println(LName +", amount KSH." + amount+"has been deducted. new balance is KSH."+balance);
        }
        else{
            System.out.println("insufficient balance to withdraw KSH." +amount);
        }
    }
    public void transfer(double amount, bankDetails acc){
        if(balance<amount){
            System.out.println("Insufficient balance to do a transfer");
        }
        else {
            this.balance -= amount;
            acc.balance += amount;
            System.out.println(this.LName+" amount KSH."+amount+" has been deducted from your account. new balance is KSH." +this.balance );
            System.out.println(acc.LName+" amount KSH."+amount+" has been credited to your account. new balance is KSH." +acc.balance );
        }
    }
}
