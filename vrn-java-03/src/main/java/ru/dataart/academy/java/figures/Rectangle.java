package ru.dataart.academy.java.figures;

public class Rectangle extends Figures {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
