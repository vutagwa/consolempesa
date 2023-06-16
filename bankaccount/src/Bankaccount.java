



public class Bankaccount {

    
    public static void main(String[] args) {
        bankDetails client1 = new bankDetails("marion");
        client1.deposit(30000);
        client1.withdraw(2000);
        bankDetails client2 = new bankDetails("faith");
        client2.deposit(50000);
        client2.transfer(800, client1);
        bankDetails client3 = new bankDetails("cyndi");
        client3.deposit(10000);
        client1.transfer(200, client3);
    }
    
}
