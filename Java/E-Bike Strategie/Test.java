
public class Test 
{
	public static void main(String[] args) 
	{
		EBike rad = new EBike();
		//rad.inEuropa = true;
		//rad.inUSA = true;
		
		double fahrerWunschGeschwindigkeit = 10;
		rad.setGeschwindigkeit(fahrerWunschGeschwindigkeit);
		System.out.println("Tatsaechliche Geschwindigkeit: " 
				+ rad.geschwindigkeit);
		
		fahrerWunschGeschwindigkeit = 30;
		rad.setGeschwindigkeit(fahrerWunschGeschwindigkeit);
		System.out.println("Tatsaechliche Geschwindigkeit: " 
				+ rad.geschwindigkeit);	
	}
}
