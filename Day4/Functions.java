package Day4;

public class Functions {

    public static int sum(int num1, int num2) {
        int sum = num1+ num2;
        return sum;
    }
    public static void main(String args[]) {
        /*
        FUNCTIONS / METHODS -
        A function is a block of code that performs some specific task.
        It takes input, perform operation and return output.

        WHY ARE FUNCTIONS USED ?
        -> If some functionality is performed at multiple places in software, then rather than writing the same code again and again, we create a function and call it everywhere. This helps to reduce the code redundancy.
        -> Functions make maintenance of code easy as we have to change at one place if we make future changes to the functionality.
        -> Functions make the code more readable and easy to understand.

        SYNTAX FOR FUNCTION DECLARATION
        return type function_name (parameter1, parameter2, ... , parameter n) {
            //function-body
        }
        return-type

        RETURN-TYPE
        The return type of a function is the data type of the variable that the function returns.
        Example - If we write a function that adds 2 integers and return their sum then the return type of this function will be 'int' as we will return a sum that is an integer value.

        When a function does not return any value, in that case the return type of the function is 'void'.
        
        FUNCTION-NAME
        It is the unique name of that function.
        It is always recommended to decalre a function before it is used.

        PARAMETERS
        A function can take some parameters as inputs.
        These parameters are specified along with their datatypes.
        Example - if we are writing a function to add 2 integers, the parameters would be passed like - int add(int num1, int num2)

        MAIN FUNCTION
        The main function is a special function as the computer starts running the code from the beginning of the main function.
        Main function serves as the entry point for the program.
        */
        
        System.out.print("Sum : "+sum(3, 5));

    }
}
