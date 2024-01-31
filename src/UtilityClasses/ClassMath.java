package UtilityClasses;


public class UtilityMath {

    public static void main(String[] args) {

        System.out.println(Math.pow(2, 3));

        // rounds according to the value, the metric is 4.5
        System.out.println(Math.round(4.7));

        System.out.println(Math.round(4.4));

        // rounds up regardless of value
        System.out.println(Math.ceil(4.4));
        System.out.println(Math.ceil(4.7));

        // rounds down regardless of value
        System.out.println(Math.floor(4.7));
        System.out.println(Math.floor(4.7));

        // To generate random numbers, we use round for a round number.
        System.out.println(Math.round(java.lang.Math.random() * 100));

        // Calculate sine
        System.out.println(Math.sin(java.lang.Math.toRadians(30)));

        // Calculate cosine
        System.out.println(Math.cos(java.lang.Math.toRadians(1)));

        // Calculate tangent
        System.out.println(Math.tan(java.lang.Math.toRadians(45)));

    }

}
