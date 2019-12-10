package rocks.zipcode.quiz4.fundamentals;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int mid = string.length() / 2;
        for (int i = 0; i < string.length(); i++){
            if (string.length() % 2 != 0){
                return string.charAt(mid);
            }else {return string.charAt(mid + i);}
        }
        return null;
    }

    public static String capitalizeMiddleCharacter(String str) {
        int mid = str.length() / 2;
        StringBuilder sb = new StringBuilder(str);
        char ch = Character.toUpperCase(sb.charAt(mid));
        sb.setCharAt(mid, ch);
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int mid = str.length() / 2;
        StringBuilder sb = new StringBuilder(str);
        char ch = Character.toLowerCase(sb.charAt(mid));
        sb.setCharAt(mid, ch);
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        String s = str.toLowerCase();
        char[] array = s.toCharArray();
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++){
            if (array[i] == array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length()-1; i++){
            if (sb.charAt(i) == sb.charAt(i+1)){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++){
            if (Character.isUpperCase(sb.charAt(i))){
                char c = Character.toLowerCase(sb.charAt(i));
                sb.setCharAt(i,c);
            }else {char ch =Character.toUpperCase(sb.charAt(i));
            sb.setCharAt(i, ch);}
        }
        return sb.toString();
    }
}