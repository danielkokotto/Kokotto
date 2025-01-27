
public class Test {

	public static void main(String[] args) 
	{
		Fahrrad rad = new Fahrrad();
		
	NiedrigreisAlarm np = new NiedrigreisAlarm(2000);
    HochPreisAlarm hp = new HochPreisAlarm(3000);
    
    rad.setPreis(2500);
    np.checkNiedrigPreis(rad.getPreis());
    hp.checkHochPreis(rad.getPreis());
    
    rad.setPreis(1500);
    np.checkNiedrigPreis(rad.getPreis());
    hp.checkHochPreis(rad.getPreis());
    
    rad.setPreis(3500);
    np.checkNiedrigPreis(rad.getPreis());
    hp.checkHochPreis(rad.getPreis());
	}
}
