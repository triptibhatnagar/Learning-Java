package Day5;
import java.util.Scanner;

public class Arr2DQues {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Take a matrix as input from the user
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();

        int num[][] = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        // print its transpose
        System.out.println("Transpose :-");
        for(int i=0; i<cols; i++) {
            for(int j=0; j<rows; j++) {
                System.out.print(num[j][i]+" ");
            }
            System.out.println();
        }

        // print its spiral order
        System.out.println("Spiral Order :-");
        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i = colStart; i<=colEnd; i++){
                System.out.print(num[rowStart][i]+" ");
            }
            rowStart++;
            for(int i = rowStart; i<=rowEnd; i++){
                System.out.print(num[i][colEnd]+" ");
            }
            colEnd--;
            for(int i = colEnd; i>=colStart; i--){
                System.out.print(num[rowEnd][i]+" ");
            }
            rowEnd--;
            for(int i = rowEnd; i>=rowStart; i--){
                System.out.print(num[i][colStart]+" ");
            }
            colStart++;
        }

        sc.close();
    }
}