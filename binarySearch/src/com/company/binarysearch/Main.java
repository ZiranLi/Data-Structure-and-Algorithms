package com.company.binarysearch;

public class Main {

    public static void main(String[] args) {

        int[ ] intArray = {-22, -15, 1, 7, 20, 35, 55};




        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 7));
        System.out.println(iterativeBinarySearch(intArray, 55));
        System.out.println(iterativeBinarySearch(intArray, 8888));


        System.out.println(recursiveBinarySearch(intArray,0,intArray.length,-15));
        System.out.println(recursiveBinarySearch(intArray,0,intArray.length,7));
        System.out.println(recursiveBinarySearch(intArray,0,intArray.length,55));
        System.out.println(recursiveBinarySearch(intArray,0,intArray.length,8888));

    }


    public static int iterativeBinarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while(start<end){
            int midpoint = start+(end - start)/2;

            if(input[midpoint] == value){
                return midpoint;
            }
            else if(input[midpoint]> value){
                end = midpoint;
            }
            else if(input[midpoint]< value){
                start = midpoint+1;
            }
        }
        return -1;

    }


    public static int recursiveBinarySearch(int[] input, int start, int end, int value){

        if(start>=end){
            return -1;
        }

        int midpoint = start+(end-start)/2;

        if(input[midpoint]==value){
            return midpoint;
        }
        else if(input[midpoint]> value){
            return recursiveBinarySearch(input, start, midpoint, value);
        }
        else {
            return recursiveBinarySearch(input, midpoint+1, end, value);
        }

    }
}
