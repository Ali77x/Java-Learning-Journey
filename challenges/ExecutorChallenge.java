import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorChallenge{
    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for(int i = 1; i <= 4; i++){
            executor.execute(new Run(i));
        }

        executor.shutdown();

    }
}