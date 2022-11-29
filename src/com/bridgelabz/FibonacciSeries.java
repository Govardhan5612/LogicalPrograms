package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */

public class FibonacciSeries {
    /**
     *compute N terms of the fibonacci series
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int firstValue = 0;
        int secondValue = 1;
        int sumOfBeforeTwoValues;
        System.out.print(firstValue+" "+secondValue+" ");
        for (int i = 1;i<=number;i++){
            sumOfBeforeTwoValues=firstValue+secondValue;
            firstValue=secondValue;
            secondValue=sumOfBeforeTwoValues;
            System.out.print(sumOfBeforeTwoValues+" ");
        }
    }
}
