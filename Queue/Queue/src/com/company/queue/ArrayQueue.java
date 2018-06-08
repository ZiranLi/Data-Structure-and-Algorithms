package com.company.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        if(size()==queue.length){
            int numItems = size();
            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue, front , newArray, 0, queue.length-front);
            System.arraycopy(queue,front, newArray,queue.length-front, back);
            queue = newArray;
        }

        queue[back] = employee;
        //0-jane -front
        //1-john
        //2-fdsdfs
        //3-fddsf
        //4     -back
        if(back<queue.length-1){
            back++;
        }
        else{
            back = 0;
        }
    }

    public Employee remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if(size()==0){
            front=0;
            back=0;
        }

        return employee;
    }

    public Employee peek(){
        if(size()==0){
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size(){
        return back-front;
    }

    public void printQueue(){

        for(int i =front;i<back;i++){
            System.out.println(queue[i]);
        }
    }


}
