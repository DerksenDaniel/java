package Vererbung;
import java.io.*;

public class Testdriver
{
	BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
	String eingabe = null;
	boolean weiter = false;
	double enterGehalt = 0;
	
		Arbeiter arb1 = new Arbeiter("Paul", 17.20, 140);
		Angestellter ang1 = new Angestellter("Kurt", 4000.00, 500);
		Praktikant prak1 = new Praktikant("Olga", 500.00);
		Chef chef1 = new Chef("Otto", 7000.00);
	
	public Testdriver()
	{
		//eingabeDaten();
		//berechneGehalt();
		ausgabeDaten();
	}
//neuen Testdriver erzeugen	
	public static void main(String[] args)
	{
		new Testdriver();
		
	}
//Methoden	
	/*public void eingabeDaten()
	{
		
	}*/

/*	public void berechneGehalt()
	{
		arb1.berechneEntgelt();
		ang1.berechneEntgelt();
		prak1.berechneEntgelt();
		chef1.berechneEntgelt();
	}*/
	
	public void ausgabeDaten()
	{
//Erstellen eines Mitarbeiter-Arrays, in dem jede Art von Person enthalten ist		
		Mitarbeiter[] vieleMA = new Mitarbeiter[6];
		vieleMA[0] = arb1;
		vieleMA[1] = ang1;
		vieleMA[2] = chef1;
		vieleMA[3] = prak1;
		vieleMA[4] = new Praktikant("Benjamin", 30.0);
		vieleMA[5] = new Angestellter("Sebastian", 0);
		
/*		System.out.println("Entgelt von Mitarbeiter/in "+arb1.getName()+" betraegt "+arb1.berechneEntgelt());
		System.out.println("Entgelt von Mitarbeiter/in "+ang1.getName()+" betraegt "+ang1.berechneEntgelt());
		System.out.println("Entgelt von Mitarbeiter/in "+prak1.getName()+" betraegt "+prak1.berechneEntgelt());
		System.out.println("Entgelt von Mitarbeiter/in "+chef1.getName()+" betraegt "+chef1.berechneEntgelt());
*/		
		for(int i=0; i<vieleMA.length; i++)
		{
			System.out.println("Entgelt von Mitarbeiter/in "+vieleMA[i].getName()+" betraegt "+vieleMA[i].berechneEntgelt()+" Euro"); 
		}
		
		System.out.println("Das Gehalt von Mitarbeiter/in "+vieleMA[1].getName()+" soll erhoeht werden. Wie viel soll der Mitarbeiter in Zukunft verdienen? Das aktuelle Gehalt liegt bei "+vieleMA[1].berechneEntgelt()+" Euro");
	
		do 
		{
			try
			{
				eingabe = in.readLine();
				enterGehalt = Double.valueOf(eingabe.replace(',','.')).doubleValue();
				
				ang1.setGehalt(enterGehalt);
				weiter = true;
			}
			catch (Exception e)
			{
				System.out.println("Bitte sinnvolle Zahlen eingeben!");
				weiter = false;
			}
		}while (weiter == false);
		
		for(int i=0; i<vieleMA.length; i++)
		{
			System.out.println("Entgelt von Mitarbeiter/in "+vieleMA[i].getName()+" betraegt "+vieleMA[i].berechneEntgelt()+" Euro"); 
		}
	}
	
	
}