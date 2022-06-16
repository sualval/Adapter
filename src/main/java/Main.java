
public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(10, 20));
        System.out.println(intsCalc.mult(10, 20));
        System.out.println(intsCalc.sub(10, 20));
        System.out.println(intsCalc.div(10, 20));
        System.out.println(intsCalc.pow(10, 20));
    }
}
