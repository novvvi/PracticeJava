package com.udemy;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myMinIntValue);
        System.out.println(myMaxIntValue);
        System.out.println(myMaxIntValue + 1);

        int myMaxIntTest = 214_748_36_47; // for easy to read

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);
        long bigLongLiteralValue = 214_748_36_47_234L;


        int myTotal = (myMinIntValue /2);
        byte myNewByteValue = (byte) (myMinByteValue /2);

        byte number = 12;
        short shortNumber = 3276;
        int intNumber = 123490;
        long total = 50000L+ 10L * ( number + shortNumber + intNumber);
        short shortTotal = (short) (50000+ 10 * ( number + shortNumber + intNumber));
        System.out.println(total);

    }
}
