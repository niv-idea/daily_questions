package com.niv._2d_arrays;
//the length of 2 d arrays is n*m

import java.util.Scanner;


public class Initialization {
    //diagonal sum by omptimize code
    public static int diagonalSum1(int[][] arr){
        int sum=0;
        for(int i=0; i< arr.length; i++){
            //first diagonal sum
            sum+=arr[i][i];

            //second diagonal sum
            sum+=arr[i][arr.length-1-i];

        }
        return  sum;
    }
    public static int diagonalSum(int[][] arr){
        int sum=0;
        for(int i=0; i< arr.length ;i++){
            for (int j=0; j<arr[0].length; j++){
                if(i==j ){
                    sum+=arr[i][j];
                }
                else if(i+j==3){
                    sum+=arr[i][j];
                }

            }

        }
        return sum;

    }
    public static void createArr(){
        int[][] matrix = new int[3][3];
        int k=8;
        int n = matrix.length, m = matrix[0].length;

        System.out.println("put the values in the array : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Retrieve the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        searchEle(matrix,7);

    }
    public static void searchEle(int[][] matrix, int k){
        int n= matrix.length; int m= matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==k){
                    System.out.print(" it is present at the index : "+"("+i +" "+ j+")");
                }

            }

        }
    }
    public static void printSpiral(int[][] arr){

        int startRow=0;
        int endRow= arr.length-1;
        int startColumn=0;
        int endColumn= arr[0].length-1;
        while (startRow<=endRow && startColumn<=endColumn){

            //top
            for (int i=startColumn; i<=endColumn; i++){
                System.out.print(arr[startRow][i] +" ");

            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(arr[i][endColumn] +" ");

            }
            //bottom
            for(int i=endColumn-1; i>=startColumn; i--){
                System.out.print(arr[endRow][i]+ " ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(arr[i][startColumn]+" ");
            }
            startRow++;
            startColumn ++;
            endRow --;
            endColumn --;


        }


    }
    public static void main(String[] args) {

           int[][] arr={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
           //printSpiral(arr);
       // System.out.println( diagonalSum(arr));
        //createArr();
        System.out.println( diagonalSum1(arr));
    }


}
