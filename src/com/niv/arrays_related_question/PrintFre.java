package com.niv.arrays_related_question;

public class PrintFre {
    //print by using ascii


    public static void printFrequencyOfString1(String str ){

        //create the array of frequency it will store the frequency
        int[] frequency=new int[256];//size it will take from range of ascii

        //first we have to retrive the ch one by one
        for(int i=0; i<str.length(); i++){

            //ch will come one by one and convert into the ascii value
            int number=str.charAt(i);
            //then now we are get count of simillar ch
            frequency[number]++;

        }
        // Print repeated characters and their frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i]!=0) { // Check if the character occurs more than once
                char ch = (char) i;
                int fre = frequency[i];
                System.out.println("Char: " + ch + ", Frequency: " + fre);
            }
        }


    }
    //print if the char are same , that particular ch frequency will be print
    public static void printFrequencyOfString(String str ){
        //create the array of frequency it will store the frequency
        int[] frequency=new int[256];//size it will take from range of ascii

        //first we have to retrive the ch one by one
        for(int i=0; i<str.length(); i++){

            //ch will come one by one and convert into the ascii value
            int number=str.charAt(i);
            //then now we are get count of simillar ch
            frequency[number]++;

        }
        // Print repeated characters and their frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 1) { // Check if the character occurs more than once
                char ch = (char) i;
                int fre = frequency[i];
                System.out.println("Char: " + ch + ", Frequency: " + fre);
            }
        }

    }
    public static void main(String[] args) {
        String str="nivruttee";
       // printFrequencyOfString(str);
        printFrequencyOfString1(str);

    }
}
