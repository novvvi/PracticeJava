package com.dojo;

public class Main {

    public static void main(String[] args) {
        BankAccount kaki = new BankAccount();
        BankAccount novi = new BankAccount();
        kaki.setCheckingBalance(100000);
        kaki.setSavingBalance(5000);
        novi.setSavingBalance(10000);
        novi.setCheckingBalance(400);
        BankAccount.bankInfo();
        kaki.withDraw("saving", 3003);
        novi.withDraw("cheching", 7000);
        kaki.viewAllBalance();
        novi.viewAllBalance();
        BankAccount.bankInfo();
    }
}
