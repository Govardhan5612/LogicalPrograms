package com.bridgelabz;

import java.util.Scanner;

/**
 * @GovardhanReddy
 */
public class SimulateStopWatchProgram {
    /**
     * Find the time difference between start click and ens click
     */
    long startTime =0;
    long endTime = 0;

    long differenceTime =0;
    public  void start(){
        startTime = System.currentTimeMillis();
        System.out.println("Start time - "+startTime/1000+" Seconds");

    }
    public  void end(){
        endTime = System.currentTimeMillis();
        System.out.println("End time - "+endTime/1000+" Seconds");

    }
    public  long difference(){
        differenceTime = endTime-startTime;
        return differenceTime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimulateStopWatchProgram time = new SimulateStopWatchProgram();
        System.out.print("Enter any number time will be started : ");
        input.nextInt();
        time.start();
        System.out.print("Enter any number time will be ended : ");
        input.nextInt();
        time.end();
        System.out.println("Elapses time is "+time.difference()/1000+" Seconds");

    }
}
