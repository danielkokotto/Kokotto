
public class Fahrrad 
{
	private double preis;

	public Fahrrad()
	{
	  this.preis = 0;
	}

	public void setPreis(double preis)
	{
	  this.preis = preis;
	  System.out.println("Neuer Preis: " + this.preis);
	}
	
	public double getPreis()
  {
    return this.preis;
  }
}
