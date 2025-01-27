
public class SpeedometerToTachometerObjectAdapter implements ISiTachometer{
	private final Speedometer speedometer;

	private SpeedometerToTachometerObjectAdapter(Speedometer speedometer) {
		this.speedometer = speedometer;
	}
	
	@Override
	public void messe(double km, double stunden) {
		double drivenMiles = km / 1.609;
		double minutes = stunden * 60;
		
		speedometer.measure(drivenMiles, minutes);
	}

	@Override
	public double getDurchschnittsgeschwindigkeitKmH() {
		var averageSpeedInMpH = speedometer.getAverageSpeedMpH();
		
		return averageSpeedInMpH * 1.609;
	}
	
	public static SpeedometerToTachometerObjectAdapter create(Speedometer speedometer) {
		return new SpeedometerToTachometerObjectAdapter(speedometer);
	}
}