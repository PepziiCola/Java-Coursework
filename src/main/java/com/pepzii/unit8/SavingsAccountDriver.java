// Write a program that establishes two savings accounts with saver1 having account number 10002 with an
// initial balance of $2,000, and saver2 having account 10003 with an initial balance of $3,000.

// Set a common rate of interest at 5% per year. At the end of each month, update the balance by adding one month’s interest to the balance, so that the balance compounds monthly.

// Print an output that displays the month number and the account number and the balance for each of the two accounts.
// Use month 0 to display the initial balances, month 1 to display the balances after the first month’s interest, and so on.

// At the end of the year, display the total balance for both accounts combined, like this:

package com.pepzii.unit8;

public class SavingsAccountDriver {

    public static void main(String[] args) {
        final double annualInterestRate = 0.05;
        final SavingsAccount accountOne = new SavingsAccount(10_002, 2_000).setAnnualInterestRate(annualInterestRate);
        final SavingsAccount accountTwo = new SavingsAccount(10_0003, 3_000).setAnnualInterestRate(annualInterestRate);

        displayBalances(accountOne, accountTwo);
    }

    public static void displayBalances(final SavingsAccount accountOne, final SavingsAccount accountTwo) {
        System.out.printf("%-12s %-12s %-12s %-12s %-12s\n", "Month", "Account #", "Balance", "Account #", "Balance");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i <= 12; i++) {
            System.out.printf("%-12s %-12d %-12.2f %-12d %-12.2f\n", i, accountOne.getAccountNumber(), accountOne.getBalance(), accountTwo.getAccountNumber(), accountTwo.getBalance());

            if (i == 12) {
                System.out.printf("\nFinal balance of both accounts combined: %.2f", accountOne.getBalance() + accountTwo.getBalance());
            }

            accountOne.addMonthlyInterest();
            accountTwo.addMonthlyInterest();
        }
    }
}
