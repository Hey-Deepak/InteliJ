package DC;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DC54 {
    public static void main(String[] args) {
        LocalDateTime myTimeDate = LocalDateTime.now();
        System.out.println("Time and Date :- " + myTimeDate);
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        System.out.println("Now time is " + myTimeDate.format(myFormat));
    }
}
