package umrechnerGUI;

import java.awt.*;
import java.awt.event.*;

public class Umrechner extends Frame implements ActionListener
{
	private Label betrag;
	private TextField textfeld;
	private Label ergebnis;
	private Choice auswahl;
	//private FlowLayout flow = new FlowLayout();
	private Panel panel = new Panel();
	
	public static void main(String[]args)
	{
		Umrechner umrechner = new Umrechner();
	}
	public Umrechner()
	{
		initialize();
	}
	
	private void initialize()
	{
		setTitle("Umrechnung Euro");
		
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		betrag = new Label("Betrag: ");
		textfeld = new TextField("", 10);
		ergebnis = new Label("Ergebnis:");
		auswahl = new Choice();
		auswahl.add("Euro in Dollar");
		auswahl.add("Dollar in Euro");
		auswahl.add("Euro in Fränkli");
		
		add(BorderLayout.NORTH, panel);
		//panel.add(flow);
		panel.add(betrag);
		panel.add(textfeld);
		add(BorderLayout.CENTER, auswahl);
		add(BorderLayout.SOUTH, ergebnis);
		
	//	ComponentOrientation.LEFT_TO_RIGHT;
		
		this.pack();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
	
	
}