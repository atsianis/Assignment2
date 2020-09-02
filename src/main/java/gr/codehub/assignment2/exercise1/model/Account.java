package gr.codehub.assignment2.exercise1.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Account {

    private String owner;
    private double balance;
    private int numberOfTransactions;

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public Account(String owner) {
        this.owner = owner;
        this.balance = 0.0;
        this.numberOfTransactions = 0;
    }

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = 1;
    }

    public BigDecimal getBalance(){
        return new BigDecimal(this.balance).setScale(2, RoundingMode.HALF_UP);
    }

    public String getOwner() {
        return owner;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void deposit(double amount){
        if(amount > 0 ){
            this.balance+=amount;
            System.out.println("Deposit Successful");
            numberOfTransactions++;
        }else{
            System.out.println("Deposit must be positive");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount<=this.balance){
            balance-=amount;
            System.out.println("Withdraw Successful");
            numberOfTransactions++;
        }else{
            System.out.println("Cannot withdraw. " +
                    "Please check if your input was a positive number up to your current balance");
        }
    }

}
