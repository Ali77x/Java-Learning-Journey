import java.util.Scanner;

public class Challenge1{
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
//enter numbers that could cause an Arithmetic excep
        System.out.print("Enter two integers: ");
        int A = input.nextInt();
        int B = input.nextInt();

        try{
            int quotient = A/B;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception has occured.\n" + e);
        }
        input.close();
    }
}