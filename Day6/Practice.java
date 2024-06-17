package Day6;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cumulative length of all the strings in an array.
        String arr[] = {"abc","defg","hijkl"};
        int totLen = 0;
        for(int i=0; i<arr.length; i++) {
            totLen += arr[i].length();
        }
        System.out.println("Cumulative length of all the strings in an array : "+totLen);

        // Replace 'e' with 'i' in a string.
        String str = "eagle";
        System.out.println("Original String : "+str);
        String result = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                result += 'i';
            }else {
                result += str.charAt(i);
            }
        }
        System.out.println("Resulting string after replacing 'e' with 'i' : "+result);

        //Print username from the input email.
        System.out.print("Enter email : ");
        String email = sc.next();
        String username = "";
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            }else {
                username += email.charAt(i);
            }
        }
        System.out.println("Username : "+username);

        // Reverse a string.
        StringBuilder sb = new StringBuilder("rhythm");
        System.out.println("Original String : "+sb);
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("Reversed string : "+sb);    
    }
}