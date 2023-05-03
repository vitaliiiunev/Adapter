public class Main {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        System.out.println(
//                calc.newFormula()
//                        .addOperand(2)
//                        .addOperand(10)
//                        .calculate(Calculator.Operation.POW)
//                        .result()
//        );

        System.out.println("================");

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(5, 5));
        System.out.println(intsCalc.pow(2, 10));
    }
}
