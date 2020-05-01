package com.udemy;

public class Main {

    public static void main(String[] args) {
	    double myDouble = 20.00;
	    double mySecondDouble = 80.00;
	    double addNMultiple = (myDouble + mySecondDouble) * 100.00;
	    int remainder = (int)addNMultiple % 40;
        boolean mybool = remainder == 0 ? true : false;
        System.out.println(mybool);
        if(!mybool) {
            System.out.println("got some remainder");
        } else {
            System.out.println("nothing left ");
        }
    }
}
