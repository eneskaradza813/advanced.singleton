package advanced.seven;

import java.time.LocalDate;
import java.time.Month;

public class SevenExecutor {

    public static void main(String[] args) {
        Book book1 = Book.of(0, "Fadil", "Stomatoloska praksa");
        Book book2 = Book.withoutISBN("Effective Java", "Josh Bloch", LocalDate.of(2010, Month.MARCH, 1));
        
    }
}
