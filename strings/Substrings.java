package strings;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String[] substrings = findSubstrings(str);
        System.out.println("Substrings: ");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }

    public static String[] findSubstrings(String str) {
        int n = str.length();
        int count = n * (n + 1) / 2;
        String[] substrings = new String[count];

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings[index++] = str.substring(i, j);
            }
        }

        return substrings;
    }
}
