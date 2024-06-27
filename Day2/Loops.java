package Day2;

import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
        LOOP -  A loop is used for executing a block of statements repeatedly until a particular condition is satisfied.
        A loop consists of an initialization statement, a test condition and an increment statement.

        FOR LOOP - The syntax of the for loop is :
        for(initialization; condition; update) {
            body of loop
        }
        */
        //Example
        System.out.println("For Loop :-");
        for(int i=1; i<=10; i++) {
            System.out.print(i+" ");
        }

        /*
        WHILE LOOP - The syntax of the while loop is :
        initialization;
        while(condition) {
            body of loop
            update;
        }
        */
        //Example
        System.out.println("\nWhile Loop :-");
        int counter = 1;
        while(counter<=10) {
            System.out.print(counter+" ");
            counter++; //counter = counter+1
        }

        /*
        DO WHILE LOOP - The syntax of the do while loop is :
        initialization;
        do {
            body of loop
        }while(condition);
        */
        System.out.println("\nDo While Loop :-");
        int counter2 = 1;
        do {
            System.out.print(counter2+" ");
            counter2++;
        }while(counter2<=10);

        /*
        DIFFERNCE BETWEEN USAGE OF WHILE AND DO-WHILE
        The main difference between the two loops is that the while loop checks the condition before the execution of the statement(s) whereas the do-while loop ensures that the statement(s) are executed at least once before evaluating the condition. While loop is entry-controlled and Do-while is exit controlled
        */

        //QUESTIONS

        //Print all the even numbers till n.
        System.out.print("\nEnter a number : ");
        int n = sc.nextInt();

        System.out.print("Even numbers till "+n+" : ");
        for(int i = 0; i<=n ; i++) {
            if(i%2 == 0) {
                System.out.print(i+" ");
            }
        }

        //Print the sum of first n natural numbers.
        System.out.print("\nSum of numbers till "+n+" : ");
        int sum = 0;
        for(int i = 1; i<=n ; i++) {
            sum += i;
        }
        System.out.print(sum);

        //Print the table of a number n.
        System.out.println("\nTable of "+n+" : ");
        for(int i = 1; i<=10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }


        //Print if a number n is prime or not.
        boolean isPrime = true;
    
        for(int i = 2; i<n/2; i++) {
            if(n%i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            if(n == 1 || n == 0) {
                System.out.println("This is neither a prime nor a composite number");
            }else {
                System.out.println("This is a prime number");
            }
        }else {
            System.out.println("This is not a prime number");
        }

        /*
        INFINITE LOOP - 

        Example - 
        for(;;) {
            System.out.println("Hello");
        }

        This loop will print Hello infinite times as there is no initialization, condition and updation paramters.
        */

        //Make a menu driven program. The user can enter 2 numbers, either 1 or 0. If the user enters 1, then keep taking input from the user for a student's marks (out of 100). If they enter 0, then stop. If student scores : marks >=90 -> "Great" , 89>=marks>=60 -> "Good" , 59>=marks>=0 -> "This is Good as well".

        int choice;
        do {
            System.out.print("Enter the student's marks : ");
            int marks = sc.nextInt();
            
            if(marks >= 90) {
                System.out.println("Great");
            }else if(89 >= marks && marks >= 60) {
                System.out.println("Good");
            }else {
                System.out.println("This is Good as well");
            }
            System.out.println("Do you want to continue?\n1(Yes) or 0(No)");
            choice = sc.nextInt();
        }while(choice == 1);
          
        sc.close();
    }
}
