package Einstieg2;
public class Personal extends Mitarbeiter
{
	private int groesse;
	public Personal()
	{
		
	}
	
	@Override
	public String toString()
	{
		return "Hallo ich bin: " + getName() + ", mein Geburtstag ist am: " + this.getGeb() + " .";
	}
	
	
}