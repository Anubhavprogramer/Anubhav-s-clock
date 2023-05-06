import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

class clock extends JFrame
{
    JLabel Time;
    JLabel Day;
    JLabel Date;
    Calendar calendar;
    SimpleDateFormat tf;
    SimpleDateFormat df;
    SimpleDateFormat daf;
    String time;
    String date;
    String day;
    clock()
    {
        Time = new JLabel();
        Day = new JLabel();
        Date = new JLabel();
        
        this.setSize(300,280);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Anubhav's clock");
        this.setLayout(new FlowLayout());
        this.setResizable(false);

        Time.setFont(new Font("Impact",Font.BOLD,50));
        Time.setForeground(Color.BLACK);
        // Time.setBackground(Color.red);
        Time.setOpaque(true);
        
        Date.setFont(new Font("Impact",Font.BOLD,50));
        Date.setForeground(Color.BLACK);
        // Date.setBackground(Color.red);
        Date.setOpaque(true);
        
        Day.setFont(new Font("Impact",Font.BOLD,50));
        Day.setForeground(Color.BLACK);
        // Day.setBackground(Color.red);
        Day.setOpaque(true);
        
        this.setVisible(true);
        this.add(Time);
        this.add(Date);
        this.add(Day);
        setTime();
    }
    public void setTime()
    {
        while(true)
        {
            tf=new SimpleDateFormat("hh:mm:ss:a");
            df=new SimpleDateFormat("MMMMM,dd,yyyy");
            daf=new SimpleDateFormat("EEEE");
            
            time=tf.format(calendar.getInstance().getTime());
            date=df.format(calendar.getInstance().getTime());
            day=daf.format(calendar.getInstance().getTime());
            Time.setText(time);
            Date.setText(date);
            Day.setText(day);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        clock obj = new clock();
    }
}