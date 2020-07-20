import task1.GroupAndSortDates;
import task2.DistanceBetweenDates;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("_____________________________");
        System.out.println("Map of dates with times sorted by date");
        List<LocalDateTime> dateTimeList = Arrays.asList(
                LocalDateTime.of(2001, 3, 19, 8, 30),
                LocalDateTime.of(2001, 3, 21, 8, 30 ),
                LocalDateTime.of(1996, 6, 26, 10, 15),
                LocalDateTime.of(2023, 1, 2, 17, 23));
        GroupAndSortDates.groupAndSortDates(dateTimeList);

        System.out.println("\nTask 2");
        System.out.println("_____________________________");

        long seconds = DistanceBetweenDates.distanceBetweenDates(dateTimeList).getSeconds();
        long resultInDays = seconds/60/60/24;

        System.out.println("Duration between minDate and maxDate: " + resultInDays + " days.");
    }
}
