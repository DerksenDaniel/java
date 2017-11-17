package warenwirtschaft;

public class Produkt 
{
	private abstract int artNr = 0;
	private String name = null;
	private double nettopreis = 0;

//Getter/Setter
//Artikel-Nr
	public int getArtNr
	{
		return artNr;
	}
	public int setArtNr
	{
		this.artNr = artNr;
	}
//Name	
	public abstract String getName()
	{
		return name;
	}	
	public abstract void setName(String name)
	{
		this.name = name;
	}
//Nettopreis	
	public abstract double getNetto()
	{
		return nettopreis;
	}
	public abstract void setNetto(double nettopreis)
	{
		this.nettopreis = nettopreis;
	}
}