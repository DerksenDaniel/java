package Vererbung;

public class Praktikant extends Mitarbeiter
{
	double hungerlohn;
	
	public Praktikant()
	{
		
	}
	public Praktikant(double hungerlohn)
	{
		this.hungerlohn = hungerlohn;
	}
	public Praktikant(String name, double hungerlohn)
	{
		setName(name);
		this.hungerlohn = hungerlohn;
	}
//Setter Hungerlohn	
	public void setHungerlohn(double hungerlohn)
	{
		this.hungerlohn = hungerlohn;
	}
	
	//Entgelt"berechnung"
	@Override
	public double berechneEntgelt()
	{
		return hungerlohn;
	}
}