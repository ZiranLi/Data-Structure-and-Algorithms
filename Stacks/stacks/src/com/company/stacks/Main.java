package com.company.stacks;

public class Main {

    public static void main(String[] args) {



        ArrayStack stack = new ArrayStack(10);



        stack.push(new Employee("one","one",123));
        stack.push(new Employee("two","two",2433));
        stack.push(new Employee("three","three",333));
        stack.push(new Employee("four","four",45123));

        stack.printStack();
        System.out.println("peek is "+ stack.peek());

//        stack.pop();
        System.out.println("peek is p "+ stack.pop());
        stack.printStack();
        System.out.println("peek is "+ stack.peek());



    }
}
