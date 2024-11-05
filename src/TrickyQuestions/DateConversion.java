package TrickyQuestions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateConversion {
    public static void main(String[] args) {
        // Input date as a string
        String dateString = "2024-08-07";

        // Parse the string to a LocalDate
        LocalDate localDate = LocalDate.parse(dateString);
        System.out.println(localDate.atStartOfDay());
    }
}
