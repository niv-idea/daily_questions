package com.niv.arrays_related_question;

public class SortArrayIfTwoOnly {
    //this is best way if the arr only have two number which repeats
    public static int[] sortArr(int[] arr){
        int count=0;
        int num=1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                count++;
            }
        }
        for(int i=0;i<arr.length; i++){
            if(i<count){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,2,2,1,1};
        int[] arr1= sortArr(arr);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");

        }



    }
}
