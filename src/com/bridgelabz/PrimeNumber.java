package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */
public class PrimeNumber {
    /**
     *
     * @param number is prime number or not
     */
    public static void primeNumber(int number){
        int count=0;
        if (number==0 || number==1){
            System.out.println(number+" is not prime number");
            count++;
        }
        else {
            for (int i = 2;i<number;i++){
                if (number%i ==0){
                    System.out.println(number+" is not prime number");
                    count++;
                    break;
                }
            }
        }
        if (count==0){
            System.out.println(number+" is prime number");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        primeNumber(number);
    }
}
