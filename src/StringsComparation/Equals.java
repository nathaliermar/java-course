package StringsComparation;

public class Equals {

    public static void main(String[] args) {

        String hello = "Hello";
        String hello2 = "HellO";
        String hello3 = "Hello";

        String hello4 = new String(hello);

        System.out.println("hello equals hello2 = " + hello.equals(hello2)); //false
        System.out.println("hello equals hello3 = " + hello.equals(hello3)); //true

        System.out.println("hello equals hello2 = " + hello.equalsIgnoreCase(hello3)); //true

        System.out.println("hello == hello2 " + (hello == hello2)); //false
        System.out.println("hello == hello3 " + (hello == hello3)); //true

        System.out.println("hello == hello4 " + (hello == hello4)); //false
        System.out.println("hello equals hello4 " + (hello == hello4)); //true
        System.out.println("hello equalsIgnoreCase hello4 = " + hello.equalsIgnoreCase(hello4));


       //Region Matches

        String banana = "banana";
        String ana = "ana";
        String ban = "Ban";

        System.out.println(banana.regionMatches(1, ana, 0, 3));
        System.out.println(banana.regionMatches(2, ana, 1, 2));
        System.out.println(banana.regionMatches(true, 0, ban, 0, 3));

        System.out.println(banana.endsWith(ana));
        System.out.println(banana.startsWith(ban));


        //Compare to - Collection of objects, ordering

        String a = "a";
        String b = "b";
        String aCapital = "A";

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo("a"));
        System.out.println(a.compareTo(aCapital));

        // -1 when a > b
        // 0 when a == b
        //1 or >1 when a < b
    }
}
