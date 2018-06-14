package com.company.hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        Map<String, Employee> hashmap = new HashMap<String, Employee>();

        hashmap.put("Jones",janeJones);
        hashmap.put("Doe",johnDoe);
        hashmap.put("Smith",marySmith);

        hashmap.putIfAbsent("Doe", mikeWilson);// use put will replace the existing with new one.


        System.out.println(hashmap.get("Smith"));
        System.out.println(hashmap.getOrDefault("someone", billEnd));

        System.out.println(hashmap.remove("Smith"));


//        System.out.println(hashmap.containsKey("Doe"));// faster than containsValue method.
//        System.out.println(hashmap.containsValue(marySmith));

        //the first print method
//        Iterator<Employee> iterator = hashmap.values().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //second way to print
        hashmap.forEach((k,v) -> System.out.println("key = "+k+", value="+v));

    }
}
