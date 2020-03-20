package rocks.zipcode.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int middle = string.length() / 2;
        return string.charAt(middle);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int middle = str.length() / 2;
        StringBuffer buffer =new StringBuffer(str);
        buffer.setCharAt(middle, Character.toUpperCase(buffer.charAt(middle)));
        return buffer.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int middle = str.length() / 2;
        StringBuffer buffer = new StringBuffer(str);
        buffer.setCharAt(middle, Character.toLowerCase(buffer.charAt(middle)));
        return buffer.toString();
    }

    public static Boolean isIsogram(String str) {
        str.toLowerCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i+1]){
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length - 1; i++){
            if (chars[i] == chars[i+1])
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        str.toLowerCase();
        char[] chars = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : chars){
            list.add(c);
        }
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                list.remove((Character) chars[i]);
                list.remove((Character) chars[i]);
                i++;
            }
        }
        Character[] output = new Character[list.size()];
        output = list.toArray(output);
        char[] output2 = new char[output.length];
        for (int i = 0; i < output2.length; i++) {
            output2[i] = output[i];
        }
        return new String(output2);
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 64 && chars[i] < 91)
                chars[i] = Character.toLowerCase(chars[i]);
            else if (chars[i] > 96 && chars[i] < 123)
                chars[i] = Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}