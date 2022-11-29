package com.bridgelabz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @GovardhanReddy
 */
public class RandomCoupon {
    /**
     *use random method find N values
     *take N from console
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many random numbers : ");
        int number = input.nextInt();
        /**
         * In set not store duplicate values
         * In list,array are stored duplicate values
         * Map store key value pair
         */
        Set<Integer> uniqueCoupon = new HashSet<>();
        while (number!=0){
            int random = (int) (Math.random()*1000000);
            if (random >=100000) {
                uniqueCoupon.add(random);
            }
            if (uniqueCoupon.size()==number) {
                break;
            }
        }
        System.out.println(uniqueCoupon);
    }
}
