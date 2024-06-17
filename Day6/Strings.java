package Day6;

import java.util.Scanner;

public class Strings {
    public static void main(String args[])  {
        /*
        STRING -
        A String in Java is a sequence of characters that exitsts as an object of the class java.lang.String
        Java strings are created and manipulated through the String class.
        Strings are immutable. Once created, its value can't be changed.
        */

        //String declaration
        String first_name = "Nobita";
        String last_name = "Nobi";
        String full_name = "Nobita Nobi";
        String sentence = "His name is Nobita Nobi";
        System.out.println("String Examples :- ");
        System.out.println(full_name);
        System.out.println(sentence);

        //Input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name : ");
        String fullString = sc.nextLine();
        System.out.println("Your full name is : "+fullString);
        System.out.print("Enter your name : ");
        String str = sc.next();
        System.out.println("Your name is : "+str);

        //Functions performed on strings

        //1) Concatenation : +
        String fullName = first_name+" "+last_name; //concatenating 3 strings
        System.out.println("Concatenation : "+fullName);

        //2) Length of String : .length()
        System.out.println("Length of fullName : "+fullName.length());

        //3) To access Characters of String : .charAt(index)
        System.out.println("To access Characters of String : ");
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        /*4) Comparing Strings : str1.compareTo(str2)
        This function returns 3 types of values
        Case1 : +ve value -> str1 > str2 or str1 comes before str2 according to dictionary order
        Case2 : -ve value -> str1 < str2 or str1 comes after str2 according to dictionary order
        Case3 : 0 -> str1 == str2
        */
        String name1 = "Doracake";
        String name2 = "Doracake";

        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
        //o/p - Strings are equal

        if(name1 == name2) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
        //o/p - Strings are equal

        if(new String("abc") == new String("abc")) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
        //o/p - Strings are not equal (incorrect)

        //5) Substring : substring(begIdx, endIdx)
        String str1 = "Tripti Bhatnagar";
        System.out.println(str1.substring(0,6)); //Tripti
        System.out.println(str1.substring(7)); //Bhatnagar

        //6) Parse Int Method of Integer class
        String str2 = "987";
        int str2_num = Integer.parseInt(str2);
        System.out.println("String to int : "+str2_num);

        //7) To String Method of String class
        int num = 1234;
        String numToStr = Integer.toString(num);
        System.out.println("Int to string : "+numToStr);
    }
}