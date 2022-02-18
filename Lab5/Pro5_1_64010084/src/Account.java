import java.util.*;
public class Account {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date datecreated;

    Account() {

        this.id = 0;
        this.balance = 0;
    }
    Account(int id, double balance) {

        this.id = id;
        this.balance = balance;
        this.datecreated = new Date();
    }

    double getMonthlyInterestRate() {

        return this.annualInterestRate / 12;
    }

    double getMonthlyInterest() {

        return getMonthlyInterestRate() * this.balance;
    }

    void withdraw(double amount) {

        this.balance -= amount;
    }

    void deposit(double amount) {

        this.balance += amount;
    }

    double getBalance() {

        return this.balance;
    }

    Date getDatecreated() {

        return this.datecreated;
    }

    double getAnnualInterestrate() {

       return this.annualInterestRate;
    }

    void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }
}
