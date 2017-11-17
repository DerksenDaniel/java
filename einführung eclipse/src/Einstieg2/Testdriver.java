package Einstieg2;
import java.io.*;

public class Testdriver
{	
	BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
	double enterGehalt = 0;
	String enterName, eingabe = null;
	
	public Testdriver()
	{
		eingeben();
	}
	
	public static void main(String[] args)
	{
			new Testdriver();
	}
	
	private void eingeben()
	{
		Mitarbeiter Mitarbeiter1 = new Mitarbeiter("Karl", "21.06.1965", 1500.60, new Adresse("Stetinerstr", 1, "Wuerzburg", 97070));
		Mitarbeiter Mitarbeiter2 = new Mitarbeiter("Daniel","14.09.1994", 1450.50, new Adresse("Rosenstrasse", 12, "Kirchheim", 97268));
		
	/*	System.out.println("Name: " +Mitarbeiter1.getName());
		System.out.println("Geburtsdatum: " +Mitarbeiter1.getGeb());
		System.out.println("Gehalt: " +Mitarbeiter1.getGehalt());
		System.out.println("Personalnummer: " +Mitarbeiter1.getID());
		System.out.println(" ");
		
		System.out.println("Name: " +Mitarbeiter2.getName());
		System.out.println("Geburtsdatum: " +Mitarbeiter2.getGeb());
		System.out.println("Gehalt: " +Mitarbeiter2.getGehalt());
		System.out.println("Personalnummer: " +Mitarbeiter2.getID());
	*/	System.out.println(" ");
		
	/*	Mitarbeiter1.setName("Horst");
		System.out.println("Name: " +Mitarbeiter1.getName());
		System.out.println(Mitarbeiter2.toString());*/
		
//Test zum Aufrufen der Vererbung		
		Schueler s = new Schueler();
		s.setName("Stefan");
		System.out.println(s.toString());
		
		System.out.println("Wie viele Noten liegen fuer Schueler " +getName()+ " vor?");
		
		boolean weiter;
		
		do 
		{
			try
			{
				eingabe = in.readLine();
				enterNote = Int.valueOf().intValue();
				weiter = true;
				enterNote = s.setAnzahlNoten();
			}
			catch (Exception e)
			{
				System.out.println("Bitte sinnvolle Zahlen eingeben!");
				weiter = false;
			}
		}while (weiter == false);
		
		
//

//Mitarbeiter verarbeiten		
/*		Mitarbeiter[] vieleMitarbeiter = new Mitarbeiter[4];
		
		vieleMitarbeiter [0] = Mitarbeiter1;
		vieleMitarbeiter [1] = Mitarbeiter2;
		vieleMitarbeiter [2] = new Mitarbeiter("Paul", "23.01.1970", 1800.00, new Adresse("Hauptstr", 4, "Helmstadt", 97345));
		vieleMitarbeiter [3] = new Mitarbeiter("Fred", "03.8.1983", 2500.34, new Adresse("Schulstr", 10, "Giebelstadt", 97443));
	
		for(int i = 0; i < vieleMitarbeiter.length; i++)
		{
			System.out.println("Name: " +vieleMitarbeiter[i].getName());
			System.out.println("Geburtsdatum: " +vieleMitarbeiter[i].getGeb());
			System.out.println("Gehalt: " +vieleMitarbeiter[i].getGehalt());
			System.out.println("Personalnummer: " +vieleMitarbeiter[i].getID());
			System.out.println("Strasse: " +vieleMitarbeiter[i].getAdresse().getStrasse());
			System.out.println("Hausnummer: " +vieleMitarbeiter[i].getAdresse().getHaus());
			System.out.println("Ort: " +vieleMitarbeiter[i].getAdresse().getOrt());
			System.out.println("PLZ: " +vieleMitarbeiter[i].getAdresse().getPLZ());
			
			System.out.println(" ");
			
		//	System.out.println(vieleMitarbeiter[i].getName()+ " geboren am "+ vieleMitarbeiter[i].getGeb()+" hat die Personalnummer "+vieleMitarbeiter[i].getID()+ " und verdient "+vieleMitarbeiter[i].getGehalt()+ " Euro.");	
		}
		
		System.out.println("Bitte gib den Namen von Mitarbeiter 1 ein");
//Exceptions bei Eingabe		
		try 
		{
			enterName = in.readLine();
		}
		catch (Exception e)
		{
			System.out.println("Fehler!!");
		}
		
		vieleMitarbeiter[0].setName(enterName);
		
		System.out.println("Gib das Gehalt von Mitarbeiter " +vieleMitarbeiter[0].getName()+ " ein");
		
		boolean istOk;
		
		do 
		{
			try
			{
				eingabe = in.readLine();
				enterGehalt =Double.valueOf(eingabe.replace(',','.')).doubleValue();
				istOk = true;
			}
			catch (Exception e)
			{
				System.out.println("Bitte sinnvolle Zahlen eingeben!");
				istOk = false;
			}
		}while (istOk == false);
		
		vieleMitarbeiter[0].setGehalt(enterGehalt);
		
		
//Einen Mitarbeiter zum anderen ziehen lassen		
			System.out.println("Mitarbeiter " +vieleMitarbeiter[2].getName()+ " und Mitarbeiter " +vieleMitarbeiter[3].getName()+ " ziehen zusammen in eine WG zu " + vieleMitarbeiter[2].getName());
			
			vieleMitarbeiter[3].setAdresse(vieleMitarbeiter[2].getAdresse());
			
				for(int i = 0; i < vieleMitarbeiter.length; i++)
			{
				System.out.println("Name: " +vieleMitarbeiter[i].getName());
				System.out.println("Geburtsdatum: " +vieleMitarbeiter[i].getGeb());
				System.out.println("Gehalt: " +vieleMitarbeiter[i].getGehalt());
				System.out.println("Personalnummer: " +vieleMitarbeiter[i].getID());
				System.out.println("Strasse: " +vieleMitarbeiter[i].getAdresse().getStrasse());
				System.out.println("Hausnummer: " +vieleMitarbeiter[i].getAdresse().getHaus());
				System.out.println("Ort: " +vieleMitarbeiter[i].getAdresse().getOrt());
				System.out.println("PLZ: " +vieleMitarbeiter[i].getAdresse().getPLZ());
			
				System.out.println(" ");
				System.out.println(" ");
			
			}
			
//2 Mitarbeiter an neuen gleichen Ort versetzen			
			System.out.println("Beide ziehen gemeinsam an einen neuen Ort");
			
			vieleMitarbeiter[2].getAdresse().setStrasse("Baumstr");
			vieleMitarbeiter[2].getAdresse().setHaus(3);
			vieleMitarbeiter[2].getAdresse().setOrt("Rottendorf");
			vieleMitarbeiter[2].getAdresse().setPLZ(97884);
			
			vieleMitarbeiter[3].setAdresse(vieleMitarbeiter[2].getAdresse());
			
			for(int i = 0; i < vieleMitarbeiter.length; i++)
		{
			System.out.println("Name: " +vieleMitarbeiter[i].getName());
			System.out.println("Geburtsdatum: " +vieleMitarbeiter[i].getGeb());
			System.out.println("Gehalt: " +vieleMitarbeiter[i].getGehalt());
			System.out.println("Personalnummer: " +vieleMitarbeiter[i].getID());
			System.out.println("Strasse: " +vieleMitarbeiter[i].getAdresse().getStrasse());
			System.out.println("Hausnummer: " +vieleMitarbeiter[i].getAdresse().getHaus());
			System.out.println("Ort: " +vieleMitarbeiter[i].getAdresse().getOrt());
			System.out.println("PLZ: " +vieleMitarbeiter[i].getAdresse().getPLZ());
			
			System.out.println(" ");
			System.out.println(" ");
		}
		
//Wohnort eines Mitarbeiters wieder zurücksetzen			
			System.out.println(vieleMitarbeiter[3].getName()+" versteht sich nicht mehr mit "+ vieleMitarbeiter[2].getName()+" und zieht wieder in seine alte Wohnung");
			
			vieleMitarbeiter [3].setAdresse(new Adresse("Schulstr", 10, "Giebelstadt", 97443));
			
			for(int i = 0; i < vieleMitarbeiter.length; i++)
		{
			System.out.println("Name: " +vieleMitarbeiter[i].getName());
			System.out.println("Geburtsdatum: " +vieleMitarbeiter[i].getGeb());
			System.out.println("Gehalt: " +vieleMitarbeiter[i].getGehalt());
			System.out.println("Personalnummer: " +vieleMitarbeiter[i].getID());
			System.out.println("Strasse: " +vieleMitarbeiter[i].getAdresse().getStrasse());
			System.out.println("Hausnummer: " +vieleMitarbeiter[i].getAdresse().getHaus());
			System.out.println("Ort: " +vieleMitarbeiter[i].getAdresse().getOrt());
			System.out.println("PLZ: " +vieleMitarbeiter[i].getAdresse().getPLZ());
			
			System.out.println(" ");
			System.out.println(" ");
		}
*/			
			
			
	}
}