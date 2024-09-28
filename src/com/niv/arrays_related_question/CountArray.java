package com.niv.arrays_related_question;

public class CountArray {
    public static void frequency(int[] arr){
        int[] fre=new int[7];
        for(int i=0; i<arr.length; i++){
            int index=arr[i];
            fre[index]++;
        }
        for(int i=0 ; i<fre.length; i++){
            if(fre[i]!=0){
                int num=i;
                int freq=fre[i];
                System.out.print("number :"+ num + " "+" frequency : "+freq);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[] arr={1,2,4,3,2,1,3,};
        frequency(arr);


    }
}
