package Day5;

import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        /*
        ARRAYS - 
        Arrays in Java are like a list of elements of the same type, i.e., a list of integers, a list of booleans etc.
        */

        // a)Creating an Array (method1) - with new keyword
        int arr[] = new int[3];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 9;

        // b)Creating an Array (method2) -
        int arr2[] = {2,4,9};

        // c)Taking an array as an input and printing its elements

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int arr3[] = new int[size];

        for(int i=0; i<size ; i++) {
            arr3[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++) {
            System.out.print(arr3[i]+" ");
        }

        //From the array taken as input, search for a given number x and print its index.
        int x = 5;
        for(int i=0; i<arr3.length; i++) {
            if(arr3[i] == x) {
                System.out.println("\nx found at index : "+i);
            }else {
                System.out.println("Element x not found");
            }
        }
    }
}
