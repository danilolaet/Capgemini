package Package;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConversãoDatas {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data formatada: " + sdf.format(data));

        System.out.println("Data convertida: "+ sdf.parse("02/09/1970"));
    }
}
