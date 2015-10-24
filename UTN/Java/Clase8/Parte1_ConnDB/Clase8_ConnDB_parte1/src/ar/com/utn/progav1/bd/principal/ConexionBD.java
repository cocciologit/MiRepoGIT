package ar.com.utn.progav1.bd.principal;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;


public class ConexionBD 
{
	public Connection abrirConexion() throws SQLException
	{
		Connection conn = null;
		try {
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = (Connection) DriverManager.getConnection("JDBC:MYSQL://localhost:3306/test", "root", null);
				
				System.out.println("Conextado a la BD correctamente.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch ( SQLException e )
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return conn;
	}
}
