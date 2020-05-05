package com.dojo;

public class Calculator implements java.io.Serializable{
    private int OperandOne;
    private int OperandTwo;
    private String Operation;

    public Calculator() {

    }

    public int performOperation() {
        if(Operation.equals("+")) {
            return OperandOne + OperandTwo;
        }
        else if(Operation.equals("-")) {
            return OperandOne - OperandTwo;
        }
        else {
            return 0;
        }
    }

    public void getResults() {
        System.out.println(this.performOperation());
    }

    public void setOperandOne(int operandOne) {
        OperandOne = operandOne;
    }

    public void setOperandTwo(int operandTwo) {
        OperandTwo = operandTwo;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }



}
