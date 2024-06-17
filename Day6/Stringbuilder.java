package Day6;

import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        /*STRING BUILDER -
        The StringBuilder class in Java is a mutable sequence of characters - add,delete,modify
        It is used for dynamic string manipulation.
        */

        //Declaration
        StringBuilder sb = new StringBuilder("HelloZava");
        System.out.println("String : "+sb);

        //Print character at a particular index
        System.out.print("Character at index 5 : "+sb.charAt(5));

        //Set Character at a index (modify)
        sb.setCharAt(5,'J');
        System.out.print("\nAfter modification : "+sb);

        //Insert Character at a index (add)
        sb.insert(6,'a');
        System.out.print("\nAfter inserting : "+sb);

        //Delete Character
        sb.delete(6,7);
        System.out.print("\nAfter deletion : "+sb);

        //Append Character (add at end)
        sb.append("aaa");
        System.out.print("\nAfter appending : "+sb);

        //Input from user
        Scanner sc = new Scanner(System.in);

        StringBuilder sb1 = new StringBuilder();
        System.out.print("\nEnter a string : ");
        sb1.append(sc.next());
        System.out.print("String from stringbuilder : "+sb1.toString());
    }
}