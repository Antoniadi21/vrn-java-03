package ru.dataart.academy.java.figures;

public class Calculator {
    public static double calculateSumOfAreas(Figures[] arr)
    {
        double result = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++)
        {
            result += arr[i].calculateArea();
        }
        return result;
    }
}
