package ar.com.utn.progav1.bd.principal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Principal 
{
	public static void main(String[] args)
	{
		
		ConexionBD conexion = new ConexionBD();
		Connection conn = null;
		List<Persona> listadoPersonas = new ArrayList<Persona>();
		
		try {
			conn = conexion.abrirConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Fallo la conexion a la BD");
			e.printStackTrace();
		}

		OperacionesBD opBD = new OperacionesBD(conn);

		/**
		 * Hace autocommit.
		 * Cierra la conexion luego del insert.
		 */
		opBD.insertaRegistro();

		listadoPersonas = opBD.seleccion();
		
		try {
			conn.commit();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for( Persona p : listadoPersonas )
		{
			System.out.println(p.getIdPersona() + " " + p.getDescPersona());
		}

	}
}

