public class UsAdapter implements IWetter
{
	private UsWeatherStation usStation;
	public UsAdapter(UsWeatherStation station) 
	{
		this.usStation = station;
	}
	
	public String getOrt() 
	{
		return usStation.getLocation();
	}
	
	public double getTemperatureCelsius() 
	{
		double fahrenheit = usStation.getTempFahrenheit();
		return(fahrenheit - 32)/1.8;
	}
}
