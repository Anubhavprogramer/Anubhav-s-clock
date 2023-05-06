import java.util.*;
import java.text.*;

public class Sampletime {
    Calendar calendar;
    SimpleDateFormat tf;
    SimpleDateFormat df;
    SimpleDateFormat daf;
    String time;
    String date;
    String day;

    Sampletime()
    {
        tf=new SimpleDateFormat("hh:mm:ss:a");
        df=new SimpleDateFormat("MMMMM,dd,yyyy");
        daf=new SimpleDateFormat("EEEE");

        time=tf.format(calendar.getInstance().getTime());
        date=df.format(calendar.getInstance().getTime());
        day=daf.format(calendar.getInstance().getTime());

        System.err.println(time+" "+date+" "+day);
    }
    public static void main(String[] args) {
        Sampletime obj =new Sampletime();
    }
}
