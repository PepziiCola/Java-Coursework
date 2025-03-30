// Write a program that counts the number of occurrences of lowercase and uppercase vowels in entered lines of text.
// Use a two-dimensional array to store the vowel counts.
// The array’s first column holds the counts for the lowercase vowels, and the second column holds the counts for the uppercase vowels.
//
//
//The user indicates the end of the input by pressing enter by itself.
// At that point, your program should print, for each vowel, the total number of lowercase occurrences, the total number of uppercase occurrences, and the total number of combined occurrences.

package com.pepzii.unit5;

import java.util.Scanner;

public class VowelCounterDriver {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final VowelCounter vowelCounter = new VowelCounter();

        System.out.println("Enter text (Enter on an empty line to quit):");

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            vowelCounter.processLine(input);
        }

        vowelCounter.printSummary();

        scanner.close();
    }

}