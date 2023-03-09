import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//        typically using all the original letters exactly once.
//
//        Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//        Output: true


        isAnagram("anagram", "nagaram");

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        s = new String(first);
        t = new String(second);

        if (s.equals(t)) {
        } else return false;

        return true;
    }
}