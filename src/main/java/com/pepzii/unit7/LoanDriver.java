// Write a program that determines the level payment amount, paymentAmount, needed to pay off a loan of loanAmount in a number of installments equal to numberOfPayments.
// Assume that the interest rate is given by rate. Do not use any arrays. Use recursion.

package com.pepzii.unit7;

import java.util.Scanner;

public final class LoanDriver {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount, rate, and number of payments: ");

        final double loanAmount = scanner.nextDouble();
        final double rate = scanner.nextDouble();
        final int numberOfPayments = scanner.nextInt();

        final Loan loan = new Loan(loanAmount, rate, numberOfPayments);
        loan.outputPayments();
    }
}