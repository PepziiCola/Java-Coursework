package com.pepzii.unit5;

public class VowelCounter {

    private int[][] vowelCounts = new int[5][2];
    private final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public void processLine(String line) {
        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (line.charAt(i) == vowels[j]) {
                    vowelCounts[j][0]++;
                } else if (line.charAt(i) == (vowels[j] - 32)) {
                    vowelCounts[j][1]++;
                }
            }
        }
    }

    public void printSummary() {
        System.out.println("Summary of vowel counts:");

        int totalLower = 0;
        int totalUpper = 0;

        for (int i = 0; i < vowels.length; i++) {
            int low = vowelCounts[i][0];
            int high = vowelCounts[i][1];

            totalLower += low;
            totalUpper += high;

            System.out.println("Vowel '" + vowels[i] +"' has a count of " + low + " lowercase and " + high + " uppercase, combined for " + (low + high) + ".");
        }

        System.out.println("There was a total count of " + totalLower + " lowercase and " + totalUpper + " uppercase, combined for " + (totalLower + totalUpper) + ".");
    }

}
