package com.company.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee("Jane", "Jones", 123));
//        employeeList.add(new Employee("John", "Doe", 4567));
//        employeeList.add(new Employee("Mary", "Smith", 22));
//        employeeList.add(new Employee("Mike", "Wilson", 3245));

        Employee janeJohns = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Does", 6546);
        Employee dickJiba = new Employee("Dick", "Jiba", 78);
        Employee fnckUdemy = new Employee("Fnck", "Udemy", 111);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(janeJohns);
        list.addToFront(johnDoe);
        list.addToFront(dickJiba);
        list.addToFront(fnckUdemy);

        System.out.println(list.getSize());

        System.out.println(list.isEmpty());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }
}
