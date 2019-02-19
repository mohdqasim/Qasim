package com.example.rupeshl.qasim.logicalprogramming;

/**
 * Created by Mohd.Qasim on 19,February,2019
 * Dhanush InfoTech Pvt Ltd
 * Mohd.Qasim@dhanushinfotech.net
 */
public class SortInAscendingAndDescendingOrder {
    public static void sortValues() {
        int temp;

        int a[] = new int[]{5, 8, 7, 15};
        for (int i = 0; i < a.length; i++) {
            System.out.println("i value  for loop "+i);
            for (int j = i; j < a.length; j++) {
                System.out.println(j+" , "+a[i]);
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ascending order");
        for (int k = 0; k < a.length - 1; k++) {
            System.out.print(a[k] + ",");
        }
        System.out.print(a[a.length - 1]);
    }
}
