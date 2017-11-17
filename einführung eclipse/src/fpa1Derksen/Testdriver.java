package fpa1Derksen;
import java.io.*;

public class Testdriver
{
	BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
	String eingabe = null;
	int zusatzverbrauch = 0;
	
		kleinwagen klein1 = new kleinwagen("VW", "Up", 12456, 35);
		sportwagen sport1 = new sportwagen("Audi", "TT", 25647, 55);
		suv svu1 = new suv("BMW", "X1", 43586, 61);
	
	public static void main(String[] args)
	{
		new Testdriver();
	}
	
	public void aufgabe()
	{
		Auto[] vieleAtutos = new Auto[3];
		vieleAtutos[0] = klein1;
		vieleAtutos[1] = sport1;
		vieleAtutos[2] = suv1;
	
		vieleAtutos[0] = klein1("Max", "Mustermann", "D1234");
		vieleAtutos[1] = sport1("Mickey", "Mouse", "E4567");
		vieleAtutos[2] = suv1("Bart", "Wucks", "U2345");
	
//	vieleAtutos[0].berechneMietpreis(100);
//	vieleAtutos[1].berechneMietpreis(200);
//	vieleAtutos[2].berechneMietpreis(400, 40, 2)
	
		do
		{
			System.out.println("Wie viele Liter fehlen im Tank des "+vieleAtutos[2].getHersteller()+ "?");
			try
			{
				eingabe = in.readLine();
				zusatzverbrauch = Integer.valueOf(eingabe);
			
				weiter = true;
			}
			catch(Exception e)
			{
				System.out.println("Bitte sinnvolle Zahlen eingeben!");
				weiter = false;
			}
		}while (weiter == false)
		
		for(int i=0; i<vieleAtutos.length; i++)
		{
			System.out.println("Wagen "+vieleAtutos[i].getHersteller()+ " Modell "+vieleAtutos[i].getFahrzeugbezeichnung()+ " Mit der Nummer "+vieleAtutos[i].getFahrzeugnummer()+" hat folgende Werte:");
			System.out.println("Der Kilometerstand beträgt nun "+vieleAtutos[i].getKmStand()+ " KM");
			System.out.println("Im Tank befinden sich aktuell "+vieleAtutos[i].getTankinhalt()+ "Liter");
			System.out.println("Der Mietpreis betraegt "+vieleAtutos[i].berechneMietpreis()+ " Euro");
		}
	}	
	
}