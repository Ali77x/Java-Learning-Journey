import java.util.Scanner;
//Exceptions handling between methods just for cleaner code.
public class ThrowsExceptionHandling{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            getMarks(input);
            
        }
        catch(InvalidMarksException e){
            System.out.print(e.getMessage());
        }

    }

    public static void getMarks(Scanner input)
        throws InvalidMarksException{
            System.out.print("Enter marks: ");
            int marks = input.nextInt();
            validateMarks(marks);
            System.out.print("Marks entered are: " + marks);
        }

    public static void validateMarks(int marks)
        throws InvalidMarksException{
            if(marks < 0 || marks > 100){
                throw new InvalidMarksException("Marks must be between 0 and 100");
            }
        }
    
}