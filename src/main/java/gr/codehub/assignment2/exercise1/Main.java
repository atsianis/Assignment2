package gr.codehub.assignment2.exercise1;

import gr.codehub.assignment2.exercise1.model.Account;
import gr.codehub.assignment2.exercise1.model.Category;
import gr.codehub.assignment2.exercise1.model.StoreAccount;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        testAccount();
    }

    private static void testAccount() {

        Account a1 = new Account("Thanos");
        Account a2 = new Account("George",1000.0);
        a1.withdraw(234.5);
        a1.deposit(345.6);
        a2.deposit(2352.43);
        a1.withdraw(314.34);
        a2.withdraw(532.43);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

        Account a3 = new StoreAccount("Thanos","ThanosAthletics", Category.MID);
        Account a4 = new StoreAccount("George",12424,"GeorgeBarberShop",Category.PREMIUM);

        a3.deposit(134.4);
        a3.deposit(64.5);
        a3.withdraw(234.0);
        a3.deposit(425.54);
        a3.deposit(54.3);
        System.out.println(a4.getBalance());
        a4.withdraw(2343);
        a4.deposit(342.6);

        List<Account> accounts = new ArrayList<>();
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);
        accounts.add(a4);

        for (Account a : accounts){
            System.out.println( (a instanceof StoreAccount ? (((StoreAccount) a).getStoreName()) : a.getOwner())  +"'s account has $" + a.getBalance() +
                    " and " + a.getNumberOfTransactions() + " transactions have been completed in the past" );
            ;
        }


    }
}
