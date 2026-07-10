import java.util.Scanner;
public class DigitInput{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 6 digit number: ");
        int num = input.nextInt();
        int A;
        int sum = 0;

        if(num > 999999 || num < 100000){
            System.out.println("Number entered is invaid.");
        } else{
            for(int i = 0; i < 6; i++){
                A = num % 10;
                num = (num - A) / 10;
                if(A % 2 == 0){
                    sum += A;
                }
            }

            System.out.println("Sum = " + sum);
        }
        input.close();
    }
}