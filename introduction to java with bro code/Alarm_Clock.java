import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Alarm_Clock implements Runnable{

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner input;

    Alarm_Clock(LocalTime alarmTime, String filePath, Scanner input){

        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.input = input;

    }

    @Override
    public void run(){
         
        while(LocalTime.now().isBefore(alarmTime)){
            try {

                LocalTime now = LocalTime.now();

                Thread.sleep(1000);

                System.out.printf("\rTime(HH:MM:SS): %02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());

            }catch(InterruptedException e){
                System.out.println("thread was interrupted.");
            }
        }

        playSound(this.filePath, this.input);
        
    }

    private void playSound(String filePath, Scanner input){

        File file = new File(filePath);
        

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            String response = "";

            while(!response.equals("Q")){
                clip.start();
                System.out.print("\nALARM! Press; \n'Q' to Stop Alarm. \n'S' to Snooze Alarm. \nEnter Choice: ");
                response = input.next().toUpperCase();

                switch(response){
                    case "Q" -> {clip.stop(); input.close();}
                    case "S" -> {
                        System.out.print("Snooze for How many minutes: ");
                        int minutes = input.nextInt();
                        clip.stop();
                        System.out.printf("Alarm Snoozed for %d mins.\n", minutes);
                        Thread.sleep(minutes * 60 * 1000);
                        clip.setMicrosecondPosition(0);
                    }
                    default -> System.out.println("Invalid Input.");
                }

            }

        }catch(UnsupportedAudioFileException e){
            System.out.println("Audio File not supported.");
        }catch(LineUnavailableException e){
            System.out.println("Audio file is corrupted.");
        }catch(IOException e){
            System.out.println("Error playing audio file.");
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted.");
        }

    }
}