import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Exercise3{
    public static void main(String[] args){
        ExecutorService executor;
//this is the first version.
        executor = Executors.newSingleThreadExecutor();
        for(int i = 1; i <= 6; i ++){
            final int taskNumber = i;
            executor.execute(() -> {
                try {
                    System.out.println("Task " + taskNumber + " Started!");
                    Thread.sleep(1000);
                    System.out.println("Task " + taskNumber + " Completed!");
                } catch (InterruptedException e) {
                    System.out.println("Thread was Interrupted!");
                }
            });
        }
        executor.shutdown();

//this is the second version
        // executor = Executors.newFixedThreadPool(2);
        // for(int i = 1; i <= 6; i ++){
        //     final int taskNumber = i;
        //     executor.execute(() -> {
        //         try {
        //             System.out.println("Task " + taskNumber + " Started and running on " + Thread.currentThread().getName());
        //             Thread.sleep(1000);
        //             System.out.println("Task " + taskNumber + " Completed!");
                    
        //         } catch (InterruptedException e) {
        //             System.out.println("Thread was Interrupted!");
        //         }
        //     }); 
        // }
        // executor.shutdown();

// this is the last version
        // executor = Executors.newFixedThreadPool(4);
        // for(int i = 1; i <= 6; i++){
        //     final int taskNumber = i;
        //     executor.execute(() -> {
        //         try {
        //             System.out.printf("Task %d Started and running on %s\n", taskNumber, Thread.currentThread().getName());
        //             Thread.sleep(1000);
        //             System.out.printf("Task %d Completed\n", taskNumber);
        //         } catch (InterruptedException e) {
        //             System.out.println("Thread was Interrupted");
        //         }
        //     });
        // }
        // executor.shutdown();
    }
}