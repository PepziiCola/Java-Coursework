package com.pepzii.unit8;

public class SavingsAccount {

    private final int ACCOUNT_NUMBER;
    private double balance;
    private double annualInterestRate = 0.05;

    public SavingsAccount(final int accountNumber, final double initialBalance) {
        this.ACCOUNT_NUMBER = accountNumber;
        this.balance = initialBalance;
    }

    public void addMonthlyInterest() {
        this.balance *= 1.0 + (this.annualInterestRate / 12);
    }

    public int getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public SavingsAccount setAnnualInterestRate(final double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        return this;
    }
}
