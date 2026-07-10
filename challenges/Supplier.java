import java.util.Queue;

class Supplier implements Runnable{
    private final Queue<String> queue;
    private final int maxQueueSize;

    public Supplier(Queue<String> queue, int maxQueueSize){
        this.queue = queue;
        this.maxQueueSize = maxQueueSize;
    }

    @Override
    public void run(){
        try{
            for(int i = 0; i < 10; i++){
                synchronized(queue){
                    while(queue.size() == maxQueueSize){
                        queue.wait();
                    }
                    queue.add("item" + i);
                    System.out.println("Item" + i + " produced.");
                    queue.notifyAll();
                }
                Thread.sleep(700);
            }
        }catch(InterruptedException e){
            System.out.println("Thread was Interrupted!");
        }
    }
}