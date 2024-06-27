package Day10;
import java.util.HashSet;

public class AdvancedRec {
    public static void main(String[] args) {
        //1. Tower of Hanoi
        towerOfHanoi(3, "S", "H", "D");

        //2. Reverse a String
        String str = "abcd";
        reverseStr(str, str.length()-1);

        //3. Find the first and last occurence of an element in string.
        findOccurence("abaacdaefaah", 0, 'a');

        //4. Check if an array is sorted (Strictly increasing)
        int arr[] = {1,2,3,4};
        System.out.println(ifArrSorted(arr , 0));

        int arr2[] = {1,2,3,3};
        System.out.println(ifArrSorted(arr2 , 0));

        //5. Move all 'x' to the end of the string.
        moveAllX("axbcxxd", "", 0, 0);

        //6. Remove duplicates in a string.
        String original = "abbccda";
        removeDuplicates(original, 0, "");

        //7. Print all the subsequences of the string.
        subsequences("abc", 0, "");

        //8. Print all the unique subsequences of the string.
        HashSet <String> set = new HashSet<>();
        uniqueSubsequences("aaa", 0, "", set);

        //9. Print Keypad combination.
        keypadCombo("23", 0, "");
    }

    //Tower Of Hanoi (Time Complexity : O(2^n-1) ~ O(2^n))
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("Transfer "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    //Reverse a String ('abcd' -> 'dcba') 
    //(Time Complexity : O(n))
    public static void reverseStr(String str, int idx) {
        if(idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseStr(str, idx-1);
    }

    public static int first = -1;
    public static int last = -1;
    //Find the first and last occurence of an element in string. "abaacdaefaah"
    //(Time Complexity : O(n))
    public static void findOccurence(String str, int idx, char element) {
        if(idx == str.length()) {
            System.out.println("\nFirst Occurence : "+first);
            System.out.println("Last Occurence : "+last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element) {
            if(first == -1) {
                first = idx;
            }else {
                last = idx;
            }
        }
        findOccurence(str, idx+1, element);
    }

    //Check if an array is sorted (Strictly increasing)
    //(Time Complexity : O(n))
    public static boolean ifArrSorted(int arr[], int idx) {
        if(idx == arr.length-1) {
            return true;
        }
        if(arr[idx] < arr[idx+1]) {
            return ifArrSorted(arr, idx+1);
        }else {
            return false;
        }
    }

    //Move all 'x' to the end of the string. "axbcxxd"
    //(Time Complexity : O(n))
    public static void moveAllX(String str, String newStr, int idx, int count) {
        if(idx == str.length()) {
            for(int i=0; i<count; i++) {
               newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x') {
            count++;
        }else {
            newStr += currChar;
        }
        moveAllX(str, newStr, idx+1, count);
    }

    //Remove duplicates in a string.  "abbccda"  (Time Complexity : O(n))
    public static boolean map[] = new boolean[26];
    public static void removeDuplicates(String original, int idx, String newString) {
        if (idx == original.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = original.charAt(idx);
       
        if(map[currChar - 'a'] == true) {
            //duplicate exist
            removeDuplicates(original, idx+1, newString);
        }else {
            //no duplicate
            map[currChar - 'a'] = true;
            newString += currChar;
            removeDuplicates(original, idx+1, newString);
        }
    }

    //Print all the subsequences of the string. "abc" (Time Complexity : O(2^n))
    public static void subsequences(String str, int idx, String combination) {
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        //currChar included
        subsequences(str, idx+1, combination+currChar);

        //currChar not included
        subsequences(str, idx+1, combination);
    }  

    //Print all the unique subsequences of the string. "aaa" (Time Complexity : O(2^n))
    public static void uniqueSubsequences(String str, int idx, String combination, HashSet <String> set) {
        if(idx == str.length()) {
            if(set.contains(combination)) {
                return;
            }else {
                System.out.println(combination);
                set.add(combination);
                return;
            }
        }

        char currChar = str.charAt(idx); 
        //currChar included
        uniqueSubsequences(str, idx+1, combination+currChar,set);

        //currChar not included
        uniqueSubsequences(str, idx+1, combination,set);
    }

    //Print Keypad combination.
    public static String keypad[] = {".", "abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keypadCombo(String str, int idx, String combination) {
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i < mapping.length(); i++) {
            keypadCombo(str, idx+1, combination+mapping.charAt(i));
        }
    }
}