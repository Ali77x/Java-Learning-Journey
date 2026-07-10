import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Execise2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        bankingFile(input);
        displayDetails();
    }
    public static void bankingFile(Scanner input){
        try{
            FileWriter writer = new FileWriter("Banking_File.txt", true);

            for(int i = 0; i < 3; i++){ //creating a simple file to hold three account details.
                System.out.print("\nEnter Account number: ");
                String accountNumber = input.nextLine();
                System.out.print("Enter Account Holder Name: ");
                String name = input.nextLine();
                System.out.print("Enter Balance: ");
                double balance = input.nextDouble();
                input.nextLine(); //clear the input buffer.
                writer.write(accountNumber + ", " + name + ", " + balance + "\n");
            }
            System.out.println("Successfully saved details to file.");
            writer.close();
        }catch(IOException e){
            System.out.println("Error occured while writing to file.");
        }
    }

    public static void displayDetails(){
        try{
            File file = new File("Banking_File.txt");
            Scanner reader = new Scanner(file);
            System.out.println("\nBank Details");
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] part = line.split(", ");
                System.out.println("Account Number: " + part[0] + "\nName: " + part[1] + "\nBalance: " + part[2] + "\n");
            }
            reader.close();

        }catch(FileNotFoundException e){
            System.out.println("File Not Found.");
        }
    }
}