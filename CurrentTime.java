import java.text.SimpleDateFormat;
import java.util.Date;
public class CurrentTime {
 public static void main(String[] args){

    //Instance for Date and Time in 24 hours format
    Date currentDate = new Date();
    System.out.println(currentDate);

    //Time Format 12 hours format
    SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
    System.out.println(timeFormat.format(currentDate));

    //Days of the week of the current Month and Year 
    SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("EEEE");
    System.out.println(dayOfTheWeek.format(currentDate));

    //Clock format of the current time
    SimpleDateFormat clockFormat = new SimpleDateFormat("h:m:a");
    System.out.println(clockFormat.format(currentDate));
 }   
}
