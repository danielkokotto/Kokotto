import java.util.Vector;

public class WeltWetterAnzeige
{
  private IWetter ortA;
  private IWetter ortB;
  
  WeltWetterAnzeige(IWetter ortA, IWetter ortB)
  {
    this.ortA = ortA;
    this.ortB = ortB;
  }

  // Diese Methode nicht verändern
  void print()
  {
    System.out.println("1. Ort:                            " + this.ortA.getOrt());
    System.out.println("Temperatur in Grad Celsius 1. Ort: " + this.ortA.getTemperatureCelsius());
    
    System.out.println("2. Ort:                            " + this.ortB.getOrt());
    System.out.println("Temperatur in Grad Celsius 2. Ort: " + this.ortB.getTemperatureCelsius());
  }
  
}
