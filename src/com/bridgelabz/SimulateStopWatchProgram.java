package com.bridgelabz;

import java.util.Scanner;

public class SimulateStopWatchProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start time in minutes range (0-60) : ");
        int startMinute = input.nextInt();
        System.out.print("Enter the start time in seconds range (0-60) : ");
        int startSecond = input.nextInt();
        System.out.print("Enter the end time in minutes range (0-60) : ");
        int endMinute = input.nextInt();
        System.out.print("Enter the end time in seconds range (0-60) : ");
        int endSecond = input.nextInt();
        if (startMinute<=60 && startSecond<=60 && endMinute<=60 && endSecond<=60){
            int startTime = startMinute*60+startSecond;
            int endTime = endMinute*60+endSecond;
            double resultInSeconds = endTime-startTime;

            System.out.println("Elapses time is "+resultInSeconds+" seconds");


        }
        else {
            System.out.println("Enter the valid details");
        }


    }
}
