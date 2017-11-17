package Vererbung;
public class Adresse
{
	private String strasse;
	private int hausnr;
	private String ort;
	private int plz;
	
	public Adresse(String strasse, int hausnr, String ort, int plz)
	{
		this.strasse = strasse;
		this.hausnr = hausnr;
		this.ort = ort;
		this.plz = plz;
	}
	
	
	//Getter/Setter Straße
	public String getStrasse()
	{
		return strasse;
	}
	public void setStrasse(String strasse)
	{
		this.strasse = strasse;
	}
	//Getter/Setter Hausnummer
	public int getHaus()
	{
		return hausnr;
	}
	public void setHaus(int hausnr)
	{
		this.hausnr = hausnr;
	}
	//Getter/Setter Ort
	public String getOrt()
	{
		return ort;
	}
	public void setOrt(String ort)
	{
		this.ort = ort;
	}
	//Getter/Setter PLZ
	public int getPLZ()
	{
		return plz;
	}
	public void setPLZ(int plz)
	{
		this.plz = plz;
	}	
}