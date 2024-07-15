import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test11 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2024-05-23", DateTimeFormatter.ISO_DATE);
        System.out.println(date.format((DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    }
}
