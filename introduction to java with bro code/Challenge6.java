public class Challenge6{
    public static void main(String[] args){

        Account account = new Account();

        Thread thread1 = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i < 1000; i ++){
                    account.deposit(100);
                }
            }
        }; 

        Thread thread2 = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i < 1000; i++){
                    account.withdraw(100);
                }
            }
        };

        thread1.start();
        thread2.start();
        
        try{

            thread1.join();
            thread2.join();

        }catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }finally{
            System.out.println("Balance = " + account.getBalance());
        }
    }
}