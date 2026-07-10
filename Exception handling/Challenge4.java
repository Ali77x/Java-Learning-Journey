import java.util.Scanner;
public class Challenge4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter Marks: ");
            int Marks = input.nextInt();

            if(Marks < 0 || Marks > 100){
                throw new InvalidMarksException("Invalid marks entered.");
            }

            System.out.println("Marks entered are: " + Marks);

        }
        catch(InvalidMarksException e){
            System.out.print(e.getMessage());
        }

        input.close();
        
    }
}