package com.company.sortingArrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {-8,32,53,65,-56,7};
        Arrays.parallelSort(intArray);//faster for larger data set
        Arrays.sort(intArray);

        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}
