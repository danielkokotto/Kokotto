public class Fahrrad 
{
	private int id;
	private ISiTachometer siTachometer;

	public Fahrrad(int id, ISiTachometer siTachometer)
	{
		this.id = id;
		this.siTachometer = siTachometer;
	}
	
	public void fahre(double km, double stunden)
	{
		this.siTachometer.messe(km, stunden);
	}
	
	public ISiTachometer getSiTachometer()
	{
	  return this.siTachometer;
	}
}
