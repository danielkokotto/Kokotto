import java.util.Calendar;

public class Clock
{
  private Calendar calendar;
  
  
  Clock()
  {
    this.calendar = Calendar.getInstance();
  }
  
  
  public String getTime()
  {
    
    int minutes = this.calendar.get(Calendar.MINUTE);
    String minutesString = this.getDoubleDigitString(minutes);
    int hours = this.calendar.get(Calendar.HOUR_OF_DAY);
    String hoursString = this.getDoubleDigitString(hours);
    int seconds = this.calendar.get(Calendar.SECOND);
    String secondsString = this.getDoubleDigitString(seconds);
    String result = hoursString + ":" + minutesString + ":" + secondsString; 
    return result;
  }
  

  private String getDoubleDigitString(int number)
  {
    String result = Integer.toString(number);
    if (number < 10)
    {
      result = "0" + result; 
    }
    return result;
  }
}
