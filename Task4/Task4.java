import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {     

        try(Scanner input = new Scanner(System.in)) {

            while(true) {

                System.out.println("Input a text if it's Palindrome.");
                String base = input.nextLine();
                StringBuilder temp = new StringBuilder(base);
            
                if( base.equals( temp .reverse() .toString() ) )
                    System.out.println("This is a Palindrome.\n");
                else
                    System.out.println("This is not a Palindrome.\n"); 
                
            }
            

        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
            

    }
}
