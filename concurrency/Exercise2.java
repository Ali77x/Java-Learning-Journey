import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class Exercise2{
    public static void main(String[] args){
        
        CompletableFuture<String> future; 
        future = CompletableFuture.supplyAsync(() -> {
            return "Java";
        })
        .thenApply(s -> s + " Concurrency")
        .thenApply(s -> s + " Mastered!");

        try{

            System.out.println(future.get());

        }catch (InterruptedException | ExecutionException e){
            System.out.println("Error While Executing!");
        }

    }
}