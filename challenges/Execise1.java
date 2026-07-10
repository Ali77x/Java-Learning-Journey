import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Execise1{
    public static void main(String [] args){
        
        ExecutorService executor = Executors.newFixedThreadPool(3);


        for(int i = 1; i <= 5; i++){
            executor.execute(new Run1(i));
        }

        executor.shutdown();
    }
}