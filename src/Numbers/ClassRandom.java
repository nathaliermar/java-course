package Numbers;

import java.util.Random;

public class ClassRandom {

    public static void main(String[] args) {

        System.out.println(Math.floor(Math.random() * 10));

        Random random = new Random();

        System.out.println(random.nextInt(2 + 2));
    }
}
