package warenwirtschaft;

public class Kinderfahrrad extends Produkt
{
	private String klingelfarbe;
	public String klingelAuswaehlen(String klingelfarbe);
	
//Getter/Setter	
	public String getFarbe()
	{
		return klingelfarbe;
	}
	public String setFarbe(String klingelfarbe)
	{
		this.klingelfarbe = klingelfarbe;
	}
}