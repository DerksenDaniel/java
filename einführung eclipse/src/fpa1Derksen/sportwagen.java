package fpa1Derksen;

public class kleinwagen extends Auto
{
	@Override
	public double berechneMietpreis(int gefahreneKm)
	{
		kmStand += gefahreneKm;
		mietpreis = gefahreneKm * 0.05;
		return mietpreis;
	}
}