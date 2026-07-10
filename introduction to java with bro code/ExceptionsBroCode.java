import java.time.format.DateTimeFormatter;

public class ExceptionsBroCode{
    public static void main(String[] args){



        //work with date and time using java.

        LocalTime date = LocalTime.now();





// import java.util.ArrayList;
// import java.util.Scanner;
// import java.io.FileNotFoundException;
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.util.Random;
// import java.io.IOException;        
//         ArrayList<Character> wordState = new ArrayList<>();
//         ArrayList<String> words = new ArrayList<>();
//         Scanner input = new Scanner(System.in);

//         String filePath = "C:\\Users\\Muchimba Alick\\Desktop\\test.txt";

//         // game of hangmen.
        
//         Random random = new Random();
        
//         try(BufferedReader reader = new BufferedReader(new FileReader(filePath)); ){

//             String line;

//             while((line = reader.readLine()) != null){
//                 words.add(line.trim());
//             }
            
//         }catch(FileNotFoundException e){
//             System.out.println("File not found!");
//         }catch(IOException e){
//             System.out.println("Error opening file.");
//         }

//         String word = words.get(random.nextInt(words.size()));

//         int wrongGuesses = 0;


//         for(int i = 0; i < word.length(); i++){
//             wordState.add('_');
//         }

//         System.out.println("***************************\nWelcome to Java HangMan!\n***************************");

//         while(wrongGuesses < 6){

//             System.out.print(getHangmanArt(wrongGuesses));

//             System.out.print("Word: ");
//             for(char c: wordState){
//                 System.out.printf("%s ", c);
//             }
//             System.out.println();

//             System.out.print("Guess A Letter: ");
//             char guess = input.next().toLowerCase().charAt(0);

//             if(word.indexOf(guess) >= 0){

//                 System.out.println("Correct Guess!\n");

//                 for(int i = 0; i < word.length(); i++){
//                     if(guess == word.charAt(i)){
//                         wordState.set(i, guess);
//                     }
//                 }

//                 if(!wordState.contains('_')){
//                     System.out.print(getHangmanArt(wrongGuesses) + "\nYou Win!" + "\nThe word was: " + word);
//                     break;
//                 }

//             }else{
//                 wrongGuesses++;
//                 System.out.println("Wrong Guess!\n");
            
//             }
            
//         }

//         if(wrongGuesses >= 6){
//             System.out.print(getHangmanArt(wrongGuesses)+ "\nGame Over!" + "\nThe word was: " + word);
//         }

//         input.close();
        











// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import javax.sound.sampled.AudioSystem;
// import javax.sound.sampled.Clip;
// import javax.sound.sampled.LineUnavailableException;
// import javax.sound.sampled.AudioInputStream;
// import javax.sound.sampled.UnsupportedAudioFileException;
// import java.util.Scanner;
//         //How to play Audio with java.

//         String filePath = "C:\\Users\\Muchimba Alick\\Desktop\\2Face - J. Cole.wav";
//         File file = new File(filePath);

//         try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); Scanner input = new Scanner(System.in);){

//             Clip clip = AudioSystem.getClip();
//             clip.open(audioStream);

//             String response = "";

//             while(!(response.equals("Q"))){
//                 System.out.print("P = Play\nS = Stop\nR = Reset\nQ = Quit\nEnter your choice: ");
//                 response = input.next().toUpperCase();

//                 switch(response){
//                     case "P" -> clip.start();
//                     case "S" -> clip.stop();
//                     case "R" -> clip.setMicrosecondPosition(0);
//                     case "Q" -> clip.close();
//                     default -> System.out.println("Invalid Choice");
//                 }
//             }

//         }
//         catch(FileNotFoundException e){
//             System.out.println("File Not Found.");
//         }
//         catch(LineUnavailableException e){
//             System.out.println("Unable to access audio resource.");
//         }
//         catch(UnsupportedAudioFileException e){
//             System.out.println("File not Supported.");
//         }
//         catch(IOException e){
//             System.out.println("Something went wrong.");
//         }finally{
//             System.out.println("Bye");
//         }





        //reading files, three popular options.
        //BufferedReader + FileReader -> Best for reading text files line-by-line.
        //FileInputStream -> Best for binary files(Images, audio files etc).
        //RandomAccessFile -> best for read/write specific portions of large files.

        // try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Muchimba Alick\\Desktop\\test.txt"))){

        //     String line;
        //     while((line = reader.readLine()) != null){

        //         System.out.println(line);
        //     }

        // }catch(FileNotFoundException e){
        //     System.out.println("File not found exception.");
        // }catch(IOException e){
        //     System.out.println("Error while reading to file.");
        //}








        //four types of writing files -> 
        // FileWriter -> better for small or medium sized text files. 
        // BufferedWriter -> better performance for large amounts of text.
        // PrintWriter -> Best for structed data, lke reports or logs.
        // FileOutputStream -> Best for binary files (e.g Images, audio files, etc).

        // try(FileWriter writer = new FileWriter("C:\\Users\\Muchimba Alick\\Desktop\\test.txt")){// automattically closing resources.

        //     writer.write("I Love video games.");

        //     System.out.println("File was written.");

        // }catch(FileNotFoundException e){
        //     System.out.println("File not found.");
        // }
        // catch(IOException e){
        //     System.out.println("Something went wrong.");
        // }









        // //Exceptions.

        // Scanner input = new Scanner(System.in);

        // try{    //try with resources: try(Scanner input = new Scanner(System.in); ){ statement} -> this is done to automatically close resources.
        //     System.out.print("Enter number: ");
        //     int i = input.nextInt();
        //     System.out.print("Enter another number: ");
        //     int j = input.nextInt();

        //     int quotient = i / j;

        //     System.out.println(quotient);

        // }
        // // catch(InputMismatchException e){ //import the exception.
        // //     System.out.println("That isnt a number.");
        // // }
        // // catch(ArithmeticException e){
        // //     System.out.println("You cannot Divide by zero.");
        // // }
        // catch(Exception e){ //handles all exceptions.
        //     System.out.println("Something went wrong.");
        // }finally{
        //     input.close();
        //     System.out.println("this always Executes.");
        // }




    }

    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
                    

                    """;
            case 1 -> """
                    O

                    """;
            case 2 -> """
                    O
                    |
                    """;
            case 3 -> """
                    O
                   /|
                    """;
            case 4 -> """
                    O
                   /|\\
                    """;
            case 5 -> """
                    O
                   /|\\
                   / 
                    """;
            case 6 -> """
                    O
                   /|\\
                   / \\
                    """;                   
            default -> """
                    
                    """;
        };
    }
}