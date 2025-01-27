
public class SpeedometerToTachometerAdapter extends Speedometer implements ISiTachometer{

	@Override
	public void messe(double km, double stunden) {
		double drivenMiles = km / 1.609;
		double minutes = stunden * 60;
		
		this.measure(drivenMiles, minutes);
	}

	@Override
	public double getDurchschnittsgeschwindigkeitKmH() {
		var averageSpeedInMpH = getAverageSpeedMpH();
		
		return averageSpeedInMpH * 1.609;
	}
	
	public static SpeedometerToTachometerAdapter create() {
		return new SpeedometerToTachometerAdapter();
	}

}