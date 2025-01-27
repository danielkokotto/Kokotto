public class EuAdapter implements IWetter
{
	private EuMessstation station;
	public EuAdapter(EuMessstation station) 
	{
		this.station = station;
	}
	
	public String getOrt() 
	{
		return station.getOrt();
	}
	
	public double getTemperatureCelsius() 
	{
		return (station.getTempKelvin() - 273.15);
	}
}
