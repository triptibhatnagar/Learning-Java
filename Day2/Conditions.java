package Day2;

import java.util.Scanner;

public class Conditions {
    public static void main(String args[]) {
        /*
        Conditional Statements -
        if, if else, nested if else, else if, switch

        -> if block is used to specify the code to be executed if the condition specified in if is true
        -> else block is executed if condition is false
        -> switch case statements are a substitute for many else if statements that compare a variable to multiple values. After a match is found,it executes the corresponding code of that value case.
        */

        //Input user's age and tell whether they are adult or not.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age>18) {
            System.out.println("User is adult");
        }else {
            System.out.println("User is not adult");
        }

        
        //Input a number and check whether it is odd or even
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n%2 == 0) {
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }


        //Input 2 numbers, a and b, and tell whether both are equal, a is greater or a is smaller.
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("Both are equal");
        }else if(a>b) {
            System.out.println("a is greater");
        }else {
            System.out.println("a is smaller");
        }

        //nested if else
        /*
        if(a == b) {
            System.out.println("Both are equal");
        }else {
            if(a>b) {
                System.out.println("a is greater");
            }else {
                System.out.println("a is smaller");
            }
        }
        */


        //If 3 is a odd number, print "Bazinga"
        if(3%2 != 0) 
            System.out.println("Bazinga");
        //single statement can be executed without {}


        //Input a number from user and print "Hello" for 1, "Namaste" for 2, "Bonjour" for 3
        System.out.print("Enter a number - 1,2 or 3: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1: 
            System.out.println("Hello");
            break;
            case 2: 
            System.out.println("Namaste");
            break;
            case 3: 
            System.out.println("Bonjour");
            break;
            default:
            System.out.println("Invalid number");
        }


        //Make a calculator. Take 2 numbers(x and y) from the user and perform an operation as follows.
        /* 
        1 : + 
        2 : -
        3 : *
        4 : /
        5 : %
        */

        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 for remainder");
        int op = sc.nextInt();

        switch(op) {
            case 1 :
            System.out.println(x+y);
            break;
            case 2 :
            System.out.println(x-y);
            break;
            case 3 :
            System.out.println(x*y);
            break;
            case 4 :
            System.out.println(x/y);
            break;
            case 5 :
            System.out.println(x%y);
            break;
            default: 
            System.out.println("Invalid Operator");
        }


        //Ask the user to enter the number of the month and print the name of the month.
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();

        switch(month) {
            case 1:
            System.out.println("January");
            break;
            case 2:
            System.out.println("February");
            break;
            case 3:
            System.out.println("March");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("May");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("October");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
            default: 
            System.out.println("Invalid number");
        }


        //Ask the user to enter the number of the day of a week and print the name of the day.
        System.out.print("Enter the day number: ");
        int day = sc.nextInt();

        switch(day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default :
            System.out.println("Error 404..");
        }

        sc.close();
    }
}
