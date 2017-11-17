package Einstieg2;
public class Schueler extends Mitarbeiter
{
	private int anzahlNoten;
	private int notenSumme;
	private int note;
	
	public Schueler()
	{
		
	}
	
	public Schueler(String name, int anzahlNoten, int noten[])
	{
		this.name = name;
		this.anzahlNoten = anzahlNoten;
	}
	
	@Override
	public String toString()
	{
		return "Der Schueler traegt den Namen " +getName() + ".";
	}
	
	public int getNote()
	{
		return note;
	}
	public void setNote()
	{
		
	}
	
	public int getAnzahlNoten()
	{
		return anzahlNoten;
	}
	public void setAnzahlNoten()
	{
		
	}
} 