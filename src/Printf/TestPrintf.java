package Printf;

public class TestPrintf {

    public static void main(String[] args) {

        double floatingPoint = 3.145678;
        System.out.printf("%f", floatingPoint);

        System.out.println();

        double floatingPoint2 = 3.145678;
        System.out.printf("%.2f", floatingPoint2);

        System.out.println();


        String helloWorld = "Hello, World!";
        System.out.printf("%20s", helloWorld);

        System.out.println();


        int value = -12345678;
        System.out.printf("%d", value);

        System.out.println();


        int value2 = 12345678;
        System.out.printf("%+d", value2);

        System.out.println();

        int value3 = 12345678;
        System.out.printf("%016d", value3);

        System.out.println();

        int value4 = 12345678;
        System.out.printf("%,d", value4);

        System.out.println();

        int value5 = 12345678;
        System.out.printf("% d", value5);

        System.out.println();

    }

}
