import java.util.Random;
import java.util.Scanner;

public class Aviator{
    public static void main(String[] args)throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int destination;
        int randomStop;
        double bet;
        double balance = 100;
        int stop;
        String playAgain = "";

        System.out.println("******************************\nWelcome to car Aviator.\n*************************");

        do{

            System.out.println("Balance = " + balance);

        System.out.print("Enter requied Destination between 0 and 100 miles: ");
        destination = scanner.nextInt();

        if(destination < 0 || destination > 100){
            System.out.println("Destination must be between 0 and 100.");
            continue;
        }

        System.out.print("Place Bet: ");
        bet = scanner.nextDouble();

        if(bet < 0){
            System.out.print("Bet Must be grater than zero.");
            continue;
        }else if(bet > balance){
            System.out.print("Bet cannot exceed balance.");
            continue;
        }

        balance = 
        randomStop = random.nextInt(0, 100);
        stop = randomStop;
        

        for(int i = 0; i <= randomStop; i++){
            displayCar(stop);
            Thread.sleep(500);
            stop--;
        }

        if(destination <= randomStop){
            System.out.println("You have won!");
            balance = bet * destination;
        }

        System.out.print("Would you like to play again? (y/n): ");
        playAgain = scanner.nextLine().toLowerCase();
    }while(!playAgain.equals("n"));

    }

    static void displayCar(int number){
        String car = """
                     _______
                 ___/         `___
                |  __       __     \
                |_|  |_____|  |_____|

                """;
        String damagedCar = """      
                            _______    _
                        ___/         `|W|
                       |  __       __ |A|
                       |_|  |_____|   |L|
                                       L
                """;

                if(number > 0){
                    System.out.printf("\r " +car);
                }else{
                    System.out.print("\r " + damagedCar);
                }
    }

    

}