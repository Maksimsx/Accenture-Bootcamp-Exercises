package Exercises18;

import java.util.Properties;


public class BankAccount {

    private int balance = 90909090;
    int totalBalance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amountDeposit){
        if(amountDeposit > 5000){
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amountDeposit);
        }else {
            System.out.println("Increase the balance: " + (totalBalance = amountDeposit + balance));
        }

    }
    public void withdraw(int amountWithdraw){
        if(amountWithdraw > balance){
            System.out.println("There is not enough funds");
        }else{
        System.out.println("Withdrawing money ");
        System.out.println(totalBalance = balance - amountWithdraw);
        }

    }

    public void printBalance(){
        System.out.println("Current balance: " + balance);
    }

    public void moneyTransfer(int amountToTransfer){
        if(amountToTransfer > balance){
            System.out.println("Transfer canceled. You are trying to transfer " + amountToTransfer + " units, but only "+ balance + " are available.");
        }else{
            System.out.println("Money transfered to different bank: " + amountToTransfer + ". Money is left in your bank: " + (totalBalance = balance - amountToTransfer));
        }
    }
}
