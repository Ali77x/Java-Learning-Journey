import java.util.ArrayList;
import java.util.Scanner;
public class Challenge1{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        convertToBinary(input, numbers);
        printInReverseOrder(numbers);

    }
    public static int getUserInput(Scanner input){
        System.out.print("Enter number: ");
        return input.nextInt();
    }
    public static void convertToBinary(Scanner input, ArrayList<Integer> numbers){
        int number = getUserInput(input);
        while(true){
            if(number == 1){
                numbers.add(1);
                break;
            }else if(number == 0){
                numbers.add(0);
                break;
            }

            if(number % 2 == 0){
                numbers.add(0);
            }else{
                numbers.add(1);
            }
            number /= 2;
        }
    }
    public static void printInReverseOrder(ArrayList<Integer> numbers){
        System.out.print("Binary number: ");
        for(int i = numbers.size() - 1; i >= 0; i--){
            System.out.print(numbers.get(i));
        }
    }
}