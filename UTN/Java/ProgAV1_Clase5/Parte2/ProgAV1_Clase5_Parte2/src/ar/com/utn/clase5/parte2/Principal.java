package ar.com.utn.clase5.parte2;

import java.util.ResourceBundle;

public class Principal {
	
	public static void main( String [] args )
	{
		/*no hago NEW sino a travez de una metodo estatico de la misma clase*/
		ResourceBundle rb = ResourceBundle.getBundle("ar/com/utn/clase5/parte2/propiedades/archivo");
		/*No  hace falta poner la extension .properties ya que el Bundle abre solo ese tipo de archivos*/
		/*No hace falta cerrar el archivo*/
		
		try
		{
			if ( rb.containsKey("Nombre") == true )
			{
				String nombre = rb.getString("Nombre");
				System.out.println(nombre);
			}
		}
		catch( Exception e )
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			if ( rb.containsKey("apellido") == true )
			{
				String apellido = rb.getString("apellido");
				System.out.println(apellido);
			}
		}
		catch( Exception e )
		{
			System.out.println(e.getMessage());
		}

		try
		{
			if ( rb.containsKey("Apellido") == true )
			{
				String nombre2 = rb.getString("Apellido");
				System.out.println(nombre2);
			}
		}
		catch( Exception e )
		{
			System.out.println(e.getMessage());
		}

	}

}
