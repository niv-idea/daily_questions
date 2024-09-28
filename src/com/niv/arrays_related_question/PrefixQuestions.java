package com.niv.arrays_related_question;

public class PrefixQuestions {

        public static int sumOfrange(int[] arr, int a, int b){
            int sum=0;

            for(int i=a; i<=b ; i++){
                sum+=arr[i];
            }
            return sum;

        }
        //without creating new array
        public static int[] prifixSum1(int[] arr){

            for(int i=1; i<arr.length; i++){
                arr[i]=arr[i-1] +arr[i];
            }

            return arr;
        }


        public static int[] prifixSum(int[] arr){
            int[] prefix=new int[arr.length];
            prefix[0]=arr[0];
            for(int i=1; i<arr.length; i++){
                prefix[i]=prefix[i-1] +arr[i];
            }

            return prefix;
        }
        public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            //   int[] arr1= prifixSum1( arr);
            //   for(int i=0; i<arr1.length; i++){
            //       System.out.print(arr1[i]+" ");
            //   }
            int result=  sumOfrange( arr, 1, 3);
            System.out.print(result);

        }
}
