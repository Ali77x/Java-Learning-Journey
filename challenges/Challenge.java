import java.util.LinkedList;
import java.util.Queue;

public class Challenge{
    public static void main(String[] args){

        Queue<String> queue = new LinkedList<>();
        int[] balance = {1000};

        Runnable deposit = () -> {
            try{
                for(int i = 0; i < 10; i++){
                    balance[0] += 100;
                    System.out.println("Deposited k" + 100 + ", Balance: " + balance[0]);
                    Thread.sleep(1000);
                }

            }catch(InterruptedException e){
                System.out.println("Thread Was Interrupted!");
            }
        };

        Runnable withdraw = () -> {
            try{
                for(int i = 0; i < 10; i++){
                    balance[0] -= 100;
                    System.out.println("Withdrew k" + 100 + ", Balance: " + balance[0]);
                    Thread.sleep(1000);

                }

            }catch(InterruptedException e){
                System.out.println("Thread was Interrupted!");
            }
        };

        Thread thread1 = new Thread(withdraw);
        Thread thread2 = new Thread(deposit);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();

        }catch(InterruptedException e){
            System.out.println("Thread was Interrupted!");
        }finally{
            System.out.println("Balance = " + balance[0]);
        }


        
    }
}