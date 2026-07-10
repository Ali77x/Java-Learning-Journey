import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Time{
    public static void main(String[] args){

        // //getting a custom date time instead of the time right now.
        // LocalDate date = LocalDate.of(2024, 12, 15);

        // System.out.println(date);

        // LocalTime time = LocalTime.of(15, 28);

        // System.out.println(time );

        // LocalDateTime dateTime = LocalDateTime.of(date, time); //or .of(2025, 12, 15, 15, 28, 0);

        // LocalDateTime newDateTime = LocalDateTime.of(2025, 01, 01, 00, 0, 0);

        // System.out.println(dateTime);


        // if(dateTime.isBefore(newDateTime)){
        //     System.out.println("Merry Christmas"); 
        // }else{
        //     System.out.println("It is a new Year");
        //}

        LocalTime timeRightNow = LocalTime.now();
        LocalTime customTime = LocalTime.of(07, 30);

        while(timeRightNow.isBefore(customTime)){
            System.out.println("It isnt time yet.");
        }

        System.out.println("it is time now.");




        // //custom format.
        
        // LocalDateTime dateTime = LocalDateTime.now();
        // DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // String newDateTime = dateTime.format(dateTimeFormat);

        // System.out.println(newDateTime);



        //the formats below are kind of unreadable so ^

        // LocalDate date = LocalDate.now();

        // System.out.println(date);

        // LocalTime time = LocalTime.now();

        // System.out.println(time);

        // LocalDateTime dateTime = LocalDateTime.now();

        // Instant instant = Instant.now();

        // System.out.println(instant);
        
        // System.out.println(dateTime);
        
    }
}