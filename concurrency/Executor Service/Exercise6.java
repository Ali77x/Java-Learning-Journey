import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Exercise6{
    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i = 1; i <= 10; i++){
            final int user = i;
            executor.execute(() -> {
                try {
                    System.out.printf("User %d request started...\n", user);
                    Thread.sleep(2000);
                    System.out.printf("User %d request sent.\n", user);
                    
                } catch (InterruptedException e) {
                    System.out.println("Thread was Interrupted!");
                }
            });
        }

        executor.shutdown();

    }
}
//instead of creating a new thread for every task we just reuse a few threads for all jobs hence saving resources(memory to be exact).