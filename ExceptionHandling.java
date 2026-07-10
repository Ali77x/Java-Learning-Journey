import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling{
    public static void main(String[] args){
        // different types of exceptions that could occur.

        Scanner input = new Scanner(System.in);

        //Aritrhmetric Exception.

        try{
            int x = 10 / 0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        //Input mismatch.

        try{
            System.out.print("Enter number: ");
            int num = input.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input.");
        }

        // out of bounds exception.
        int[] num = {1, 2, 3};
        try{
            System.out.println(num[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds access.");
        }

    }
}