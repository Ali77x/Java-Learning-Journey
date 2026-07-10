import java.util.Scanner;
import java.util.InputMismatchException;
public class Challenge2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        try{
        int age = input.nextInt();

        }catch(InputMismatchException e){
            System.out.print("Invalid input.");
        }

        input.close();

    }
}