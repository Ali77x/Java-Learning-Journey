import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Exercise2{
    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for(int i = 1; i <= 6; i++){
            final int taskNumber = i;
            executor.execute(() ->{
                try{
                    System.out.printf("Task %d started and running on %s\n", taskNumber, Thread.currentThread().getName());
                    Thread.sleep(1000);
                    System.out.printf("Task %d Completed!\n", taskNumber);
                }catch(InterruptedException e){
                    System.out.println("thread was Interrupted!");
                }
            });
        }

        executor.shutdown();
        
    }
}