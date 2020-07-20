package task2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistanceBetweenDates {
    public static Duration distanceBetweenDates(List<LocalDateTime> dateTimeList){
        dateTimeList.stream().sorted().collect(Collectors.toList());

        LocalDateTime maxDate = dateTimeList.stream()
                .max( Comparator.comparing( LocalDateTime::toLocalDate))
                .get();

        LocalDateTime minDate = dateTimeList.stream()
                .min( Comparator.comparing( LocalDateTime::toLocalDate))
                .get();

        System.out.println("maxDate = " + maxDate);
        System.out.println("minDate = " + minDate);

        return Duration.between(minDate, maxDate);
    }
}
