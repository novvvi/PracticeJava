package com.dojo;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        print1to255();
        printOdd255();
        printSum();
        ArrayList<Object> list = new ArrayList<>();
        list.add(10);
        list.add("Hello");
        list.add(new ArrayList<Integer>());
        list.add(12.0);
        ileratingArray(list);
        findMax(new int[] {-3, -5, -7});
        getAverage(new int[] {3, 5, 7});
        System.out.println(Arrays.toString(arrWithOdd()));
        greaterThan(new int[] {1, 3, 5, 7}, 3);
        System.out.println(Arrays.toString(squareValues(new int[] {1, 3, 5, 7})));
        System.out.println(Arrays.toString(eliminate(new int[] {1, -3, 5, 7})));
        System.out.println(Arrays.toString(mma(new int[] {1, -3, 5, 7})));
        System.out.println(Arrays.toString(shift(new int[] {1, -3, 5, 7})));
    }

    public static void print1to255() {
        for(int x = 1; x < 256; x++) {
            System.out.println(x);
        }
    }

    public static void printOdd255() {
        for(int x= 1; x < 256; x++) {
            if( x % 2 == 1){
                System.out.println(x);
            }
        }
    }

    public static void printSum() {
        int total = 0;
        for(int x = 0; x < 256; x++){
            total += x;
            String msg = String.format("New number: %s, sum: %s", x, total);
            System.out.println(msg);
        }
    }

    public static void ileratingArray(ArrayList<Object> arr){
        for (int x = 0; x < arr.size(); x++) {
            System.out.println(arr.get(x));
        }
    }

    public static void findMax(int[] arr){
        int max = arr[0];
        for(int x = 1; x < arr.length; x++) {
            if(max < arr[x]) {
                max = arr[x];
            }
        }
        System.out.println(max);
    }

    public static void getAverage(int[] arr) {
        int aver = 0;
        for (int x = 0; x < arr.length; x++) {
            aver += arr[x];
        }
        System.out.println(aver / arr.length);
    }

    public static int[] arrWithOdd() {
        int[] arr = new int[256/2];
        int i = 0;
        for (int x = 1; x < 256; x++) {
            if (x % 2 == 1) {
                arr[i] = x;
                i++;
            }
        }
        return arr;
    }

    public static void greaterThan(int[] arr, int y) {
        for ( int i = 0; i < arr.length; i++){
            if(y <= arr[i]) {
                System.out.println(arr.length - i -1);
                i = arr.length;
            }
        }
    }

    public static int[] squareValues(int[] arr) {
        for( int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

    public static int[] eliminate(int[] arr) {
        for ( int i = 0; i < arr.length; i++){
            if(0 > arr[i]) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] mma(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int aver = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            aver += arr[i];
        }
        return new int[] {max, min, aver/arr.length};
    }

    public static int[] shift(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (i + 1 == arr.length) {
                arr[i] = 0;
                i = arr.length;
            }
            else {
                arr[i] = arr[i + 1];
            }

        }
        return arr;
    }
}
