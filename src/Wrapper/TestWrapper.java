package Wrapper;

//wrapper classes: represent the primitive types of java.
//each class has methods, and they return values.
//Operators == do not work with wrappers.

public class TestWrapper {

    public static void main(String[] args) {

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';

        Short num7 = Short.valueOf((short) 1);
        Byte num8 = Byte.valueOf((byte) 10);
        Integer num9 = Integer.valueOf((int) 100);
        Long num10 = Long.valueOf((long) 10000l);
        Float num11 = Float.valueOf((float) 3.5f);
        Double num12 = Double.valueOf((double) 3.55555);
        Boolean num13 = Boolean.valueOf((boolean) true);
        Character num14 = Character.valueOf((char) 'a');

        System.out.println(num9.intValue());
        System.out.println(num10.longValue());

        //Compare primitive types

    }
}
