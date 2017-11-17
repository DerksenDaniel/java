package ersteGUI;

import java.awt.*;
import java.awt.event.*;

public class ersteGUI extends Frame implements WindowListener, ActionListener
{
	private Button button;
	private Label label;
	private TextField textfeld;
	
	private Button button2;
	private Label label2;
	
	public static void main(String[]args)
	{
		ersteGUI gui = new ersteGUI(); // Objekt wird instanziiert, GUI wird erzeugt
	}
	public ersteGUI()
	{
		initialize();
	}
	
	private void initialize()
	{
		//Fenstertitel bestimmen
		setTitle("Meine erste GUI");
		
		this.setSize(300, 100);
		this.setVisible(true);
		this.addWindowListener(this);
		
		//Button, Label und Textfeld erzeugen
		button = new Button("Drueck mich");
		label = new Label("Ich bin ein Label");
		label.setVisible(false);
		textfeld = new TextField("");
		textfeld.setVisible(false);
		
		button2 = new Button("Mich auch");
		label2 = new Label("Ich bin auch ein Label");
		
		//Positionieren der hinzugefügten Elemente im BorderLayout
		add(BorderLayout.WEST, button);
		add(BorderLayout.EAST, label);
		add(BorderLayout.SOUTH, textfeld);
		add(BorderLayout.CENTER, button2);
		add(BorderLayout.EAST, label2);

		//ActionListener, um beim Knopfdruck etwas zu tun
		button.addActionListener(this);
		button2.addActionListener(this);
		
		this.pack();//setzt das Fenster auf die Kleinstmögliche Größe, um alles anzuzeigen
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
	//ActionListener, nötig für Mausklick z.B
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			if(!label.isVisible())//Prüfung, ob das Label aktuell nicht (das "!") sichtbar ist
			{
				label.setVisible(true);
				textfeld.setVisible(true);
				button.setLabel("Label und Textfeld verschwinden lassen");//Buttontext bei Klick ändern
				this.pack();
			}
			else
			{
				label.setVisible(false);
				textfeld.setVisible(false);
				button.setLabel("Label und Textfeld anzeigen lassen");
				this.pack();
			}
		}
		else if(e.getSource() == button2)
		{
			methode2();
		}
	}
	
	public void methode2()
	{
		if(label2.isVisible())
		{
			label2.setVisible(false);
			button2.setLabel("Zweites Label anzeigen lassen");
			this.pack();
		}
		else
		{
			label2.setVisible(true);
			button2.setLabel("Zweites Label wieder verschwinden lassen");
			this.pack();
		}
	}
	
}