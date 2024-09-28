package com.niv.arrays_related_question;

public class RotateArray {
    //kth rotations of the array
    public static int[] rotateArray(int[] arr, int k){
        int[] arr1=new int[arr.length];
        int j=0;
        int n=arr.length;
        //first we will pass the kth part of array
        for(int i=n-k; i<n ; i++){
            arr1[j++]=arr[i];

        }
        //then pass the remain part of array in the new array
        for(int i=0; i<n-k; i++){
            arr1[j++]=arr[i];

        }
        return arr1;


    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k =3;

        int[] result=rotateArray( arr, k);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] +" ");

        }
    }
}
