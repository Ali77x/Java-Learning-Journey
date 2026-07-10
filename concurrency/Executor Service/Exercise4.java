import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise4{
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i = 1; i <= 6; i ++){
            final int taskNumber = i;
            executor.execute(() -> {
                try{
                    System.out.printf("Task %d Started and Running on %s!\n", taskNumber, Thread.currentThread().getName());
                    Thread.sleep(taskNumber * 1000);
                    System.out.printf("Task %d Completed!\n", taskNumber);
                }catch(InterruptedException e){
                    System.out.println("Thread was Interrupted!");
                }

            });   
        }
        executor.shutdown();
        
    }
}
//they all completed in task number order, maybe there is something wrong with my version?