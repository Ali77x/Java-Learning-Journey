import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Random;

public class Exercise7{
    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(3);
        Random random = new Random();

        for(int i = 1; i <= 20; i++){
            final int taskNumber = i;
            executor.execute(() -> {
                try {
                    System.out.printf("Task %d Started! running on %s\n", taskNumber, Thread.currentThread().getName());
                    Thread.sleep(random.nextInt(500, 3001));
                    System.out.printf("Task %d Completed!\n", taskNumber);

                    
                } catch (InterruptedException e) {
                    System.out.println("thread Interrupted!");
                }
            });

        }
        executor.shutdown();
    }
}
