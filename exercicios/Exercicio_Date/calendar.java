package exercicios.Exercicio_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class calendar {
 public static void main(String[] args) throws ParseException {
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM//yyyy HH:mm:ss");

     Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

     System.out.println(sdf.format(d));

     Calendar cal = Calendar.getInstance();
     cal.setTime(d);
     cal.add(Calendar.HOUR_OF_DAY, 4);
     int minutes = cal.get(Calendar.MINUTE);
     int month = 1 + cal.get(Calendar.MONTH); //1 foi adicionado pois os meses começam a ser contados do 0 ao invés do 1
     d = cal.getTime();
     System.out.println(sdf.format(d));
     System.out.println("Minutes: " + minutes);
     System.out.println("Month: " + month);

 }   
}
