package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.*;

public class Main {
    public static void main(String[] args) {
        Figures[] arr = new Figures[10];
        arr[0] = new Circle(2);
        arr[1] = new Circle(3);
        arr[2] = new Circle(4);
        arr[3] = new Circle(5);
        arr[4] = new Circle(6);
        arr[5] = new Rectangle(2, 7);
        arr[6] = new Rectangle(3, 4);
        arr[7] = new Rectangle(2, 6);
        arr[8] = new Rectangle(4, 6);
        arr[9] = new Rectangle(1, 5);
        System.out.println(Calculator.calculateSumOfAreas(arr));
    }
}