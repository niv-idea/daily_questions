package com.niv.arrays_related_question;
//by two ways we can perform this task
//1. use reverse loop
//2. use swap
public class ReverseArray {
    //also by using the bubble sort or swap we can do sorting
    //by using reverse for loop
    public static void reverseArray(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);

        }

    }
    //by using swapping
    public static void reverseArray1(int[] arr){
        int n=arr.length;


        for(int i=0; i<n/2; i++){
            int temp;
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;

        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        reverseArray(arr);
        reverseArray1(arr);
    }
}
