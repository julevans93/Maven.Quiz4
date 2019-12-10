package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int mid = values.length / 2;
        for (int i = 0; i < values.length; i++){
            if (values.length % 2 != 0){
                return values[mid];
            }else {return values[mid +1];}
        }
        return null;
    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList array = new ArrayList(Arrays.asList(values));
        int mid = values.length/2;
        for (int i = 0; i < array.size(); i++){
            if (i == mid){
                array.remove(i);
            }
        }
        return (String[]) array.toArray(new String [array.size()]);
    }

    public static String getLastElement(String[] values) {
        for (int i = 0; i < values.length; i++){
            if (i == values.length-1){
                return values[i];
            }
        }
        return null;
    }

    public static String[] removeLastElement(String[] values) {
        ArrayList array = new ArrayList(Arrays.asList(values));
        for (int i = 0; i < array.size(); i++){
            if (i == array.size()-1){
                array.remove(i);
            }
        }
        return (String[]) array.toArray(new String [array.size()]);
    }
}