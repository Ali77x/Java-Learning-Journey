import java.util.Random;
import java.util.Scanner;
public class Dice{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of dice rowed: ");
        int numOfDice = input.nextInt();
        int diceNumber;
        int count = 0;
        int[] numbers = new int[numOfDice];

        do{
            diceNumber = random.nextInt(1, 7);
            dice(diceNumber);
            numOfDice --;
            numbers[count] = diceNumber;
            count++;
            
        }while(numOfDice > 0);

        System.out.print("=====================\nNumbers rolled: ");
        for(Integer die: numbers){
            System.out.print(die + " ");
        }

        input.close();
    }

    public static void dice(int num){
        String dice1 = """
                 -------
                |       |
                |   0   |
                |       |
                 -------
                """;

String dice2 = """
                 -------
                | 0     |
                |       |
                |     0 |
                 -------
                """;

String dice3 = """
                 -------
                | 0     |
                |   0   |
                |     0 |
                 -------
                """;

String dice4 = """
                 -------
                | 0   0 |
                |       |
                | 0   0 |
                 -------
                """;

String dice5 = """
                 -------
                | 0   0 |
                |   0   |
                | 0   0 |
                 -------
                """;

String dice6 = """
                 -------
                | 0 0 0 |
                |       |
                | 0 0 0 |
                 -------
                """;


        switch(num){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }

                
    }
}