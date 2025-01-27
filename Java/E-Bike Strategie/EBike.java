
public class EBike
{
	public EBike() {}
	
	public double geschwindigkeit = 0;
	public boolean inEuropa = false;
	public boolean inUSA= false;	
	
	public void setGeschwindigkeit(double fahrerWunschKmH)
	{
		if (this.inEuropa)
		{
			this.geschwindigkeit = this.begrenzeEU(fahrerWunschKmH);
		}
		else if (this.inUSA)
		{
			this.geschwindigkeit = this.begrenzeUS(fahrerWunschKmH);
		} 
	}

	private double begrenzeEU(double wunschKmH)
	{
		return Math.min(wunschKmH, 25);
	}
	
	private double begrenzeUS(double wunschKmH)
	{
	  return Math.min(wunschKmH, 32.2);
	}
}
