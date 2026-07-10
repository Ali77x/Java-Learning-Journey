import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
        System.out.print("Enter Student Identification Number: ");
        int SIN = input.nextInt();

        if(SIN < 1000 || SIN > 9999){
            throw new InvalidSINException("Student Identification Number must be 4 digits.");
        }

        System.out.print("Student number entered is: " + SIN);

        }
        catch(InvalidSINException e){
            System.out.print(e.getMessage());
        }

        input.close();
        
    }
}