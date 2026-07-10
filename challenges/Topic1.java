import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Topic1{
    public static void main(String[] args){
        
        CompletableFuture<String> future;

        future = CompletableFuture.supplyAsync( () -> {
            try{
                Thread.sleep(2000);

            }catch(InterruptedException e){
                System.out.println("Thread was Interrupted!");
            }

            return "Hello from CompletableFuture";
        });

        System.out.println("Main Thread Continues");

        try{
            System.out.println(future.get());
        }catch(InterruptedException | ExecutionException e){
            System.out.println("Error while executing!");
        }


    }
}