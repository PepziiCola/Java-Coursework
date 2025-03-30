package com.pepzii.unit4;

import java.util.Random;
import java.util.Scanner;

public final class DiceSimulation {

    private final int frequency[] = new int[13];
    private int total = 0;
    final Random random = new Random();

    public void newSimulation(final Scanner stdIn) {
        clear();
        total = 0;

        System.out.println("How many dice rolls would you like to simulate?");
        int amount = stdIn.nextInt();
        stdIn.nextLine();
        roll(amount);
    }

    public void additionalRolls(final Scanner stdIn) {
        System.out.println("How many additional rolls? ");
        int amount = stdIn.nextInt();
        stdIn.nextLine();
        roll(amount);
    }

    public void printReport() {
        System.out.println("\nDICE ROLLING SIMULATION RESULTS");
        System.out.println("Each \"*\" represents 1% of the total number of rolls.");
        System.out.println("Total number of rolls = " + total + ".\n");

        for (int i = 2; i < 13; i++) {
            final int percentage = (int) Math.round(((double) frequency[i] / total) * 100);
            System.out.print(i + ": ");
            for (int j = 0; j < percentage; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private void clear() {
        for (int i = 0; i < 13; i++) {
            frequency[i] = 0;
        }
    }

    private void roll(int amount) {
        total += amount;

        for (int i = 0; i < amount; i++) {
            frequency[rollDice()]++;
        }
    }

    private int rollDice() {
        return random.nextInt(6) + random.nextInt(6) + 2;
    }
}
