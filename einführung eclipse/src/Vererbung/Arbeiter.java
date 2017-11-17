package Vererbung;

public class Arbeiter extends Mitarbeiter
{
	private double LohnStd;
	private int anzahlStd;
	
	public Arbeiter()
	{
		
	}
	public Arbeiter(double LohnStd, int anzahlStd)
	{
		this.LohnStd = LohnStd;
		this.anzahlStd = anzahlStd;
	}
	public Arbeiter(String name, double LohnStd, int anzahlStd)
	{
		setName(name);
		this.LohnStd = LohnStd;
		this.anzahlStd = anzahlStd;
	}
	
	//Getter/Setter
	//LohnStd
	public double getLohnStd()
	{
		return LohnStd;
	}
	public void setLohnStd(double LohnStd)
	{
		this.LohnStd = LohnStd;
	}
	//anzahlStd
	public int getAnzahlStd()
	{
		return anzahlStd;
	}
	public void setAnzahlStd(int anzahlStd)
	{
		this.anzahlStd = anzahlStd;
	}
	
	//Entgelt berechnen
	@Override
	public double berechneEntgelt()
	{
		return LohnStd * anzahlStd;
	}
}
