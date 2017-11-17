package ostfriesenrechner;

import java.awt.*;
import java.awt.event.*;

public class Rechner extends Frame implements WindowListener, ActionListener, MouseListener
{
	private Button plus;
	private Button minus;
	private TextField textfeld;
	private Label startwert;
	private Label fehler;
	private int wert;
	
	public static void main(String[]args)
	{
		Rechner rechner = new Rechner();
	}
	public Rechner()
	{
		initialize();
	}
	
	private void initialize()
	{
		//Fenstertitel festlegen
		setTitle("Ostfriesenrechner");
		
		//Fenstergröße bestimmen, sichtbar machen und Listener erzeugen
		this.setSize(300,100);
		this.setVisible(true);
		this.addWindowListener(this);
		
		
		//Elemente erzeugen
		plus = new Button("plus");
		minus = new Button("minus");
		startwert = new Label(""+wert);
		textfeld = new TextField("");
		fehler = new Label("Bitte gueltige Zahlen eingeben!");
		fehler.setVisible(false);
		
		//Positionen der Elemente bestimmen
		add(BorderLayout.SOUTH, textfeld);
		add(BorderLayout.WEST, plus);
		add(BorderLayout.CENTER, startwert);
		add(BorderLayout.EAST, minus);
		add(BorderLayout.NORTH, fehler);
		
		//ActionListener der Buttons
		plus.addActionListener(this);
		minus.addActionListener(this);
		textfeld.addActionListener(this);
		
		//MausListener hinzufügen
		plus.addMouseListener(this);
		minus.addMouseListener(this);
		
	}	
		// 7 nötige abstrakte Methoden des Interfaces WindowListener: 
	public void windowActivated(WindowEvent e)
	{		
	}
	public void windowClosed(WindowEvent e)
	{	
	}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0); //benötigt, um das Fenster schließen zu können
	}
	public void windowDeactivated(WindowEvent e)
	{	
	}
	public void windowDeiconified(WindowEvent e)
	{	
	}
	public void windowIconified(WindowEvent e)
	{	
	}
	public void windowOpened(WindowEvent e)
	{		
	}
//action performed
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == plus)
			{	
				fehlerVerstecken();
				wert++;
				
				zeigeAn();
			}
			else if(e.getSource() == minus)
			{
				fehlerVerstecken();
				wert--;
				
				zeigeAn();
			}
			
			if(e.getSource() == textfeld)
			{
				fehlerVerstecken();
				String s = textfeld.getText();
				try
				{
					wert = Integer.valueOf(s).intValue();
				}
				catch(NumberFormatException ex)
				{
					fehler.setVisible(true);
				}
				catch(Exception ex)
				{
					fehler.setVisible(true);
				}
				
				finally
				{
					zeigeAn();
				}
			}
		}
		
		public void mouseEntered(MouseEvent e)
		{
			if(e.getSource() == plus)
			{
				plus.setBackground(Color.BLUE);
			}
			else if(e.getSource() == minus)
			{
				minus.setBackground(Color.RED);
			}
		}
		public void mouseExited(MouseEvent e)
		{
			if(e.getSource() == plus)
			{
				plus.setBackground(minus.getBackground());
			}
			else if(e.getSource() == minus)
			{
				minus.setBackground(plus.getBackground());
			}
		}
		public void mouseClicked(MouseEvent e)
		{}
		public void mousePressed(MouseEvent e)
		{}
		public void mouseReleased(MouseEvent e)
		{}

	private void zeigeAn()
	{
		startwert.setText(""+wert);
		this.pack();
	}
	private void fehlerVerstecken()
	{
		fehler.setVisible(false);
		this.pack();
	}

	
	
	
	
	
	
	
	
	
	
}