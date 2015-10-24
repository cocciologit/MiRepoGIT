package ar.com.utn.progav1.clase6.principal;

public class Oracle extends Conexion 
{

	@Override
	void abrirConexion() {
		// TODO Auto-generated method stub
		System.out.println("Abro conexion desde " + this.getClass().toString());
		
	}

	@Override
	void cerrarconexion() {
		// TODO Auto-generated method stub
		System.out.println("Cierro conexion desde " + this.getClass().toString());
		
	}

}
