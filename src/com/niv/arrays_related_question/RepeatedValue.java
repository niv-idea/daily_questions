package com.niv.arrays_related_question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RepeatedValue {

    //I want to find kth the lowest value in arr
    public static void findKthMin(int[] arr, int k){
        //first of all I have to sort the arr in ascending order by bubble sorting
        int n= arr.length;
        //1. approach by using api we can sort the array
        //Arrays.sort(arr);
        //for descending order
        Collections.reverse(Arrays.asList(arr));
        //2. approach using for loop and swapping
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n-i- 1; j++) {
                //this will give in ascending order
                if (arr[j] > arr[j + 1]) {
               //if (arr[j] < arr[j + 1]) { //it will give in descending order
                    //swapping
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //now iterate them
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        if(k<= arr.length){
            System.out.println(k+"rd lowest value in arr is : "+arr[k-1]);
        }

    }
    public static int[] SecondMinMAx(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        int secondMin=Integer.MAX_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            //for second lowest element in array
            if(min>arr[i]){
                secondMin=min;
                min=arr[i];

            }
            if(max<arr[i]){
                secondMax=max;
                max=arr[i];

            }

        }
        int[] arr1={secondMin, secondMax};
        return arr1;

    }

    public static int[] printArray(int[] arr){
        //we are return the array that have smallest and largest element of given arr
        // first we will sort
        Arrays.sort(arr);
        int[] number={arr[0],arr[arr.length-1]};

        return number;
    }
//    public static int smallestEle(int[] arr){
//        int smallest=Integer.MAX_VALUE;
//        for(int i=0; i< arr.length; i++){
//            if(arr[i]<smallest){
//                smallest=arr[i];
//            }
//
//        }
//        return smallest;
//
//    }
//    public static void printArray(int[] arr){
//        int n1=smallestEle( arr);
//        int n2=largestEle(arr);
//        //create new array
//        int[] number=new int[2];
//        number[0]=n1;
//        number[1]=n2;
//        for(int i=0; i<number.length; i++){
//            System.out.print(number[i]+" ");
//
//        }
//
//    }
//    public static int largestEle(int[] arr){
//        int largest=Integer.MIN_VALUE;
//        for(int i=0; i< arr.length; i++){
//            if(arr[i]>largest){
//                largest=arr[i];
//            }
//
//        }
//        return largest;
//
//    }

    public static boolean checkArraySortedOrNot(int[] num1){
//because we are checking for the ascending order
//we are taking here the true because if our array are already in sorting order then return true
        boolean result=true;
        for(int i=1; i<num1.length; i++){
            if(num1[i]<num1[i-1]){
                result =false;
                break;
            }

        }
        return result;
    }
    //it will return greater numbers count than given value
    public static int greaterNumCount(int[] num1, int value){
        int count=0;
        for(int i=0; i<num1.length; i++){
            //if(num1[i]<value)
            if(num1[i]>value){
                count++;
                //you can also print index and stored value
            }
        }
        return count;

    }
    public static void countOfValueOccurance(int[] num, int value){
        int count=0;
        for(int i=0; i<num.length; i++){
            if(num[i]==value){
                count++;
            }
        }
        //it will give  that given number, how much time the number are occurred.
        System.out.println(count);

    }
    //it will print last index of given number
    public static void lastOccurance(int[] num, int value){
        int n=0;
        for(int i=0; i<num.length; i++){
            if(num[i]==value){
                n=i;  //it will update the index one by one
            }

        }
        System.out.println(n);

    }
// it will check only starting one occurance
    public static int firstOccurance(int[] num, int value){
        int lastIndex=-1;
        for(int i=0; i<num.length; i++){
            if(num[i]==value){
                lastIndex=i;  //it will update the index one by one
                break;
            }

        }
        return lastIndex;

    }

    public static void main(String[] args) {
        int[] num={1,2,3,2,4,2};
        //countOfValueOccurance(num, 2);
       // lastOccurance(num, 2);
       // System.out.println(firstOccurance(num, 2));
        int[] num1={1,3,5,4,2};
        //System.out.println(greaterNumCount(num1, 2));
        //System.out.println(checkArraySortedOrNot( num1));
        //int[] arr={1,2,3,4,5};
        //printArray(arr);
        int[] arr = { 10, 5, 8, 3, 12, 7 };
       //int[] arr1= findKthMin( arr);
       findKthMin(arr,3);

       }
    }

