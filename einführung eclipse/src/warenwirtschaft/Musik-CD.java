package warenwirtschaft;

public class Musik-CD extends Produkt
{
	private String interpret = null;
	
	public Musik-CD()
	{
		
	}
	public Musik-CD(int artNr, String name, double nettopreis, String interpret)
	{
		this.artNr = artNr;
		this.name = name;
		this.nettopreis = nettopreis;
		this.interpret = interpret;
	}
	
//Getter/Setter	
	public String getInterpret()
	{
		return interpret;
	}
	public String setInterpret(String interpret)
	{
		this.interpret = interpret;
	}
}