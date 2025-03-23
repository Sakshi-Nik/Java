//Ass 3,Q.1

import java.io.*;

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    
    public double getBalance() {
        return balance;
    }
}


class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Balance cannot go below $100.");
        } else {
            super.withdraw(amount); 
    }
}
}


public class Bank {
    public static void main(String[] args) {
       
        SavingsAccount mySavings = new SavingsAccount(500);
        
        System.out.println("Initial balance: $" + mySavings.getBalance());

        
        mySavings.deposit(200);
        System.out.println("Current balance: $" + mySavings.getBalance());

        
        mySavings.withdraw(400);
        System.out.println("Current balance: $" + mySavings.getBalance());

      
        mySavings.withdraw(200);
        System.out.println("Current balance: $" + mySavings.getBalance());
    }
}
/*Output:
Initial balance: $500.0
Deposited: $200.0
Current balance: $700.0
Withdrew: $400.0
Current balance: $300.0
Withdrew: $200.0
Current balance: $100.0*/