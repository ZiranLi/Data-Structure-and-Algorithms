package com.company.radixsort;

public class Main {

    public static void main(String[] args) {

        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        for(int i =0;i<radixArray.length;i++){
            System.out.println(radixArray[i]);
        }
    }


    public static void radixSort(int[] input, int radix, int width){
        for(int i=0;i<width;i++){
            radixSingleSort(input, i ,radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix){
        //will return countArray;

        int numOfItems = input.length;
        int[] countArray = new int[radix];
        //create countArray for every digit;
        for(int value: input){
            countArray[getDigit(position, value, radix)]++;
        }

        //sum all the counts up
        for(int j=1; j< radix;j++){
            countArray[j]+= countArray[j-1];
        }

        //create temp array
        //e.g: 10's for 5729:
        //                  temp[countArray[2]-1=1] = input[6]=5279;(tmp[1]=5279)
        int[] temp = new int[numOfItems];
        for(int k =numOfItems-1; k>=0; k--){
            temp[--countArray[getDigit(position,input[k],radix)]]=input[k];
        }

        //copy back to input
        for(int i =0;i<numOfItems;i++){
            input[i] = temp[i];
        }


    }

    public static int getDigit(int position, int value ,int radix){
        //4725/100 = 47%10 = 7;//4725/1= 4725%10=5
        return value/(int)Math.pow(radix, position)%radix;
    }
}
