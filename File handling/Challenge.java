import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Challenge{
    public static void main(String[] args){
        
        try{
            File file = new File("Student_Results.txt");
            Scanner reader = new Scanner(file);
            fileReader(reader);
            reader.close();

        }catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
    public static void fileReader(Scanner reader)
        throws IOException{
            double sum = 0;
            double count = 0;
            double average;
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] part = line.split(" - ");
                
                sum += Integer.parseInt(part[1]);
                count++;
            }
        average = sum / count;
        System.out.print("Average marks = " + average);
    }
}