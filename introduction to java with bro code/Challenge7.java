public class Challenge7{
    public static void main(String[]  args){
        

        Runnable task = () -> { 
            try{

                System.out.println("Task started.");
                Thread.sleep(2000);
                System.out.println("Task Completed.");

            }catch(InterruptedException e){
                System.out.println("Interrupted Thread.");
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        try{
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
            thread3.start();
            thread3.join();
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted!");
        }

    }
}