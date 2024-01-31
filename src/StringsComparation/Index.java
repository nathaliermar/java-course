package StringsComparation;

// -1 when doesn't exist

public class Index {

    public static void main(String[] args) {

        String banana = "banana";
        String ana = "ana";

        System.out.println(banana.indexOf('x'));
        System.out.println(banana.indexOf('b'));
        System.out.println(banana.indexOf('a'));

        System.out.println(banana.indexOf(ana));

       //Last time the lyric or phrase existed
        System.out.println(banana.lastIndexOf('a'));
        System.out.println(banana.lastIndexOf(ana));


        //Returns true or false if it exists in the sentence
        System.out.println(banana.contains(ana));
    }
}
