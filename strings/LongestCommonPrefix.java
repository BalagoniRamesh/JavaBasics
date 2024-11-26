package strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
//              System.out.println(prefix);

            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String commonPrefix = longestCommonPrefix(input);
        System.out.println("Longest common prefix: " + commonPrefix);
    }
}
