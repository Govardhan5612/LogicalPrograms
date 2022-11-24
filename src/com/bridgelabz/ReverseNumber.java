package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */
public class ReverseNumber {
    /**
     *
     * @param number is palindrome number or not
     */
    public static int palindromeNumber(int number){
        int remainder =0;
        int reverse = 0;
        while (number!=0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int reverseNumber = palindromeNumber(number);
        if (number==reverseNumber){
            System.out.println(number+" is palindrome number");
        }else {
            System.out.println(number+" is not palindrome number");
        }
    }
}
