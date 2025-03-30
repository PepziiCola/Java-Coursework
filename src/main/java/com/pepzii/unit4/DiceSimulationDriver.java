// Write a complete program that simulates the rolling of two dice.
// More specifically, it simulates a user-specified number of rolls and then prints a histogram of the number of rolls for each possible pair value.
// In other words, it prints a histogram for the number of times that two was thrown, the number of times that three was thrown, and so on, all the way up to the number of times that twelve was thrown.

// Use a frequency array to keep track of the number of times each pair value is thrown.
// For example, the frequency[2] element holds the number of times two is thrown.
// The frequency[3] element holds the number of times three is thrown.

package com.pepzii.unit4;

import java.util.Scanner;

public class DiceSimulationDriver
{
    public static void main(String[] args) {
        final Scanner stdIn = new Scanner(System.in);
        String choice;
        boolean done = false;

        DiceSimulation diceSimulation = new DiceSimulation();
        System.out.println("Welcome to the deice throwing simulator!\n");

        do {
            System.out.println("Options: (n)ew simulation, (a)dditional rolls, (p)rint, (q)uit");
            System.out.print("Enter n, a, p, or q ==> ");
            choice = stdIn.nextLine();

            switch (choice.charAt(0)) {
                case 'n':
                case 'N':
                    diceSimulation.newSimulation(stdIn);
                    break;
                case 'a':
                case 'A':
                    diceSimulation.additionalRolls(stdIn);
                    break;
                case 'p':
                case 'P':
                    diceSimulation.printReport();
                    break;
                case 'q':
                case 'Q':
                    done = true;
                    break;
                default:
                    System.out.println("Invalid selection.");
                    break;
            }

        } while(!done);
    }
}