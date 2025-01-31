import java.util.ArrayList;

public class Box implements IGegenstand
{
	public String name;
	public ArrayList<IGegenstand> inhalt;
	
	public Box(String name)
	{
		this.name = name;
		this.inhalt = new ArrayList<IGegenstand>(); 
	}
	
	public double getGewichtKg()
	{
	  double result = 0;
	  for (int i = 0; i < this.inhalt.size(); ++i)
	  {
	    result += this.inhalt.get(i).getGewichtKg();
	  }
	  return result;
	}

}
