package com.company.mergesort;


public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            if(input[i]<=input[j]){
                temp[tempIndex] = input[i];
                i++;
            }
            else{
                temp[tempIndex] = input[j];
                j++;
            }
            tempIndex++;
        }
//        while(i<=mid){
//            temp[tempIndex] = input[i];
//            tempIndex++;
//            i++;
//        }
        if(i<mid){
            temp[tempIndex++] = input[i++];
        }
        else if(j<end){
            temp[tempIndex++] = input[j++];
        }
//        input = temp;
//        while(tempIndex<=end){
//            input[tempIndex] = temp[tempIndex];
//
//        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }
//        int[] a = {1, 5, 4, 8, 23, 44, -1,43, 546, 32, -4, 34, 56, 6};
//        mergeSort(a,0,a.length);
////        int[] b = {};
//
//    }
//    public static void mergeSort(int[] a, int left, int right){
//        if(right - left<2){return;}
//        int mid = left + (right-left)/2;
//        mergeSort(a,left,mid);
//        mergeSort(a,mid+1,right);
//        merge(a, left, right,mid);
//    }
//    public static void merge(int[] a, int left, int right, int mid){
//        if(a[mid-1]<=a[mid]){return;}
//        int i=left;
//        int j =mid;
//        int tempIndex = left;
//        int[] temp = new int[right-left];
//        while(i<=mid&&j<=right){
//            if(a[i]<=a[j]){
//                temp[tempIndex++]=a[i++];
//
//            }
//            else{
//                temp[tempIndex++]=a[j++];
//            }
//        }
//        while(i<mid){
//            temp[tempIndex++] = a[i++];
//        }
//        while(j<right){
//            temp[tempIndex++] = a[j++];
//        }
//        System.arraycopy(temp,0,a,left,tempIndex);
//    }
}

