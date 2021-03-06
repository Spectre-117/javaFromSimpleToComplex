package com.javaLessons.javaSimpleToComplex.chapterOne;

public class Variables {
    public static void main(String[] args) {
        int i = 10;
        // casting smaller variable into bigger one intentionally
        short sh = (short) i;
        System.out.println("short = " + sh);
        // error occurred - long is much bigger then int so the initial long value will be compromised
        long myLongVal = 213_343_243_289_285_553L;
        int i2 = (int) myLongVal;
        System.out.println("int = " + i2);

        double db = 234.2;
        // accuracy error because of similar capacity of long and double types and due too large values
        double longToDouble = myLongVal;
        System.out.println("long to double = " + longToDouble);

        float anotherFloat = (float) db;
        System.out.println("Double to float casting - " + anotherFloat);


        int row = 28/10;
        System.out.println(row);

    }
}
