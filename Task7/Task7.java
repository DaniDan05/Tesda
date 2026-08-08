import java.util.Scanner;

public class Task7 {
    
    private static double add(final double x, final double y) {
        return x + y;
    }

    private static double subtract(final double x, final double y) {
        return x - y;
    }

    private static double multiply(final double x, final double y) {
        return x * y;
    }

    private static double divide(final double x, final double y) {
        return x / y;
    }

    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input num");

        double val1 = input.nextDouble(), val2 = input.nextDouble();
        input.nextLine();

        System.out.println("Add: " + add(val1, val2) );
        System.out.println("Subtract: " + subtract(val1, val2));
        System.out.println("Multiply: " + multiply(val1, val2) );
        System.out.println("Divide: " + divide(val1, val2));

        input.close();
    }
}