package warenwirtschaft;
import java.io.*;

public class Testdriver
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int artNr = 0;
	
	public static void main(String[] args)
	{
		new Testdriver();	
	}
	
	Produkt[] Produkte = new Produkt[5];
	
	Produkte[0] = new Musik-CD(artNr, "BestOfMusik", 19.99, "Musiker1");
	artNr++;
	
	
	
}