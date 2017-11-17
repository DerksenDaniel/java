package fpa1Derksen;

public abstract class Auto
{
	private String hersteller = null;
	private String fahrzeugbezeichnung = null;
	private int kmStand = 0;
	private int tankinhalt = 0;
	
	private int fahrzeugNr;
	static int anzahl = 0;
	abstract int gefahreneKm = 0;
	private Mieter mieter;
	private double mietpreis;
	
	public abstract double berechneMietpreis(int gefahreneKm);
	
	// Überladen für alle!
	public double berechneMietpreis(int gefahreneKm, int fehlendeLiter, int tankpauschale)
	{
		return berechneMietpreis(gefahreneKm) + fehlendeLiter * tankpauschale;
	}
	
	public Auto()
	{
		
	}
	public Auto(String hersteller, String fahrzeugbezeichnung, int kmStand, int tankinhalt)
	{
		this.hersteller = hersteller;
		this.fahrzeugbezeichnung = fahrzeugbezeichnung;
		this.kmStand = kmStand;
		this.tankinhalt = tankinhalt;
		anzahl++;
		fahrzeugNr = anzahl;
	}
	public Auto(Mieter mieter)
	{
		this.mieter = mieter;
	}
	
//Getter/Setter
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name = name;
	}
	
	public String getHersteller()
	{
		return hersteller;
	}
	
	public String getFahrzeugbezeichnung()
	{
		return fahrzeugbezeichnung;
	}
	
	public int getFahrzeugnummer()
	{
		return fahrzeugNr;
	}
	
	public int getKmStand()
	{
		return kmStand;
	}
	
	public int getTankinhalt()
	{
		return tankinhalt;
	}
	
}
