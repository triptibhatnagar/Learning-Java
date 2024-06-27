package Day3;

import java.util.Scanner;

public class Patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Solid Rectangle
        System.out.println("Solid Rectangle :-");
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int m = sc.nextInt();

        for(int i = 1; i<=n ; i++) {
            for(int j=1; j<=m ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Hollow Rectangle
        System.out.println("Hollow Rectangle :-");
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=m ; j++) {
                if(i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        //Half Pyramid
        System.out.println("Half Pyramid :-");
        for(int i = 1; i<=n ; i++) {
            for(int j=1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Inverted Half Pyramid
        System.out.println("Inverted Half Pyramid :-");
        for(int i=n ; i>=1; i--) {
            for(int j=1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Inverted Half Pyramid (Rotated by 180)
        System.out.println("Inverted Half Pyramid (Rotated by 180) :-");
        for(int i =1; i<=n ; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Half Pyramid With Number
        System.out.println("Half Pyramid With Number :-");
        for(int i =1; i<=n ; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        //Inverted Half Pyramid With Number
        System.out.println("Inverted Half Pyramid With Number :-");
        for(int i=n ; i>=1; i--) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        //Floyd's Triangle
        System.out.println("Floyd's Triangle :-");
        int num = 1;
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }


        //0-1 Triangle
        System.out.println("0-1 Triangle :-");
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=i ; j++) {
                if((i+j)%2 == 0) {
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
