package Day3;

import java.util.Scanner;

public class AdvPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        //Butterfly Pattern
        System.out.println("Butterfly Pattern :-");
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1 ; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Solid Rhombus
        System.out.println("Solid Rhombus :-");
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        //Number Pyramid
        System.out.println("Number Pyramid :-");
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


        //Palindromic Pattern
        System.out.println("Palindromic Pattern :-");
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        //Diamond Pattern
        System.out.println("Diamond Pattern :-");
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=n-i ; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i ; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Hollow Butterfly
        System.out.println("Hollow Butterfly :-");
        for(int i=1; i<=n ; i++) {
            System.out.print("*");
            for(int j=1; j<=i-2; j++) {
                System.out.print(" ");
            }
            if(i>1) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1; j<=i-2; j++) {
                System.out.print(" ");
            }
            if(i>1) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1 ; i--) {
            System.out.print("*");
            for(int j=1; j<=i-2; j++) {
                System.out.print(" ");
            }
            if(i>1) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1; j<=i-2; j++) {
                System.out.print(" ");
            }
            if(i>1) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Hollow Rhombus
        System.out.println("Hollow Rhombus :-");
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=5 ; j++) {
                if(i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        //Pascal's Triangle
        System.out.println("Pascal's Triangle :-");
        
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            int num = 1;
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num = num * (i-j)/j;
            }
            System.out.println();
        }

        
        //Pyramid With Number
        System.out.println("Pyramid With Number :-");
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        //Inverted Half Pyramid
        System.out.println("Inverted Half Pyramid :-");
        for(int i=1; i<=n ; i++) {
            for(int j=0; j<=i-1; j++) {
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
