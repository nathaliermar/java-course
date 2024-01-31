package Exercise;

public class Calculator {

    enum Operation{
        ADD("+") {
            @Override
            public double execOperation(double x, double y) {
                return x + y;
            }
        }, SUBTRACT("-") {
            @Override
            public double execOperation(double x, double y) {
                return x - y;
            }
        }, MULTIPLY("*") {
            @Override
            public double execOperation(double x, double y) {
                return x * y;
            }
        }, DIVIDE("/") {
            @Override
            public double execOperation(double x, double y) {
                return x / y;
            }
        };

        private String symbol;

        Operation(String symbol){
            this.symbol = symbol;
        }

        public abstract double execOperation(double x, double y);

        public String toString(){
            return this.symbol;
        }
    }

    public static void main(String[] args) {

        double x = 2.0;
        double y = 4.0;

        for (Operation op : Operation.values()){
            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(op.execOperation(x, y));
        }

    }
}
