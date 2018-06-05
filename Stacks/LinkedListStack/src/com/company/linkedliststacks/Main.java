package com.company.linkedliststacks;

public class Main {

    public static void main(String[] args) {

        Employee janeJohns = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Does", 6546);
        Employee dickJiba = new Employee("Dick", "Jiba", 78);
        Employee fnckUdemy = new Employee("Fnck", "Udemy", 111);
        Employee gfdgddfg = new Employee("gfdg", "ddfg", 77888);

        LinkedStack stack  = new LinkedStack();

        stack.push(janeJohns);
        stack.push(johnDoe);
        stack.push(dickJiba);
        stack.push(fnckUdemy);
        stack.printStack();


        System.out.println(stack.peek());

        System.out.println("poped: "+ stack.pop());

        System.out.println(stack.peek());
        stack.printStack();

    }
}
