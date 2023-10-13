import java.util.Scanner;

public class Account {
    private int balance;
    public Account(int balance) {
        this.balance = balance;
    }

    boolean isWthdrawLessThanBalance(int withdrawAmount) {

        if(withdrawAmount < balance) {
            return true;
        } else {
            return false;
        }
    }


    void getWithdrawAmount(int withdrawAmount, String name) {

        balance -= withdrawAmount;
        System.out.println(name + ", " + withdrawAmount + " RS has been withdrawn. Your remaining amount: "+ balance);

    }

}

class Customer extends Thread {

    String name;
    Account account;
    int withdrawAmount;
    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;  // set account of the person
    }

   @Override
    public void run() {

       Scanner sc = new Scanner(System.in);
       synchronized (account) {
       System.out.println(name + ", Enter amount to withdraw: ");
       withdrawAmount = sc.nextInt();

           if (account.isWthdrawLessThanBalance(withdrawAmount)) {

               account.getWithdrawAmount(withdrawAmount, name);
           } else {
               System.out.println("Insufficient balance.");
           }
       }
   }
}

class ThreadExample {

    public static void main(String[] args) {

        Account ac = new Account(1000);
        Customer c1 = new Customer(ac, "Sarah");
        Customer c2 = new Customer(ac, "Fahad");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}