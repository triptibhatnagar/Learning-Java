package Day1;
import java.util.*;

public class Fundamentals {
    
    public static void main(String args[]) {
        /*
        OUTPUT IN JAVA - 
        System.out.println();
        System.out.print();
        System.out.print("\n"); 
        */
        System.out.println("Hello World 1");
        System.out.print("Hello World 2");
        System.out.print("Hello World 3\nHello World 4");

        //printing a pattern
        System.out.print("\nPattern 1:*\n**\n***\n****\n");

        System.out.print("Pattern 2:\n*\n**\n");

        /*
        VARIABLES - a container or storage area used to hold data. 
        Each variable should be given a unique identifier.
        Java is a typed language, i.e., a variable is declared with its datatype.
         */

        String name = "Tripti";
        int age = 19;
        String friend = "abc";
        System.out.println(name);
        System.out.println(age);
        System.out.println(friend);

        /*
        DATATYPES - declarations for variables
        They determine the type and size of data associated with variables.

        Primitive Datatypes - 
        used to store simple values
        byte(1 byte), short(2 byte), int(4 byte), long(8 byte), double(8 byte), float(4 byte), char(2 byte), bool(1 byte).

        Non-Primitve Datatypes - 
        used to store complex values
        these are of variable size and are usually declared with 'new' keyword.
        String, Arrays, Class Object, Interface
        */

        //EXAMPLES
        float amount = 125.75f;
        char ch = '$';
        String str = new String("XYZ");
        int[] marks = new int[3];
        marks[0] = 99;
        marks[1] = 29;
        marks[2] = 58;

        System.out.println(amount);
        System.out.println(ch);
        System.out.println(str);
        //SUM OF 2 NUMBERS
        int a = 12;
        int b = 13;
        int sum = a+b;
        System.out.println(sum);

        //PRODUCT OF 2 NUMBERS
        int prod = a*b;
        System.out.println(prod);

        //DEMONSTRATING PRIORITY OF OPERATORS
        // * / % > + -
        int x = 10, y = 5;
        float ans1 = x*y/x-y;
        float ans2 = (x*y)/(x-y);

        System.out.println(ans1);
        System.out.println(ans2);

        /*
        CONSTANTS - an entity which has a fixed value
        Value to a constant can't be changed if assigned once
        */
        final float PI = 3.14f;
        System.out.println(PI);

        /*
        INPUT IN JAVA - 
        First, import of a package is done.
        */

        /*
        Scanner = class
        sc = object
        .in = used for input
        .next() = function, only take one token of characters
        .nextLine() = function, take the whole input of charcters
        .nextInt() = used to take int input
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println(fullName);

        System.out.print("Enter your name: ");
        String input = sc.next();
        System.out.println(input);

        System.out.print("Enter your roll number: ");
        int roll = sc.nextInt();
        System.out.println(roll);
    }
}
