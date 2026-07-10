import java.util.Queue;
class Consumer implements Runnable{
    private final Queue<String> queue;

    public Consumer(Queue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        try{
            for(int i = 0; i < 10; i++){
                synchronized(queue){
                    while(queue.isEmpty()){
                        queue.wait();
                    }
                    String item = queue.remove();
                    System.out.println(item + " Processed");
                    queue.notifyAll();
                }
                Thread.sleep(500);
            }

        }catch(InterruptedException e){
            System.out.println("Thread Was Interrupted!");
        }
    }

}