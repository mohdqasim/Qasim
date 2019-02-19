package com.example.rupeshl.qasim;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import java.util.Objects;

/**
 * Created by Mohd.Qasim on 14,January,2019
 * Dhanush InfoTech Pvt Ltd
 * Mohd.Qasim@dhanushinfotech.net
 */
public class TestJava {
    public static String TAG;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static void main(String args){
        String name=null;
        Log.w(TAG,Objects.requireNonNull(name).toString());
        System.out.print(Objects.requireNonNull(name).toString());

    }
}
