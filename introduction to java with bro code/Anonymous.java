
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Anonymous{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to count down from: ");
        int response = input.nextInt();


        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = response;
            @Override
            public void run(){
                System.out.println(count);
                count --;
                if(count < 0){
                    System.out.println("Happy New Year.");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);






        // //timer -> class that schedules tasks at a specific time or periodically useful for:
        // // sending notifications, scheduled updates, repetitive actions.

        // //timerTasks -> Represents the task that will be executed by the Timer you will extend the TimerTask class to 
        // //define your task . Create a subclass of timerTask and @Override run();

        // Timer timer = new Timer();
        // TimerTask task = new TimerTask(){

        //     int count = 3;

        //     @Override 
        //     public void run(){
        //         System.out.println("Hello!");
        //         count --;
        //         if(count <= 0){
        //             System.out.println("Task Complete!");
        //             timer.cancel();
        //         }
                
        //     }

        // };


        // timer.schedule(task, 0,3000);






        // //using Anonymous class -> a class that doesnt have a name, hence cannot be reused.
        // //used for one time use.

        // Dog dog = new Dog();    // instead of saying such now we use Anonymous classes for a special case.
        // dog.speak();

        // //now lets use Anonymous class for creating a special case class like Dog.
        // Dog dog1 = new Dog(){   //for custom behaviour.
        //     @Override
        //     void speak(){
        //         System.out.println("The dog goes *ruh roh*");
        //     }
        // };

        // dog1.speak();



        
    }
}