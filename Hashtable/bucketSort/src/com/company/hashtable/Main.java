package com.company.hashtable;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {54,46,83,66,95,92,43};

        bucketSort(intArray);

        for(int i =0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }


    public static void bucketSort(int[] input){//相当于list里套好多个list
        //use the parent interface of the bucket type rather than define a concrete type
        List<Integer>[] buckets = new List[10];
        //create bucket
        for(int i =0;i<buckets.length;i++){
            buckets[i] = new ArrayList<Integer>();//can change to LinkedList<Integer>();

            //or use linkedlist/ vector:
            // buckets[i] = new LinkedList<Integer>();
            //buckets[i] = new Vector<Integer>();
        }

        //scattering
        for(int i =0;i<input.length;i++){
            buckets[hash(input[i])].add(input[i]);
        }
        //sorting
        for(int i =0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        //gathering back
        int j =0;
        for(int i =0;i<buckets.length;i++){
            for(int value: buckets[i]){
                input[j++] = value;
            }
        }
    }

    private static int hash(int value){
        return value /(int)10%10;//59 /10 = 5; 5%10 = 5; like radix sort, get MSB
    }
}
