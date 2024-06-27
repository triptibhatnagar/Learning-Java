package Day1;
import java.util.*;


public class Question {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //Input 2 numbers from the user and print their sum.
        System.out.println("Enter two numbers :-");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+sum);

        //Try to declare meaningful variables of each type.
        byte marks = -123;
        short amount = 27000;
        int x = 10;
        long year = 54378900;
        double price = 45.505;
        float coin = 0.50f;
        char sign = '$';
        boolean isPrime = false;

        System.out.println("Try to declare meaningful variables of each type :- ");
        System.out.println("byte : "+marks);
        System.out.println("short : "+amount);
        System.out.println("int : "+x);
        System.out.println("long : "+year);
        System.out.println("double : "+price);
        System.out.println("float : "+coin);
        System.out.println("char : "+sign);
        System.out.println("boolean : "+isPrime);

        //WAP that prints the table of a number that is input by the user.
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The table of "+n+" is :-");
        System.out.println(n*1);
        System.out.println(n*2);
        System.out.println(n*3);
        System.out.println(n*4);
        System.out.println(n*5);
        System.out.println(n*6);
        System.out.println(n*7);
        System.out.println(n*8);
        System.out.println(n*9);
        System.out.println(n*10);

        //WAP that takes radius of a circle as input, calculates its perimeter and area and print its output to the user.
        System.out.print("Enter the radius of a circle: ");
        double r = sc.nextDouble();
        double perimeter = 2*Math.PI*r;
        double area = Math.PI*r*r;

        System.out.print("The radius is : "+r+"\n");
        System.out.print("Perimeter: "+perimeter+"\n"+"Area: "+area);

        sc.close();
    }
}
