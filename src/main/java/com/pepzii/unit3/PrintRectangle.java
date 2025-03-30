package com.pepzii.unit3;

public class PrintRectangle {

    private int height = 0;
    private int width = 0;

    public PrintRectangle() {
    }

    public void draw(char character) {
        for (int i = 0; i < this.height; i++) {
            drawLine(character);
        }
    }

    public void drawLine(char character) {
        for (int i = 0; i < this.width; i++) {
            System.out.print(character);
        }
        System.out.println();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}