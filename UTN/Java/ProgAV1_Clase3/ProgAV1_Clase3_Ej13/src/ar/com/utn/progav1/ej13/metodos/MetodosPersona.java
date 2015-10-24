package ar.com.utn.progav1.ej13.metodos;

import java.util.List;
import java.util.Map;
import java.util.Set;

import ar.com.utn.progav1.ej13.pojo.Persona;

public class MetodosPersona {
	
	public void agregarList( List<Persona> lp, Persona p )
	{
		lp.add(p);
	}
	
	public void agregarSet( Set<Persona> setP, Persona p )
	{
		setP.add(p);
	}
	
	public void agregarMap( Map<Integer,Persona> mapP, Integer key, Persona P )
	{
		mapP.put(key, P);
	}

}
