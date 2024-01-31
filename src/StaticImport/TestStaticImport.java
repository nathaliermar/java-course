package StaticImport;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TestStaticImport {

    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println(pow(a, b));

        System.out.println(sqrt(c));
    }
}
