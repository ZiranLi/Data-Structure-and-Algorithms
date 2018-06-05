package com.company.jdkLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee janeJohns = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Does", 6546);
        Employee dickJiba = new Employee("Dick", "Jiba", 78);
        Employee fnckUdemy = new Employee("Fnck", "Udemy", 111);
        Employee gfdgddfg = new Employee("gfdg", "ddfg", 77888);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJohns);
        list.addFirst(johnDoe);
        list.addFirst(dickJiba);
        list.addFirst(fnckUdemy);//add to the dront

        Iterator iter = list.iterator();
        System.out.println("head->");
        while(iter.hasNext()){
            System.out.println(iter.next()+"<=>");
        }
        //or use for loop to print all
//        for(Employee employee:list){
//            System.out.println(employee);
//        }


//        list.add(gfdgddfg);//add to the end
        list.addLast(gfdgddfg);
        iter = list.iterator();
        System.out.println("head->");
        while(iter.hasNext()){
            System.out.println(iter.next()+"<=>");
        }


        list.removeFirst();
        iter = list.iterator();
        System.out.println("head->");
        while(iter.hasNext()){
            System.out.println(iter.next()+"<=>");
        }


        list.removeLast();
        iter = list.iterator();
        System.out.println("head->");
        while(iter.hasNext()){
            System.out.println(iter.next()+"<=>");
        }
    }
}
