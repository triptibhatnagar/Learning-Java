package Day7;

public class BitManipultion {
    public static void main(String[] args) {
        /*
        BIT MANIPULATION - 
        4 major operations :
        1) Get Bit - 
        */

        //Get the 3rd bit of a number n (n=0101)
        System.out.println("3rd bit of 5(0101) : "+getBit(5, 3));

        //Set the 2nd bit of a number n (n=0101)
        System.out.println("Setting 2nd bit of 5 : "+setBit(5, 2));

        //Clear the 3rd bit of a number n (n=0101)
        System.out.println("Clearing 3rd bit of 5 : "+clearBit(5, 3));

        //Update the 2nd bit of a number n (n=0101) to 1
        System.out.println("Updating 2nd bit of 5 : "+updateBit(5, 2, 1));
    }
    
    public static int getBit(int n, int position) {
        int bitmask = 1 << position-1; //subtraction is more prior to left shift, so no brackets
        int get = bitmask & n;
        if(get == 0) {
            return 0;
        }else {
            return 1;
        }
    }

    public static int setBit(int n, int position) {
        int bitmask = 1 << position-1;
        int set = bitmask | n; //pipeline operator

        return set;
    }

    public static int clearBit(int n, int position) {
        int bitmask = 1 << position-1;
        int clear = ~bitmask & n;

        return clear;
    }

    public static int updateBit(int n, int position, int oper) {
        int bitmask = 1 << position-1;
        if(oper == 1) {
            int set = bitmask | n;
            return set;
        }else {
            int clear = ~bitmask & n; //~ tilde

            return clear;
        }
    }
}
