package ar.com.utn.progav1.bd.principal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class OperacionesBD 
{
	Connection conn = null;

	public OperacionesBD(Connection conn)
	{
		this.conn = conn;
	}

	public void insertaRegistro()
	{
		try
		{ 
			PreparedStatement ps = null;
			ps = (PreparedStatement) this.conn.prepareStatement("INSERT INTO `test`.`prueba` (`descripcion`) VALUES (?)");
			/*Paso como parametro el valor del campo descripcion*/
			ps.setString(1, "ValorDescrpicion");
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public List<Persona> seleccion()
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Persona> personas = new ArrayList<Persona>();

		try {
			ps = (PreparedStatement)conn.prepareStatement("select * from `test`.`prueba`");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while( rs.next() )
			{
				int id = rs.getInt(1);
				String desc = rs.getString(2);
				
				Persona p = new Persona();
				p.setIdPersona(id);
				p.setDescPersona(desc);
				personas.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return personas;
	}

}
