package Numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ClassBigIntegerBigDecimal {

    public static void main(String[] args) {

        double a = 0.03;
        double b = 0.04;
        double c = b - a;
        System.out.println(c);

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a); //subtract method
        System.out.println(_c);

        BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.9876543210");
        System.out.println(bd1.add(bd2));

       // Multiplying
        System.out.println(bd1.multiply(bd2));

        // Division - disadvantage -> get verbose
        System.out.println(bd1.divide(new BigDecimal(2)));

        // Integer - we can create them based on strings or numbers
        BigInteger bi = new BigInteger("1000000000000000");
        System.out.println(bi);
    }
}
