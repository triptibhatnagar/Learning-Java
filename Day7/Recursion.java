package Day7;

public class Recursion {
    public static void main(String[] args) {
        /*
        RECURSION IN JAVA -
        Recursion is a process in which a function calls itself directly or indirectly until a condition is reached which is known as base case and the corresponding function is called a recursive function.
        Once the base case is reached, then we return back.
        In void, it return control & In other datatypes, it return value.
        Function calls are saved in the form of stacks in memory.
        
        Recursion occupies a lot of space in memory 
        Very similar to iteration. In recursion, a new memory space is created for each function call but in iteration, we use a same variable and changes are done within it.
        Infinite Recursion causes Stack Overflow.
        */
        System.out.println("Print numbers from 1 to 10 using recursion : ");
        printNum(1);
        
        System.out.println("Print numbers from 10 to 1 using recursion : ");
        printReverseNum(10);
        
    }

    //Print numbers from 1 to 10 using recursion.
    
    public static void printNum(int n) {
        if(n == 10) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }

    //Print numbers from 10 to 1 using recursion.
    public static void printReverseNum(int n) {
        if(n == 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printReverseNum(n-1);
    }
}
