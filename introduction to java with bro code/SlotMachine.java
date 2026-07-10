import java.util.Random;
import java.util.Scanner;
public class SlotMachine{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;

        System.out.println("*******************************\nWelcome to Java Slots.\nSymbols: P O I T Z\n*******************************");
        while(balance > 0){
            System.out.println("Current Balance: K" + balance);
            System.out.print("Place your bet amount: ");
            bet = input.nextInt();
            input.nextLine();

            if(bet > balance){
                System.out.println("Insufficient Funds");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0");
                continue;
            }else{
                balance -= bet;
            }

            System.out.println("Spinning...........");
            row = spinRow(random);
            printRow(row);
            payout = getPayout(row, bet);
            if(payout > 0){
                System.out.println("you won K" + payout);
                balance += payout;
            }else{
                System.out.println("Sorry you lost this round.");
            }
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = input.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }

        System.out.println("Game Over!, Your balance is: " + balance);

        input.close();

    }
    static String[] spinRow(Random random){

        String[] symbols ={"P", "O", "I", "T", "Z"};
        String[] row = new String[3];

        random = new Random();
        
        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String row[]){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "P" -> bet * 3;
                case "O" -> bet * 4;
                case "I" -> bet * 5;
                case "T" -> bet * 10;
                case "Z" -> bet * 20;
                default -> 0;
            };
        }else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "P" -> bet * 2;
                case "O" -> bet * 3;
                case "I" -> bet * 4;
                case "T" -> bet * 5;
                case "Z" -> bet * 10;
                default -> 0;
            };
        }else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "P" -> bet * 2;
                case "O" -> bet * 3;
                case "I" -> bet * 4;
                case "T" -> bet * 5;
                case "Z" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}