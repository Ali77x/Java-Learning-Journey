class Run1 implements Runnable{

    private final int taskNumber;

    public Run1(int taskNumber){
        this.taskNumber = taskNumber;
    }
    @Override
    public void run(){
        try{
        System.out.println("Hello from task " + this.taskNumber);
        Thread.sleep(2000);
        System.out.println("Task " + this.taskNumber + " finished" );
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        
    }
}