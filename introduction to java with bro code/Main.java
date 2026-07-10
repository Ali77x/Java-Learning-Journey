import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        


        

        input.close();





        // System.out.println("Welocome to the rock, paper Scissors Game. \nPress S for Scissors, R for Rock and P for Paper. \nIf you want to quit press Q");

        // char userInput;

        // String[] options = {"Scissors", "Rock", "Paper"}; 

        // do{
        //     int guess = random.nextInt(0, 3);
        //     System.out.print("Rock, Paper, Scissors: ");
        //     userInput = input.next().charAt(0);

        //     switch(userInput){
        //         case 'S' ->  {
        //                 if(options[guess].charAt(0) == 'R')
        //                     System.out.println("You have lost.");
        //                 else if(options[guess].charAt(0) == 'P')
        //                     System.out.println("You have won.");
        //                 else
        //                     System.out.println("it was a tie");
        //             }
        //         case 'R' -> {
        //                 if(options[guess].charAt(0) == 'P')
        //                     System.out.println("You have lost.");
        //                 else if(options[guess].charAt(0) == 'S')
        //                     System.out.println("You have won.");
        //                 else
        //                     System.out.println("it was a tie");                       
        //         }
        //         case 'P' -> {
        //                 if(options[guess].charAt(0) == 'S')
        //                     System.out.println("You have lost.");
        //                 else if(options[guess].charAt(0) == 'R')
        //                     System.out.println("You have won.");
        //                 else
        //                     System.out.println("it was a tie");                    
        //         }

        //     }
        // }while(userInput != 'Q');
            
    



      
        // //2D arrays in java programming language.
        // String[] fruit = {"apple", "Orange", "Banana"};
        // String[] vegetables = {"Potato", "Carrot", "Onion"};
        // String[] meats = {"Goat", "Pork", "Beef"};
        // //these are all 1D arrays.
        // //hence lets create an array of arrays.


        // String[][] groceries = {fruit, vegetables, meats};

        // groceries[0][0] = "Pineapple";

        // for(String[] foods: groceries){
        //     for(String food: foods){
        //         System.out.print(food + " ");
        //     }
        //     System.out.println();
        // }

        



        // //first declare the throws InterruptedException{ main method}
        // for(int i = 10; i >= 1; i--){
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }

        // System.out.println("Happy New Year!");




        // Random random = new Random();

        // int guess;
        // int userInput;

        // do{
        //     guess = random.nextInt(0, 6);
        //     System.out.print("Guess the number between 0 - 5: ");
        //     userInput = input.nextInt();

        // }while(userInput != guess);

        // System.out.println("Congradulations you have guessed the number.");



        // double num1, num2;
        // double results = 0.0;
        // char operator;
        // boolean validOperation = true;

        // System.out.print("Enter first number: ");
        // num1 = input.nextDouble();

        // System.out.print("Enter the operator (+, -, /, *, ^): ");
        // operator = input.next().charAt(0);

        // System.out.print("Enter the second number: ");
        // num2 = input.nextDouble();
        
        // switch(operator){
        //     case '+' -> results = num1 + num2;
        //     case '-' -> results = num1 - num2;
        //     case '*' -> results = num1 * num2;
        //     case '/' -> {
        //             if(num2 == 0){
        //                 System.out.println("You cannot devide by zero");
        //                 validOperation = false;
        //             }
        //             else{
        //                 results = num1 / num2;
        //             }
        //     }
        //     case '^' -> results = Math.pow(num1, num2);
        //     default -> {
        //         System.out.println("Operator Entered is invalid.");
        //         validOperation = false;
        //     }
        // }

        // if(validOperation)
        //     System.out.println("Results = " + results);




        // //using enhanced switches.
        // System.out.print("Enter Day: ");
        // String day = input.next();
        
        // switch(day){
        //     case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday.");
        //     case "Saturday", "Sunday" -> System.out.println("it is a weekend.");
        //     default -> System.out.println("That is not a day");
        // }




        // Scanner input = new Scanner(System.in);

        // double temp, newTemp;
        // String unit;

        // System.out.print("Enter the temperature: ");
        // temp = input.nextDouble();
        // System.out.print("if temperature entered is in celcius enter c else enter f: ");
        // unit = input.next().toUpperCase();
        
        // newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        // System.out.printf("%.1f %s", newTemp, unit);



        // //using the ternary operator (?) -> returns 1 of 2 values if the condition is true

        // int score = 100;
        // String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        // System.out.println(passOrFail);

        // int number = 4;

        // String evenOrOdd = ( number % 2 == 0) ? "EVEN" : "ODD";
        // System.out.println(evenOrOdd);

        // int time = 13;
        // String timeFormat = (time < 12) ? "AM" : "PM";
        // System.out.println(timeFormat);





        // //substring method -> a method used to extract a portion of a string. substring(Start, end).

        // String email;
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter your email: ");
        // email = input.nextLine();

        // String userName = email.substring(0, email.indexOf("@"));
        // String domain = email.substring(email.indexOf("@") + 1);

        // System.out.println(userName);
        // System.out.println(domain);




        
        // String name = "Jack Mutambo";
        // char letter = name.charAt(6);
        // int length = name.length();
        // int index = name.indexOf(" ");
        // int lastIndex = name.lastIndexOf("a");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("a", "o");

        // System.out.println(name.isEmpty());

        // if(name.contains("z")){
        //     System.out.println("Your name contains an a");
        // }else{
        //     System.out.println("Your name does not contain any a");
        // }




        // HashSet<Integer> ids = new HashSet<>();

        // do{
        //     int id = random.nextInt(1000, 10000);   // numbers of 4 digits.
        //     ids.add(id);
        // }while(ids.size() < 20);

        // ids.stream().forEach(id -> System.out.println(id));
 
        // //using the printf method as an alternative.

        // String name = "Samuel";
        // char firstLetter = 'S';
        // int age = 30;
        // double height = 60.5;
        // boolean isEmployed = true;

        // System.out.printf("Hello %s\n", name );
        // System.out.printf("Your Name starts with the letter %c\n", firstLetter);
        // System.out.printf("Your are %d years old.\n", age);
        // System.out.printf("You are %.1f centimeters tall\n", height);



        // calculating the hypotenuse of a triangle.
        // double a, o, h;
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter value of Adjacent: ");
        // a = input.nextDouble();
        // System.out.print("Enter value of Opposite: ");
        // o = input.nextDouble();

        // h = Math.sqrt(Math.pow(a, 2) + Math.pow(o, 2));
        // System.out.println("Hypotenuse = " + h);
        // input.close();



        // double results;
        // results = Math.pow(2, 6);
        // results = Math.abs(-5);
        // results = Math.sqrt(64);
        // results = Math.round(3.14);
        // results = Math.ceil(3.14);
        // results = Math.floor(3.99);
        // results = Math.min(5, 10);
        // results = Math.max(5, 10);
        // System.out.println(results);


        //generating random results.
        // Random random = new Random();

        // boolean isHeads = random.nextBoolean();
        // if(isHeads){
        //     System.out.println("Heads");
        // }
        // else{
        //     System.out.println("Tails");
        // }
        

    }
}