import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class Concurrency{
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Integer> future;

        Callable<Integer> task = () -> {
            int sum = 0;

            for(int i = 1; i <= 10; i++){
                sum += i;
            }
            return sum;
        };

        

        future = executor.submit(task);

        try{
            System.out.println(future.get());
        }catch(InterruptedException | ExecutionException e){
            System.out.println("Error getting result!");
        }
    }
}