package com.niv._2d_arrays;

 public class Addition {
    public static void addTwoArr(int[][] arr, int a, int b, int[][] arr1, int a1, int b1){
        //same we can do multiplication
        int[][] sum=new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                sum[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        //so we call sum method here for the retrieve
        printArr(sum);

    }
    public static void printArr(int[][] matrix){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] arr={{1,2},{5,6}};
        int a=arr.length;
        int b= arr[0].length;

        int[][] arr1={{3,4}, {7,8} };
        int a1=arr1.length;
        int b1= arr1[0].length;

       addTwoArr(arr,a,b,arr1,a1,b1);



    }
}
