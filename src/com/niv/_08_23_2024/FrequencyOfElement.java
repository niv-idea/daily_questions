package com.niv._08_23_2024;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {

    public static void primeCheck(int n){
        boolean isPrime=true;
        for(int i=2; i<n/2; i++){
            if( n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n +"is a prime number .");
        }
        else {
            System.out.println(n +" is not a prime number.");
        }

    }
    public static void printFre(String s) {
        int[] frequency = new int[256];//create the array to store

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);//it will transfer the ch into ascii value
            frequency[index] = frequency[index] + 1;//if it is same then it will add
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0){
                char ch = (char) i;
                int fre = frequency[i];
                System.out.println("Char : " + ch + ", Frequency : " + fre);
            }

        }
    }
    //by using hashmap
    public static void usingHashMap(String s) {
        Map<Character, Integer> frequencyMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch,1) + 1);
            }
        }

//        frequencyMap.forEach((k, v) -> System.out.printf("Char : %s :: Frequency : %s%n", k, v));
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

//calculate factorial
    //this is example of the method reuse
    public static int factOfNum(int n){
        int factorial=1;
        for(int i=1; i<=n; i++){
            factorial*=i;

        }

        return factorial;
    }
//it will find  binomial coefficient by using the method of factOfNum
    public static void binCoeffOfNum(int n, int r){
        int factOf_n=factOfNum(n);
        int factOf_r=factOfNum(r);
        int factOf_n_r=factOfNum(n-r);
        //now the formula is
        int binCoiff=factOf_n/factOf_r*(factOf_n_r);
        System.out.println(binCoiff);
    }

    public static void main(String[] args) {
        String s="nivruttee";
        printFre(s);
       // factOfNum(5);
        //binCoeffOfNum(5,3);
        usingHashMap(s);
    }
//


}