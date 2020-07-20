package task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class GroupAndSortDates {
    public static Map<LocalDate, Set<LocalTime>> groupAndSortDates(List<LocalDateTime> dateTimeList) {

        Map<LocalDate, Set<LocalTime>> map =
                dateTimeList.stream()
                        .collect(Collectors.groupingBy(LocalDateTime::toLocalDate, TreeMap::new,
                                Collectors.mapping(LocalDateTime::toLocalTime,
                                        Collectors.toSet())));

        System.out.println(map);

        return map;
    }
}
