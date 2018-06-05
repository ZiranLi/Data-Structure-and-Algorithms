package com.company.stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack ;
    private int top;
    //top contains the next available index of position in the array
    public ArrayStack (int capacity){

        stack = new Employee[capacity];

    }

    public void push(Employee employee){

        if(top == stack.length){
            //need to resize the backing array
            //normaly double the capacity
            Employee[] newArray = new Employee[2*stack.length];
            System.arraycopy(stack, 0 , newArray, 0 , stack.length);
            stack = newArray;
        }//O(n)
        stack[top++] = employee;
    }

    public Employee pop(){//O(1)
        if(isEmpty()){
            throw new EmptyStackException();
        }


        //top contains the next available index of position in the array
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;

    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return stack[top-1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        if(top==0){
            return true;
        }
        return false;

        //or return top==0;
    }

    public void printStack(){
        for(int i =top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
