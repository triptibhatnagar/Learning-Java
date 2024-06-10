package Day4;

import java.util.Scanner;

public class Practice {

    //Print a name using function
    public static void printName(String name) {
        System.out.println(name);
    }

    //Make a function to add two numbers and return the sum
    public static int calcSum(int a, int b) {
        return a+b;
    }

    //Make a function to multiply two numbers and return the product
    public static int calcProd(int a, int b) {
        return a*b;
    }

    //Find the factorial of a number n using function
    public static void calcFact(int n) {
        if(n<0) {
            System.out.println("Invalid Number");
            return ;
        }
        
        int fact = 1;
        for(int i=n; i>=1 ; i--) {
            fact *= i;
        }
        System.out.print("Factorial : "+fact);
        return;
    }

    //Make a function to check if a number is prime or not.
    public static void primeOrNot(int n) {
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            if(n == 1 || n == 0) {
                System.out.println("\nNeither prime nor composite");
            }else {
                System.out.println("\nPrime number");
            }
        }else {
            System.out.println("\nNot a prime number");
        }
        return;
    }

    //Make a function to check if a given number n is even or not.
    public static boolean evenOrNot(int n) {
        if(n%2 == 0) {
            return true;
        }else {
            return false;
        }
    }

    //Make a function to print the table of a given number n.
    public static void printTable(int n) {
        for(int i=1; i<=n ; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
        return;
    }

    //Enter 3 numbers from the user and print their average.
    public static double calcAvg(int num1, int num2, int num3) {
        return (num1+num2+num3+0.0)/3;
    }

    //Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumOfOdd(int n) {
        int sum  = 1;
        if(n == 1) {
            return 1;
        }
        for(int i=1; i<=n ; i++) {
            if(i%2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    //Write a function which takes two numbers and return the greater of those two.
    public static int getGreater(int num1, int num2) {
        if(num1 > num2) {
            return num1;
        }else {
            return num2;
        }
    }

    //Write a function that takes in the radius as input and returns the circumference of circle.
    public static double calcCircumference(int radius) {
        return 2*Math.PI*radius;
    }

    //Write a function that takes in the age as input and return that if the person is eligible to vote or not.
    public static boolean canVoteOrNot(int age) {
        if(age > 18) {
            return true;
        }else {
            return false;
        }
    }

    //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeroes entered.
    //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another, i.e., x^n.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any name : ");
        String name = sc.nextLine();
        printName(name);

        System.out.println("Enter two numbers :-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum : "+calcSum(a,b));

        System.out.println("Product : "+calcProd(a, b));

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        calcFact(n);
        
        primeOrNot(n);

        System.out.println("Is "+n+" even or not ?\n"+evenOrNot(n));

        System.out.println("Table of "+n+" :-");
        printTable(n);

        System.out.println("Enter three numbers :-");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Average of "+num1+", "+num2+", "+num3+" : "+calcAvg(num1, num2, num3));

        System.out.println("Sum of all odd numbers from 1 to "+n+" is : "+sumOfOdd(n));

        System.out.println(getGreater(num1, num2)+" is greater");

        System.out.print("Enter radius : ");
        int radius = sc.nextInt();
        System.out.println("Circumference of circle with radius "+radius+" : "+calcCircumference(radius));

        System.out.print("Enter age : ");
        int age = sc.nextInt();
        System.out.println("Is the person with age "+age+" is eligible to vote? :- "+canVoteOrNot(age));
        
    }
}