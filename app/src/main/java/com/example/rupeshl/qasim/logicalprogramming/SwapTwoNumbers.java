package com.example.rupeshl.qasim.logicalprogramming;

import android.util.Log;

/**
 * Created by Mohd.Qasim on 19,February,2019
 * Dhanush InfoTech Pvt Ltd
 * Mohd.Qasim@dhanushinfotech.net
 */
public class SwapTwoNumbers {
    public static void swapTwoNumber(){
        System.out.println(SwapTwoNumbers.class.getClass().getSimpleName());
        int a=5;
        int b=6;
        //Log.w("a b values",a+","+b);
        System.out.println("original values "+a+","+b);
        a=a+b;
        b=a-b;
        a=a-b;
       // Log.w("a b values",a+","+b);
        System.out.println("modified values " +a+","+b);
    }

}
