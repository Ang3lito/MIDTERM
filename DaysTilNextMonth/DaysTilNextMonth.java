import java.time.*;
public class DaysTilNextMonth {
   public static void main (String[] args) {
   
      LocalDate day = LocalDate.now();
      int month = day.getDayOfMonth();
      int year = day.getYear();
      String Mon = "October ";
      System.out.println( Mon + month + ", "+ year);
   }
}