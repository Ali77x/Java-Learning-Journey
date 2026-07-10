import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;


public class Challenge2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            FileWriter writer = new FileWriter("Student_Results.txt", true);
            getNameAndMarks(input, writer);
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }

        input.close();

    }

    public static void getNameAndMarks(Scanner input, FileWriter writer)
        throws IOException{
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter Marks: ");
            int marks = input.nextInt();
            writer.write(name + " - " + marks + "\n");
            writer.close();
            System.out.println("Name and marks successfully added to file.");
        }
}