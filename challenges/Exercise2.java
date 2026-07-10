import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Exercise2{
    public static void main(String[] args){
        

        ExecutorService executor = Executors.newFixedThreadPool(3);

        

        for(int i = 1; i <= 5; i++){
            int[] taskNumber = {i};
            executor.execute(new Run1(taskNumber[0]){
                @Override
                public void run(){
                    try{
                        System.out.println("Hello from task " + taskNumber[0]);
                        Thread.sleep(taskNumber[0] * 500);
                        System.out.println("Task " + taskNumber[0] + " completed!");
                        
                    }catch(InterruptedException e){
                        System.out.println("Thread was Interrupted!");
                    }

                }
            });
        }

        executor.shutdown();
    }
}