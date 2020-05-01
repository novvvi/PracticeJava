package com.udemy;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMaxFloatValue);
        System.out.println(myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMaxDoubleValue);
        System.out.println(myMinDoubleValue);

        int myIntValue = 5 /3 ;
        float myFloatValue =  5f /3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);


        int pounds = 200;
        double toKg = pounds * 0.45359237;
        System.out.println(toKg);
    }
}
