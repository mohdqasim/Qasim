package com.example.rupeshl.qasim.logicalprogramming;

import android.util.Log;

/**
 * Created by Mohd.Qasim on 19,February,2019
 * Dhanush InfoTech Pvt Ltd
 * Mohd.Qasim@dhanushinfotech.net
 */
public class HighestValue {
    static int highestValue;
    public static void highestValue(){
        System.out.println(HighestValue.class.getClass().getSimpleName());
        int[] ints=new int[]{1,2,3,14,16,17};
        for (int anInt : ints) {
            if (highestValue < anInt) {
                highestValue = anInt;
            }
        }
        System.out.print(highestValue);
    }
}
