package Vererbung;

public class Chef extends Mitarbeiter
{
	double bossGehalt; 
	
	public Chef()
	{
		
	}
	public Chef(double bossGehalt)
	{
		this.bossGehalt = bossGehalt;
	}
	public Chef(String name, double bossGehalt)
	{
		setName(name);
		this.bossGehalt = bossGehalt;
	}
	//Setter BossGehalt
	public void setBossGehalt(double bossGehalt)
	{
		this.bossGehalt = bossGehalt;
	}
	
	//Berechnung Entgelt
	@Override
	public double berechneEntgelt()
	{
		return bossGehalt;
	}
}