package Vererbung;

public abstract class Mitarbeiter
{
	private String name;
	private Adresse adresse;
	
	public abstract double berechneEntgelt();
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
}