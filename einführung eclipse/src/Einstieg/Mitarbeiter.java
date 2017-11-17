package Einstieg;
public class Mitarbeiter
{
	private String name;
	private String gebDat;
	private double gehalt;
	private int ID;
	static int anzahl = 0;
	private Adresse adresse;
	
	
	public Mitarbeiter()
	{
	
	}
	public Mitarbeiter(String name)
	{
		this.name = name;
	}
	public Mitarbeiter(String name, String gebDat)
	{
		this.name = name;
		this.gebDat = gebDat;
	}
	public Mitarbeiter(String name, String gebDat, double gehalt)
	{
		this.name = name;
		this.gebDat = gebDat;
		this.gehalt = gehalt;
		anzahl++;
		ID = anzahl;
	}
	public Mitarbeiter(String name, String gebDat, double gehalt, Adresse adresse)
	{
		this.name = name;
		this.gebDat = gebDat;
		this.gehalt = gehalt;
		this.adresse = adresse;
		anzahl++;
		ID = anzahl;
	}
	
	
//Setter/Getter Name	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
//Setter/ Getter Geburtsdatum	
	public String getGeb()
	{
		return gebDat;
	}
	public void setGeb(String gebDat)
	{
		this.gebDat = gebDat;
	}
//Setter/Getter Gehalt	
	public double getGehalt()
	{
		return gehalt;
	}
	public void setGehalt(double gehalt)
	{
		this.gehalt = gehalt;
	}
//Getter ID	
	public int getID()
	{
		return ID;
	}
	
//Getter Adresse
	public Adresse getAdresse()
	{
		return adresse;
	}
	public void setAdresse(Adresse adresse)
	{
		this.adresse = adresse;
	}


	
	public String toString()
	{
		return "Hallo mein Name ist: " + name + ", ich habe am: " + gebDat + " Geburtstag.";
	}
	
	
}