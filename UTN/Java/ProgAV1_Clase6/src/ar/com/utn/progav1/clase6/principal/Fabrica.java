package ar.com.utn.progav1.clase6.principal;

public class Fabrica 
{
	
	public Conexion getConexion( String cadenaConexion )
	{
		Conexion con = null;
		
		if (cadenaConexion.equals("O") )
		{
			con = new Oracle();
		}
		
		if ( cadenaConexion.equals("M") )
		{
			con = new MySql();
		}
		
		return con;
	}

}
