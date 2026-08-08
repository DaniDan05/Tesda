import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return Math.floorDiv(a, b);
    }


    public static void main(String[] args) {
        int val1 = 10, val2 = 5;
        System.out.println("Sum: " + add(val1, val2));
        System.out.println("Difference: " + subtract(val1, val2));
        System.out.println("Product: " + multiply(val1, val2));
        System.out.println("Quotient: " + divide(val1, val2));
    }
}
