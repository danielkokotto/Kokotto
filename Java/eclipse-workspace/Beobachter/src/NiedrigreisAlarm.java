
public class NiedrigreisAlarm 
{
  double preisLimit;
	
  public NiedrigreisAlarm(double preisLimit)
  {
    this.preisLimit = preisLimit;
 	}

  void checkNiedrigPreis(double preis)
  {
    if (preis <= this.preisLimit)
    {
      System.out.println("Niedrigpreisalarm " + this.preisLimit + ": jetzt unbedingt kaufen.");
    }
  }
}
