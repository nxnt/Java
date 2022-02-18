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

    public double getMonthlyInterestRate() {

        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {

        return getMonthlyInterestRate() * this.balance;
    }

    public void withdraw(double amount) {

        this.balance -= amount;
    }

    public void deposit(double amount) {

        this.balance += amount;
    }

    public void setID(int id) {

        this.id = id;
    }

    public int getID() {

		return this.id;
	}

    public void setBalance(double balance) {

		this.balance = balance;
	}

    public double getBalance() {

        return this.balance;
    }

    public Date getDatecreated() {

        return this.datecreated;
    }

    public double getAnnualInterestrate() {

       return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }
}
