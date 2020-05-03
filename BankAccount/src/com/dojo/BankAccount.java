package com.dojo;
import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    private static int createdAccount = 0;
    private static double bankCashFlow = 0;

    public static void bankInfo() {
        String info = String.format("account Created: %s, Bank Cash Flow: %s", createdAccount, bankCashFlow);
        System.out.println(info);
    }


    public BankAccount() {
        accountNumber = accountNumberGen();
        createdAccount ++;
    }

    private String accountNumberGen() {
        String accountNumber = "";
        for (int x = 0; x < 10; x ++) {
            int n = (int)(Math.random() * 10);
            accountNumber += String.valueOf(n);
        }
        return accountNumber;
    }

    public void withDraw(String type, double amount) {
        if (type == "checking") {
            if (this.checkingBalance > amount ) {
                this.checkingBalance -= amount;
                this.bankCashFlow -= amount;
                String receipt = String.format("%s  your checking balance: $%s, you have withdraw: $%s ", this.accountNumber, this.getCheckingBalance(), amount);
                System.out.println(receipt);
            } else {
                System.out.println("checking account insufficient funds");
            }

        } else {
            if (this.savingBalance > amount) {
                this.savingBalance -= amount;
                this.bankCashFlow -= amount;
                String receipt = String.format("%s your saving balance: $%s, you have withdraw: $%s ", this.accountNumber, this.getSavingBalance(), amount);
                System.out.println(receipt);
            } else {
                System.out.println("saving account insufficient funds");
            }
        }
    }

    public void viewAllBalance(){
        System.out.println(this.checkingBalance + this.savingBalance);
    }


    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance += checkingBalance;
        this.bankCashFlow += checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance += savingBalance;
        this.bankCashFlow += savingBalance;
    }
}
