package Varargs;

//We use Varargs when we don't know how many parameters will be passed by the developer.
//We use it when we don't know how many parameters will be passed by the developer.

public class TestVarargs {

    public static void main(String[] args) {

        System.out.println(summ(1, 2));
        System.out.println(summ(1, 2, 3));

        int[] vector = {1, 2, 3, 4, 5};
        System.out.println(summ(vector));

        System.out.println(summ(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    static int summ(int a, int b){
        return a + b;
    }

    static int summ(int a, int b, int c){
        return a + b + c;
    }

    static int summ(int[] vector){

        int total = 0;

        for(int i=0; i<vector.length; i++){
            total += vector[i];
        }
        return total;
    }

    static int summ(Integer... vector){

        int total = 0;

        for(int i=0; i<vector.length; i++){
            total += vector[i];
        }

        return total;
    }
}
