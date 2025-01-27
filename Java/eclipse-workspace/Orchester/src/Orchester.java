
public class Orchester 
{
  private Geige geige;
  private Trompete trompete;
  private Pauke pauke;
  
  public Orchester()
  {
    this.geige = new Geige();
    this.trompete = new Trompete();
    this.pauke = new Pauke();
  }
  
  public void spiele(int numTakte)
  {
    for (int i = 0; i < numTakte; ++i)
    {
      this.pauke.schlage();
      this.geige.streiche();
      this.trompete.blase();
      System.out.println("--");
    }
  }

}
