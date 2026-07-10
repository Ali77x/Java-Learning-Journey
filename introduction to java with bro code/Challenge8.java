public class Challenge8{
    public static void main(String[] args){
        
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] threadSum = new int[4];

        Thread thread1 = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i < 4; i++){
                    threadSum[0] += numbers[i];
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run(){
                for(int i = 4; i < 8; i++){
                    threadSum[1] += numbers[i];
                }
            }
        };

        Thread thread3 = new Thread(){
            @Override
            public void run(){
                for(int i = 8; i < 12; i++){
                    threadSum[2] += numbers[i];
                }
            }
        };

        Thread thread4 =  new Thread(){
            @Override
            public void run(){
                for(int i = 12 ; i < 16; i++){
                    threadSum[3] += numbers[i];
                }
            }
        };

        try{
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread1.join();
            thread3.join();
            thread2.join();
            thread4.join();
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted.");
        }

        System.out.println(threadSum[0] + threadSum[1] + threadSum[2] + threadSum[3]);


    }
}