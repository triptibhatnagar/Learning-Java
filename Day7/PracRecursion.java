package Day7;

public class PracRecursion {
    public static void main(String[] args) {

        //Print sum of first n natural numbers.
        calcSum(10, 1, 0);

        //Print factorial of a number n.
        System.out.println("Factorial : "+calcFact(5));

        //Print the fiboancci sequence till the nth term.
        System.out.println("Fibonacci Series : ");
        fibSeries(0, 1, 7);

        //Print x^n (stack height = n)
        System.out.println("Calculation of power x^n (stack height = n) : "+calcPower(2, 10));

        //Print x^n (stack height = log n)
        System.out.println("Calculation of power x^n (stack height = log n) : "+calcPow(2, 10));
    }
    public static void calcSum(int n, int i, int sum) {
        if(i == n) {
            sum += i;
            System.out.println("Sum of first "+n+" natural numbers : "+sum);
            return;
        }
        sum += i;
        calcSum(n, i+1, sum);
    }

    public static int calcFact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int fact_n = n * calcFact(n-1);
        return fact_n;
    }

    public static void fibSeries(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        int temp = a+b;
        System.out.println(a);
        fibSeries(b, temp, n-1);
    }

    public static int calcPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        int pow_x = x * calcPower(x, n-1);
        return pow_x;
    }

    public static int calcPow(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        if(n%2 == 0) {
            return calcPow(x, n/2) * calcPow(x, n/2);
        }else {
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }
    }

    //O(log n) is more efficient than O(n).
}
