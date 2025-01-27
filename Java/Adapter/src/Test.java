
public class Test
{

  public static void main(String[] args)
  {
    ISiTachometer tacho = new Tachometer();
    Fahrrad rad1 = new Fahrrad(1, tacho);
    rad1.fahre(20, 1);
    System.out.println("rad1 Durchschnittsgeschwindigkeit: " + 
        rad1.getSiTachometer().getDurchschnittsgeschwindigkeitKmH());
    
    var speedometer = new Speedometer();
    SpeedometerToTachometerAdapter speedometerToTachometerAdapter = SpeedometerToTachometerAdapter
    		.create();
    SpeedometerToTachometerObjectAdapter speedometerToTachometerObjectAdapter = SpeedometerToTachometerObjectAdapter
    		.create(speedometer);
    
    Fahrrad rad2 = new Fahrrad(2, speedometerToTachometerObjectAdapter);
    rad2.fahre(20, 1);
    System.out.println("rad2 Durchschnittsgeschwindigkeit: " + rad2.getSiTachometer().getDurchschnittsgeschwindigkeitKmH());
  }

}
