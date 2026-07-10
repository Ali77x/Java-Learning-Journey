import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Exercise4{
    public static void main(String[] args){
        
        int[] balance = {1000};
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable withdraw = () -> {
            try{
                for(int i = 0; i < 5; i++){
                    balance[0] -= 100;
                    System.out.println("Withdrew: " + 100);
                    Thread.sleep(1000);
                }
            }catch(InterruptedException e){
                System.out.println("Thread was Interrupted!");
            }
        };

        Runnable deposit = () -> {
            try{
                for(int i = 0; i < 5; i++){
                    balance[0] += 100;
                    System.out.println("Deposited: " + 100);
                    Thread.sleep(1000);
                }
            }catch(InterruptedException e){
                System.out.println("Thread was Interrupted!");
        }
        };

        executor.execute(withdraw);
        executor.execute(deposit);
        
        System.out.println("Balance: " + balance[0]);

    }
}