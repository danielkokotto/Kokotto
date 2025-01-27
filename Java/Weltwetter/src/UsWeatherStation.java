/**
 * This file is protected by US and international copyright laws
 * Any change to it will be prosecuted by legal means.
 */

public class UsWeatherStation
{
  private double fahrenheit;
  String location;
  
  UsWeatherStation(String location)
  {
    this.location = location;
    this.fahrenheit = 0;
  }
  
  void setTempFahrenheit(double fahrenheit)
  {
    this.fahrenheit = fahrenheit;
  }
  
  double getTempFahrenheit()
  {
    return this.fahrenheit;
  }
  
  String getLocation()
  {
    return this.location;
  }
}
