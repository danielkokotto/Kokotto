
public class HochPreisAlarm 
{
  double preisLimit;
	
  public HochPreisAlarm(double preisLimit)
  {
    this.preisLimit = preisLimit;
	}

  void checkHochPreis(double preis)
  {
    if (preis > this.preisLimit)
    {
      System.out.println("Hochpreisalarm " + this.preisLimit + " auf keinen Fall kaufen.");
    }
  }
}
