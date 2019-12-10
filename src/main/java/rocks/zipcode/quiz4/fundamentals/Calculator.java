package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        ArrayList array = new ArrayList();
        for (Double val : value){
            array.add(Math.sqrt(val));
        }
        return (Double[]) array.toArray(new Double[array.size()]);
    }

    public static Double[] squares(Double... values) {
        ArrayList array = new ArrayList();
        for (Double val : values){
            array.add(val * val);
        }
        return (Double[]) array.toArray(new Double[array.size()]);
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor / dividend;
    }
}
