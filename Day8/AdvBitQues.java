package Day8;

import java.util.Scanner;

public class AdvBitQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Check whether a number n is a power of 2 or not.
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Is "+n+" power of 2? : "+isPowOf2(n));

        //Toggle bit at a particular position.
        System.out.println("Toggle Bit of "+n+" : "+toggleBit(n, 3));

        //Count Set Bits
        System.out.println("Set Bits in "+n+" : "+countSetBits(n));

        //Binary To Decimal
        System.out.print("Enter the binary number : ");
        String binary = sc.next();
        System.out.println(binary+" in decimal : "+binaryToDecimal(binary));

        //Decimal To Binary
        System.out.print("Enter the decimal number : ");
        int decimal = sc.nextInt();
        System.out.println(decimal+" in binary : "+decimalToBinary(decimal));
    }


    //Check whether a number n is a power of 2 or not.
    public static boolean isPowOf2(int n) {
        if(n == 0) {
            return false;
        }
        while(n != 1) {
            if(n%2 != 0) {
                return false;
            }
            n = n/2;
        }
        return true;
    }


    //Toggle bit at a particular position.
    public static int toggleBit(int n, int pos) {
        int bitMask = 1 << pos-1;
        int toggle = bitMask ^ n;

        return toggle;
    }


    //Count Set Bits
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            n &= (n-1);
            count++;
        }
        return count;
    }


    //Binary To Decimal
    public static int binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary,2);
        return decimal;
    }


    //Decimal To Binary
    public static String decimalToBinary(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        return binary; 
    }
}