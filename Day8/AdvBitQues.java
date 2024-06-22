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
    }

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

    public static int toggleBit(int n, int pos) {
        int bitMask = 1 << pos-1;
        int toggle = bitMask ^ n;

        return toggle;
    }
}