//independent tasks.
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Exercise5{
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new DownloadTask());
        executor.execute(new UploadTask());
        executor.execute(new EmailTask());

        executor.shutdown();

    }
}