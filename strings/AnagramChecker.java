package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        //Remove spaces and convert to lower case to ensure accurate comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();  
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();  //sequence of characters
        char[] chars2 = str2.toCharArray();
        System.out.println(chars1);  
        System.out.println(chars2);
        Arrays.sort(chars1);  //Order
        Arrays.sort(chars2);
        System.out.println(chars1);  
        System.out.println(chars2);

        return Arrays.equals(chars1, chars2); //compare text
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        scanner.close();

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams."); //madam, madam, 121, 121
        } else {
            System.out.println("The two strings are not anagrams.");//java, ram
        }
    }
}


