import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;

public class Challenge3{
    public static void main(String[] args){
        
        Callable<Integer> task = () -> {
            int sum = 0;
            for(int i = 0; i <= 100; i++){
                sum += i;
            }
            return sum;
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        Future<Integer> future;

        future = executor.submit(task);
        Integer result;

        try{
            result = future.get();
            System.out.println("Result = " + result);
        }catch(ExecutionException | InterruptedException e){
            System.out.println("Error Executing Thread!");
        }

        executor.shutdown();
            
    }
}