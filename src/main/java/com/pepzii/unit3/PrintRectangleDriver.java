// Write a class called PrintRectangleDriver whose main method instantiates a PrintRectangle object called rect.
// Then it asks rect to call its draw, which takes no arguments and returns void.
// In the same PrintRectangleDriver file, provide a stub for the PrintRectangle.

// This PrintRectangle class cannot be public, it should contain no instance variables, and it should contain a stub method for the draw method only.
// This stub method should contain nothing but a print statement that confirms that the draw method was called.

package com.pepzii.unit3;

import java.util.Scanner;

public class PrintRectangleDriver
{
    public static void main(String[] args) {
        final PrintRectangle rect = new PrintRectangle();
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height: ");
        rect.setHeight(scanner.nextInt());

        System.out.print("Enter width: ");
        rect.setWidth(scanner.nextInt());

        System.out.print("Enter character: ");
        char character = scanner.next().charAt(0);

        rect.draw(character);
        scanner.close();
    }
    
    /*
    static class PrintRectangle {
        
        public void draw() {
            System.out.println("Method was called");
        }
    }
    */
}