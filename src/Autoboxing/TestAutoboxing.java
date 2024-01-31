package Autoboxing;

//Process of transforming a primitive type into an object type and vice versa.

public class TestAutoboxing {

  public static void main(String[] args){

        Short num1 = 1;
        Byte num2 = 10;
        Integer num3 = 100;
        Long num4 = 10000l;
        Float num5 = 3.5f;
        Double num6 = 3.55555;
        Boolean flag = true;
        Character a = 'a';


        //auto un-boxing - tipo classe -> tipo primitivo

        int num13 = num3; //num3.intValue();


        //autoboxing em expressões
        num3++;

        System.out.println(num3);


        //auto unboxing num3 -> autoboxing num13/num3 -> num10
        Integer num10 = num13/num3;


        //mau uso
        Double b, c, d;
        b = 10.0;
        c = 12.2;
        d = 4.7;

        Double media = (b + c + d)/3;
        System.out.println(media);

    }
}
