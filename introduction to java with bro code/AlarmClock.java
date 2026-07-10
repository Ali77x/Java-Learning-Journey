import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;


public class AlarmClock{
    public static void main(String[] args){

        //Java Alarm Clock

        Scanner input = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime alarmTime = null;

        String filePath = "C:\\Users\\Muchimba Alick\\Desktop\\2Face - J. Cole.wav";

        while(alarmTime == null){

            try{

                System.out.print("Enter an alarm time (HH:MM:SS):  ");
                String alarm = input.nextLine();
                alarmTime = LocalTime.parse(alarm, formatter);
                System.out.println("Alarm set for: "  + alarm);
                

            }catch(Exception e){
                System.out.println("Something went wrong. \nEnsure that you entered valid format.");
            }

        }


        Alarm_Clock alarmClock = new Alarm_Clock(alarmTime, filePath, input);

        Thread alarmThread = new Thread(alarmClock);

        alarmThread.start();

        
        
    }
}