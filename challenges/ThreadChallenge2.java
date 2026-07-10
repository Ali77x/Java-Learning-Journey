public class ThreadChallenge2{
    public static void main(String[] args){
    
        Thread download1 = new Thread(new Run(1));
        Thread download2 = new Thread(new Run(2));
        Thread download3 = new Thread(new Run(3));
        Thread download4 = new Thread(new Run(4));

        download1.start();
        download2.start();
        download3.start();
        download4.start();

        try {
            download1.join();
            download2.join();
            download3.join();
            download4.join();
            
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted!");
        }
    }

}