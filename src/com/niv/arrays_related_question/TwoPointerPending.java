package com.niv.arrays_related_question;

public class TwoPointerPending {
    public static int[] printSquares(int[] arr){
        //create new array
        //by using this we can add the new changes in the
        int[] arr1=new int[arr.length];
        int j=0;
        for(int i=0; i<arr.length; i++){
            arr1[j++]=arr[i]*arr[i];

        }
        sortArr(arr1);
        return arr1;

    }
    public static int[] sortArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                //now swapping
                if(arr[i]>arr[j]){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5,6};
        int[] arr={-10,-3,-2,1,4,5};
        int[] arr1= printSquares( arr);
        printArr(arr1);


    }
}
