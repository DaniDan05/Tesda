import java.util.Scanner;

public class Task5
{
	public static void main(String[] args) {
		try( Scanner input = new Scanner(System.in) ) {
		    
		    System.out.println("Input 3 numbers");
		    int [] inputNumbers = {input.nextInt(), input.nextInt(), input.nextInt()};
		    input.nextLine();
		    
		    int maxInput = inputNumbers[0];
            boolean areValuesSame = true;
		    for(int inputNumber : inputNumbers)
		        if (maxInput !=  inputNumber ) {
                    areValuesSame = false;
                    
                    if (maxInput < inputNumber)
                        maxInput = inputNumber;
                }
                

            System.out.println( areValuesSame ? "All Numbers are equal" : maxInput );

		    
		    
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
