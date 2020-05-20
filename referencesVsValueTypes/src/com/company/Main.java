package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        anotherIntValue++;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        int[] myIntArray= new int[5]; // myIntArray it's a reference to int array in the memory
        int[] anotherIntArray = myIntArray; //both keep the same address

        System.out.println("myIntArray= " + Arrays.toString(myIntArray)); //toString will transform int to String
        System.out.println("anotherIntArray= " + Arrays.toString(anotherIntArray));
        anotherIntArray[0] = 1;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray= " + Arrays.toString(anotherIntArray));
        
        anotherIntArray = new int[] {4,5,6,7,8};//dereferencing - creating new array
        modifyArray(myIntArray);

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray= " + Arrays.toString(anotherIntArray));
    }
    private static void modifyArray (int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
