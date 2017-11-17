package ratespiele;

import java.awt.*;
import java.awt.event.*;

public class Ratespiel extends Frame implements ActionListener
{
	private Button raten;
	private TextField textfeld;
	private Label titel;
	private Label verloren;
	private Label sieg;
	private Label fehler;
	private int zahl = (int)(Math.random()*10+1);
	private int wert;
	private Label info;
	
	public static void main(String[]args)
	{
		Ratespiel ratespiel = new Ratespiel();
	}
	public Ratespiel()
	{
		initialize();
	}
	
	private void initialize()
	{
		//Titel festlegen
		setTitle("Ratespiel");
		
		//this.setSize(300,100);
		this.setVisible(true);
		//der WindowAdapter enthält die 7 nötigen Methoden des WindowListeners
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		//Elemente erzeugen
		raten = new Button("raten");
		textfeld = new TextField("Zahl eingeben");
		titel = new Label("Ratespiel zwischen 1 und 10:");
	/*	verloren = new Label("Die Zufallszahl war: "+zahl);
		sieg = new Label("GEWONNEN! Die Zufallszahl war: "+zahl);
		fehler = new Label("Bitte gib nur ganze Zahlen ein!");
	*/	info = new Label("");
		
	/*	verloren.setVisible(false);
		sieg.setVisible(false);
		fehler.setVisible(false);
	*/	info.setVisible(false);
		
		//Positionen bestimmen
		add(BorderLayout.EAST, raten);
		add(BorderLayout.CENTER, textfeld);
		add(BorderLayout.NORTH, titel);
	/*	add(BorderLayout.SOUTH, verloren);
		add(BorderLayout.SOUTH, sieg);
		add(BorderLayout.SOUTH, fehler);
	*/	add(BorderLayout.SOUTH, info);
		
		//ActionListener
		raten.addActionListener(this);
		textfeld.addActionListener(this);
		
		this.pack();
	}	
		//action performed
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == raten)
			{
				labelsVerstecken();
				zahl = (int)(Math.random()*10+1);
			}
			else if(e.getSource() == textfeld)
			{

				labelsVerstecken();
				String s = textfeld.getText();
				try
				{
					wert = Integer.valueOf(s).intValue();
					if(wert == zahl)
					{
						info.setText("GEWONNEN! Die Zufallszahl war: "+zahl);
						labelAnzeigen();
					}
					else
					{
						info.setText("Die Zufallszahl war: "+zahl);
						labelAnzeigen();
					}
				}
				catch(NumberFormatException ex)
				{
					info.setText("Bitte nur Sinnvolles eingeben!");
					labelAnzeigen();
				}
				catch(Exception ex)
				{
					info.setText("Ein Fehler ist aufgetreten!");
					labelAnzeigen();
				}
				finally
				{
					this.pack();
				}
				
			}
		}
		
		private void labelsVerstecken()
		{
		/*	verloren.setVisible(false);
			sieg.setVisible(false);
			fehler.setVisible(false);
		*/	info.setVisible(false);
			this.pack();
		}
		private void labelAnzeigen()
		{
			info.setVisible(true);
		}
			
	
}