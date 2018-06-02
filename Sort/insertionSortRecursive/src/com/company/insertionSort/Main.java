package com.company.insertionSort;

public class Main {

    public static void main(String[] args) {
        /**
         this is the recursive method for insertion sort
         https://www.geeksforgeeks.org/recursive-insertion-sort/
         */
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        recursiveInsertion(intArray, intArray.length);

        for(int i =0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

    public static void recursiveInsertion(int[] input, int n){
        if(n==1){
            return;
        }


        //first sort the n-1 items, then sort the last item
        recursiveInsertion(input, n-1);

        int lastElement =input[n-1];
        int j = n-2;

        while(j>=0 && input[j]>lastElement){
            input[j+1] = input[j];
            j--;
        }
        input[j+1] = lastElement;


        System.out.println("the result of call when n="+n);
        for(int i =0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------");

    }
}
