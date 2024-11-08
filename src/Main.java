import java.time.*;


public class Main {
    public static void main(String[] args) {
        //Task1
        LocalDate date = LocalDate.of( 2024, Month.JANUARY, 2);
        System.out.println(date);
        //Task2
        LocalTime time = LocalTime.of( 13,20);
        System.out.println(time);
        //Task3
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        System.out.println(dateTime);
        //Task4
        ZonedDateTime zonedDateTime1 = dateTime.atZone(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime1);
        //Task5
        LocalDateTime dateTime2 = dateTime
                .plusMinutes(1)
                .plusHours(1)
                .plusDays(1)
                .plusMonths(1)
                .plusYears(1);
        System.out.println(dateTime2);

    }
}
