package com.niv.arrays_related_question;

//return is the best option if you want to direct come outside of loop with answer
//after get answer then it will not going to next st

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArraysRelated {

    //by using swapp concept
    //this is usefull when the array in unsorted format
    public static int[] reverseArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                //swapping
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        //we are return the reverse array , we can also iterate direct here
        return arr;

    }
    //by using reverse loop
    public static void reverseArray1(int[] arr){
        int n=arr.length;
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");

        }
    }
    //by using set interface or collection framework concept
    public static void sortArr(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        //now iterate by using iterator
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext()){
            int n=itr.next();
            System.out.print(n);
        }
    }
    public static void lastRepeat(int[] arr){
        int lastRepeated =-1;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    lastRepeated= arr[i]; //it will take updated last value

                }
            }
        }
        System.out.println(lastRepeated);

    }
//return the repeating value in this array but only first not second
    public static int repeatRetu(int[] arr){
        for(int i=0; i<arr.length; i++){
           for (int j=i+1; j<arr.length; j++){
               if(arr[i]==arr[j]){
                   return arr[i];

               }
           }
        }
        return -1;
    }
    //find the total no of pairs whose sum is equal to given value
    public static void totalPair(int[] arr,int value){
        int count=0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                 if(arr[i]+arr[j]==value){
                 count++;
                }
            }
        }
        System.out.println("total pair is :"+count);
    }
    public static void totalTriplates(int[] arr,int value){
        int count=0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==value){
                        count++;
                    }
                }
            }
        }
        System.out.println("total pair is :"+count);
    }
    public static void printPair(int[] arr,int value){
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==value){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }

    }
    public static void printUnique(int[] num){
        for(int i=0; i< num.length; i++){
            for(int j=i+1; j<num.length; j++){
              if(num[i]==num[j]){
                  //stop them or put any simillar value
                  num[i]=-1;
                  num[j]=-1;

              }
            }
        }
        //it will like arr={-1,-1,-1,4,-1,-1,-1};
        //then just iterate the arr and apply condition on them
        for(int i=0; i< num.length; i++){
            if(num[i]>1){
                System.out.println(num[i]);
            }

        }
    }
//print 2nd largest element from the given arr
    public static int largest(int[] arr){
        int largest=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
               largest=arr[i];
            }
        }
        return largest;
    }
    public static int secLarge(int[] arr){
        int max=largest(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        //finally I can convert the largest into -infinity
        int seclargest=largest(arr);
        return seclargest;

    }
    public static void main(String[] args) {
        //int[] arr={1,2,3,4,5};
        //int value=6;
//        totalPair(arr, value);
//        printPair(arr,value);
//        int[] arr={1,4,5,6,3};
//        int value=12;
//        totalTriplates(arr,value);
//        int[] num={1,2,3,4,2,1,3};
//        printUnique(num);
       // int[] arr={9,8,9,6,9,5,8};

        //System.out.println(secLarge(arr));
        int[] arr={1,5,3,4,6,3,4};
        System.out.println(repeatRetu(arr));
    }


}
