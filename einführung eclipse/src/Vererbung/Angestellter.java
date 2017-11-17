package Vererbung;

public class Angestellter extends Mitarbeiter
{
	private double gehalt;
	private double zulage;
	
	public Angestellter()
	{
		
	}
	public Angestellter(String name, double gehalt)
	{
		setName(name);
		this.gehalt = gehalt;
		this.zulage = zulage;
	}
	public Angestellter(String name, double gehalt, double zulage)
	{
		setName(name);
		this.gehalt = gehalt;
		this.zulage = zulage; 
	}
	
	//Getter/Setter
	// gehalt
	public double getGehalt()
	{
		return gehalt;
	}
	public void setGehalt(double gehalt)
	{
		this.gehalt = gehalt;
	}
	//zulage
	public double getZulage()
	{
		return zulage;
	}
	public void setZulage(double zulage)
	{
		this.zulage = zulage;
	}
	
	//Entgelt berechnen
	@Override
	public double berechneEntgelt()
	{
		double entgelt = gehalt + zulage;
		return entgelt;
	}
}
