package com.niv._2d_arrays;
//means rows values on column and column values on rows .
public class Transpose {

    public static void rotateMatrix(int[][] arr){
        for(int i=0; i< arr.length; i++){
            //this loop starts from ith position. for expected value
            for(int j=i; j< arr[0].length; j++){
                //now we are using swapping
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }

        }
        //just use transpose concept and reverse it
        //now just print in reverse form we will get answer
        printArr(arr);

    }

    public static void transArray(int[][] arr){
        for(int i=0; i< arr.length; i++){
            //this loop starts from ith position. for expected value
            for(int j=i; j< arr[0].length; j++){
                //now we are using swapping
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }

        }
        printArr(arr);

    }
    public static void printArr(int[][] matrix){
        for(int i=0;  i<matrix.length ; i++){
            for(int j= matrix[0].length-1; j>=0; j--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transArr(int[][] arr){
        int[][] ans=new int[arr.length][arr[0].length];

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[0].length; j++){
                ans[i][j]=arr[j][i];
                //just take index reverse and pass in new arr
                //we can also do like this
            }
        }
        printArr(ans);


    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
       // transArr(arr);
      // transArray(arr);
        rotateMatrix(arr);

    }
}
