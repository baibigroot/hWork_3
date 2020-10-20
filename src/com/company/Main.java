package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {0.1, 0.2, 0.4, 0.6, 0.7, 0.9,  1.6, 1.7, 1.9 };
        double [] unnumbers = {-0.3,  -0.5, -0.8, -1.1, -1.5, -1.8 };
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(unnumbers));
        for (double values: numbers )
        {
            System.out.println("number is " + values);
            for (double results: unnumbers ) {
                System.out.println("result is" + results );
            }


            }
        if ( numbers <= -0.3){
            System.out.println(double numbers <= -0.3);
        }
    }
}
