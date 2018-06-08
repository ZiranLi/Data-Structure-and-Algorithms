package com.company.queue;

public class Main {

    public static void main(String[] args) {

        Employee janeJohns = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Does", 6546);
        Employee dickJiba = new Employee("Dick", "Jiba", 78);
        Employee fnckUdemy = new Employee("Fnck", "Udemy", 111);
        Employee gfdgddfg = new Employee("gfdg", "ddfg", 77888);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJohns);
        queue.add(johnDoe);
        queue.add(dickJiba);
        queue.add(fnckUdemy);
//        queue.printQueue();
        queue.remove();
        queue.printQueue();


        System.out.println(queue.peek());

    }
}
