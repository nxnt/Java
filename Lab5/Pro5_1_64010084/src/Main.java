import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(0.045);
        int n,amount;
        System.out.println("Your Bank Account");
        System.out.println("Account no. : " + account.getId());
        System.out.println("Balance : " + account.getBalance());
        System.out.println("Account Create : " + account.getDatecreated());
        System.out.print("Withdraw <1> Deposit <2> : ");
        n = sn.nextInt();
        if(n == 1) {

            System.out.print("Enter amount : ");
            amount = sn.nextInt();
            if(account.getBalance() - amount < 0) {

                System.out.println("Can not withdraw");
            }
            else {

                account.withdraw(amount);
                System.out.println("Withdraw Successful");
                System.out.println("Balance : " + account.getBalance());
                System.out.println("MonthlyInterest : " + account.getMonthlyInterest());
            }
        }

        if(n == 2) {

            System.out.print("Enter amount : ");
            amount = sn.nextInt();
            if(amount < 0) {

                System.out.println("Can not deposit");
            }
            else {
                
                account.deposit(amount);
                System.out.println("Deposit Successful");
                System.out.println("Balance : " + account.getBalance());
                System.out.println("MonthlyInterest : " + account.getMonthlyInterest());
            }
        }
        sn.close();
    }
}
