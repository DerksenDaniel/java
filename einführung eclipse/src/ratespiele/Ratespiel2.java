package ratespiele;

import java.awt.*;
import java.awt.event.*;

public class Ratespiel2 extends Frame implements ActionListener
{
	private Button raten;
	private Button neu;
	private TextField textfeld;
	private Label titel;
	private Label info;
	private int zahl = (int)(Math.random()*100+1);
	private int wert;
	private int versuche = 0;
	private boolean weiter = true;
	
	public static void main(String[]args)
	{
		Ratespiel2 ratespiel2 = new Ratespiel2();
	}
	public Ratespiel2()
	{
		initialize();
	}
	
	private void initialize()
	{
		setTitle("Ratespiel2");
		
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		raten = new Button("raten");
		textfeld = new TextField("Zahl eingeben");
		titel = new Label("Ratespiel zwischen 1 und 100");
		info = new Label("Viel Erfolg! - Los geht´s!");
		neu = new Button("neues Spiel");
		
		info.setVisible(false);
		
		add(BorderLayout.NORTH, titel);
		add(BorderLayout.EAST, raten);
		add(BorderLayout.SOUTH, info);
		add(BorderLayout.WEST, neu);
		add(BorderLayout.CENTER, textfeld);
		
		raten.addActionListener(this);
		neu.addActionListener(this);
		textfeld.addActionListener(this);
		
		this.pack();
	}
	
		public void actionPerformed(ActionEvent e)
		{
				wert =ueberpruefeEingabe();
	
			if(e.getSource() == raten)
			{
				raten(wert);
			
			}
			else if(e.getSource() == neu)
			{
				neuesSpiel();
			}
		}
		
		private int ueberpruefeEingabe() throws ArithmeticException
		{
			String s = textfeld.getText();
			
				try
				{
					wert = Integer.valueOf(s).intValue();
				}
				catch(NumberFormatException ex)
				{
					info.setText("Bitte nur Sinnvolles eingeben!");
				}
				catch(Exception ex)
				{
					info.setText("Ein Fehler ist aufgetreten");
				}
				finally
				{
					this.pack();
				}
			
			
			if (wert <1 || wert >100)
			{
				throw new ArithmeticException("Wert nicht zwischen 1 und 100");
			}
			
			return wert;
		}
		
		private void raten(int wert)
		{
			if(wert == zahl)
			{
				info.setText("GEWONNEN! Du hast "+versuche+ " Versuche gebraucht!");
				this.pack();
				
			}
			else if(wert < zahl)
			{
				info.setText("Deine Zahl ist zu klein!");
				versuche++;
				titel.setText("Versuche : "+versuche+"");
				info.setVisible(true);
				this.pack();
				
			}
			else if(wert > zahl)
			{
				info.setText("Deine Zahl ist zu gross!");
				versuche++;
				titel.setText("Versuche : "+versuche+"");
				info.setVisible(true);
				this.pack();
				
			}

		}
		
		private int neuesSpiel()
		{
			titel.setText("Ratespiel zwischen 1 und 100");
			versuche = 0;
			info.setVisible(false);
			textfeld.setText("");
			zahl = (int)(Math.random()*100+1);
			this.pack();
			
			return versuche;
		}
		
		
	
	
}






