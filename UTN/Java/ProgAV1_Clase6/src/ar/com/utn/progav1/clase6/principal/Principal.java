package ar.com.utn.progav1.clase6.principal;

public class Principal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Singleton
		//Servicios s = Servicios.getInstance();
		
		//Ejemplo de conexion con patron Factory
		Fabrica f = new Fabrica();
		Conexion con = f.getConexion("O");
		

	}

}
