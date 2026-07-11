import java.util.Random;
import java.util.concurrent.Callable;
class AssignmentTask implements Callable<Integer>{
    final private int studentId;
    final private int studentNumber;
    Random random = new Random();

    public AssignmentTask(int studentId, int studentNumber){
        this.studentId = studentId;
        this.studentNumber = studentNumber;
    }

    @Override
    public Integer call() {
        System.out.println("Student " + studentNumber + " of ID: " + studentId + ", assignment being marked by " + Thread.currentThread().getName());
            try{
                Thread.sleep(random.nextInt(1000, 3001));
            }catch(InterruptedException e){
                System.out.println("Thread Interrupted!");
            }
        
        return random.nextInt(40, 101);
    }


}