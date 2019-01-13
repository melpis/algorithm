package com.algorithm.guide;

public class Stack {
    private int[] data;
    private int top;
    public Stack(int size){
        this.data = new int[size];
    }

    public void  push (int value){
        data[top++] = value;
    }
    public int pop(){
        return data[--top];
    }
}
