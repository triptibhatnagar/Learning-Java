package Day5;
import java.util.Scanner;

public class ArrQues {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Take an array of names as input from the user and print them on the screen.
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();

        String names[] = new String[size];
        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }
        for(int i=0; i<size; i++) {
            System.out.print(names[i]+" ");
        }

        //Find the maximum and minimum number in an array of integers.
        int numbers[] = new int[size];
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++) {
            System.out.print(numbers[i]+" ");
        }
        int max = numbers[0];
        int min = numbers[0];
        for(int i=0; i<size; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }else if(min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum array element : "+max);
        System.out.println("Minimum array element : "+min);

        //Check if an array of numbers is sorted in ascending or not.
        boolean isAscending = true;
        for(int i=1; i<numbers.length; i++) {
            if(numbers[i] < numbers[i-1]) {
                isAscending = false;
                break;
            }
        }
        if(isAscending) {
            System.out.println("Array is sorted in ascending");
        }else {
            System.out.println("Array is not sorted in ascending");
        }
    }
}