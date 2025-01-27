
public class Test
{
  public static void main(String[] args)
  {
    EuMessstation eu1 = new EuMessstation("Freising");
    
    UsWeatherStation us1 = new UsWeatherStation("New York");
    
    EuAdapter euAdapter = new EuAdapter(eu1);
    UsAdapter usAdapter = new UsAdapter(us1);

    WeltWetterAnzeige wetterAnzeige = new WeltWetterAnzeige(euAdapter, usAdapter);
    
    // Den Code ab hier nicht verändern
    eu1.setTemp(0);
    us1.setTempFahrenheit(32);
    wetterAnzeige.print();
    
    eu1.setTemp(20);
    us1.setTempFahrenheit(68);
    wetterAnzeige.print();
  }
}
