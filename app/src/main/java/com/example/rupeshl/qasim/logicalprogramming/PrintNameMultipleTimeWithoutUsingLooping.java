package com.example.rupeshl.qasim.logicalprogramming;

/**
 * Created by Mohd.Qasim on 19,February,2019
 * Dhanush InfoTech Pvt Ltd
 * Mohd.Qasim@dhanushinfotech.net
 */
public class PrintNameMultipleTimeWithoutUsingLooping {
    private static int count;
    public static void printNameMultiple(){
        System.out.println(PrintNameMultipleTimeWithoutUsingLooping.class.getClass().getSimpleName());
        printName();
    }

    private static void printName() {

        System.out.println("mohd qasim "+count);
        count++;
        if (count<5){
            printName();
        }
    }
}
