
public class Test 
{
	public static void main(String[] args) 
	{
		// Box Laufrad
		Artikel felge = new Artikel("Felge", 0.6);
		Artikel speichen = new Artikel("Speichen", 0.3);
		Box boxRad = new Box("Box Rad");
		boxRad.inhalt.add(felge);
		boxRad.inhalt.add(speichen);
		System.out.println("boxRad.getGewichtKg() " + boxRad.getGewichtKg());

		Artikel mantel = new Artikel("Mantel", 0.3);
		Artikel schlauch = new Artikel("Schlauch", 0.1);
		Box boxBereifung = new Box("Box Bereifung");
		boxBereifung.inhalt.add(mantel);
		boxBereifung.inhalt.add(schlauch);
		System.out.println("boxBereifung.getGewichtKg() " + boxBereifung.getGewichtKg());
		
		Box boxLaufrad = new Box("Box Laufrad");
		boxLaufrad.inhalt.add(boxRad);
		boxLaufrad.inhalt.add(boxBereifung);
		System.out.println("boxLaufrad.getGewichtKg() " + boxLaufrad.getGewichtKg());

		
		// Box Beleuchtung 
		Artikel vorderlicht = new Artikel("Vorderlicht", 0.6);
		Artikel ruecklicht = new Artikel("Ruecklicht", 0.3);
		Box boxLampen = new Box("Box Lampen");
		boxLampen.inhalt.add(vorderlicht);
		boxLampen.inhalt.add(ruecklicht);
    System.out.println("boxLampen.getGewichtKg() " + boxLampen.getGewichtKg());
		
		Artikel batterien = new Artikel("Batterien 6x", 0.2);
		
		Box boxBeleuchtung = new Box("Box Beleuchtung");
		boxBeleuchtung.inhalt.add(boxLampen);
		boxBeleuchtung.inhalt.add(batterien);
		System.out.println("boxBeleuchtung.getGewichtKg() " + boxBeleuchtung.getGewichtKg());
		
	}
}
