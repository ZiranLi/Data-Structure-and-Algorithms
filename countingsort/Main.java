package com.company.countingsort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {2,5,9,8,2,8,7,10,4,3};
        countingSort(intArray,1,intArray.length);
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max){

        int[] countArray = new int[(max-min)+1];
        for(int i =0;i<input.length;i++){
            countArray[input[i]- min]++;// e.g: 2-1 = 1 element
        }
        //write back to input array
        int j=0;
        for(int i =min;i<=max;i++){
            while(countArray[i-min]>0){//e.g i=2
                input[j++] = i;//e.g.: input[0] =2, then
                countArray[i-min]--;//countArray[1]=2-1=1, decrement the count to 1
            }
        }

    }

}
