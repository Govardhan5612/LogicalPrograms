package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */
public class PerfectNumber {
    /**
     * find the number is perfect number or not
     * @param number
     */
    public static int perfectNumber(int number){
        int sumOfFactorNumbers = 0;
        for (int i = 1; i<number;i++){
            if (number%i==0){
            sumOfFactorNumbers+=i;
            }
        }
        System.out.println("sum of factors - "+sumOfFactorNumbers);
        return sumOfFactorNumbers;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        int sumOfFactors =perfectNumber(number);
        if (number==sumOfFactors){
            System.out.println(number+" is perfect number");
        }
        else {
            System.out.println(number+" is not perfect number");
        }
    }
}
