package com.example.rupeshl.qasim.staticvairables;
public class StaticVairable{
	public static String URL = "esub-ap-gov";
    public static String HOST ="8003";
    public static String URl_HOST = URL+HOST;
    StaticVairable(){
        System.out.println("StaticVairable constructor");
    }
    static {
        System.out.println("StaticVairable static block");
    }

}