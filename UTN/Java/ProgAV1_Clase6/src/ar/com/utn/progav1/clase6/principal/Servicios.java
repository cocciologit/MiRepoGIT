package ar.com.utn.progav1.clase6.principal;

public class Servicios 
{
	private static Servicios s;
	
	private Servicios ()
	{
	}
	
	public static Servicios getInstance()
	{
		if ( s == null )
		{
			s = new Servicios();
		}
		
		return s;
	}

}
