public class Task8 {
    
    private static int sumVargs(final int... numbers) {
        int sum= 0;
        for (int index = 0; index < numbers.length; index++)  {
            
            int paramSum = 0;

            for (int number = 1; number <= numbers[index]; paramSum+= number, sum+=number, number++);

            System.out.println("Parameter " + numbers[index] + " = " + paramSum + " = " + sum);
        }

        return sum;

    }
    
    public static void main(String[] args) {
        System.out.println("Sum of varargs: " + sumVargs(4, 5, 10));
        
    }
}
