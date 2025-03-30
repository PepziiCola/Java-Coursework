package com.pepzii.unit7;

public final class Loan {
    private final double loanAmount;
    private final double rate;
    private final int numberOfPayments;
    private final double paymentAmount;

    public Loan(double loanAmount, double rate, int numberOfPayments) {
        this.loanAmount = loanAmount;
        this.rate = rate;
        this.numberOfPayments = numberOfPayments;
        this.paymentAmount = loanAmount / calculateBalance(numberOfPayments);
    }

    private double calculateBalance(int k) {
        if (k <= 0) return 0.0;

        return (calculateBalance(k - 1) + 1.0) / (1.0 + rate);
    }

    public void outputPayments() {
        System.out.printf("paymentAmount = %.2f\n", paymentAmount);

        double balance = loanAmount;

        for (int i = 0; i <= numberOfPayments; i++) {
            System.out.printf("payment# %2d, balance = %7.2f\n", i, balance);

            if (i < numberOfPayments) balance = balance * (1.0 + rate) - paymentAmount;
        }
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getRate() {
        return rate;
    }

    public int getNumberOfPayments() {
        return numberOfPayments;
    }
}