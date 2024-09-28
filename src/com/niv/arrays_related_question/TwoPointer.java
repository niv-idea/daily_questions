package com.niv.arrays_related_question;
//in this approach we are taking two pointers
public class TwoPointer {

    public static int[] printSquares(int[] arr){
        //create new array
        //by using this we can add the new changes in the
        //then just retrieve and print
        int[] arr1=new int[arr.length];
        int j=0;
        for(int i=0; i<arr.length; i++){
            arr1[j++]=arr[i]*arr[i];

        }
        return arr1;

    }
    //at start all even have to come and then odd
    //like answer will be 2,4,6,1,3,5
    //order does not matter
    //this is two pointer approach
    public static void swapping(int[] arr, int i, int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static int[] twoPointerApproach(int[] arr){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(arr[right]%2==0 && arr[left]%2!=0 ){
                swapping(arr,left, right);
                left++;
                right --;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
        return arr;
    }

    //normal approach by using new array
    public static int[] evenOddSort(int[] arr){
        int[] arr1=new int[arr.length];
        int j=0;
        //this for even
//         The line of code takes the value of the i-th element from the arr array and assigns it to the j-th position in the arr1 array.

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                arr1[j++]=arr[i];//After this assignment, the value of j (index) is  incremented by 1.
            }
        }
        //this is for odd
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                arr1[j++]=arr[i];
            }
        }
        return arr1;


    }


    public static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sortBySwap(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
               swap(arr, left,right);
                left++;
                right--;

            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }
    public static void printArr(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] arr={0,0,0,1,0,1,1,1};
//          sortBySwap( arr);
//       printArr(arr);
        int[] arr={1,2,3,4,5,6};
        int[] arr1=evenOddSort( arr);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");

        }

    }
}
