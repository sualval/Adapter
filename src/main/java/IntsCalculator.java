public class IntsCalculator implements Ints {
    Calculator calculator = new Calculator();

    @Override
    public int sum(int arg0, int arg1) {
        return (int) calc(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) calc(arg0, arg1, Calculator.Operation.MULT);
    }

    @Override
    public int pow(int arg0, int arg1) {
        return (int) calc(arg0, arg1, Calculator.Operation.POW);
    }

    @Override
    public int sub(int arg0, int arg1) {
        return (int) calc(arg0, arg1, Calculator.Operation.SUB);
    }

    @Override
    public double div(int arg0, int arg1) {
        return calc(arg0, arg1, Calculator.Operation.DIV);
    }

    private double calc(int arg0, int arg1, Calculator.Operation operationEnum) {
        return calculator.newFormula().addOperand(arg0).addOperand(arg1).calculate(operationEnum).result();
    }
}
