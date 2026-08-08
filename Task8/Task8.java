public class Task8 {
    
    private static int sumVargs(final int... numbers) {
        int sum= 0;
        for (int index = 0; index < numbers.length; index++) 
            for (int number = 1; number <= numbers[index]; sum+=number, number++);

        return sum;

    }
    
    public static void main(String[] args) {
        System.out.println("Sum of varargs: " + sumVargs(3,3));
        
    }
}
