package Day5;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        /*
        2D ARRAY -
        A collection of data elements arranged in a grid like structure with rows and columns.

        Syntax -
        type [][] arr = new type [rows][cols]
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();

        int num[][] = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        //From the array taken as input, search for a given number x and print its index.
        int x = 5;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(num[i][j] == x) {
                    System.out.println("x found at location : ("+i+","+j+")");
                }else {
                    System.out.println("Element x not found");
                }
            }
        }

        sc.close();
    }
}