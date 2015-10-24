
package ar.com.utn.progav1.clase3.ej13.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.junit.Test;

import ar.com.utn.progav1.ej13.pojo.Persona;
import ar.com.utn.progav1.ej13.metodos.MetodosPersona;

public class Ej13Test {

	@Test
	public void testAgregarList()
	{
		Persona p = new Persona("ignacio", "cocciolo", 29);
		List<Persona> lp = new ArrayList<Persona>(); 
		
		MetodosPersona mp = new MetodosPersona();
		mp.agregarList(lp, p);
		
	}
	
	@Test
	public void testAgegarSet()
	{
		Persona p = new Persona("andres", "perez", 28);
		Set<Persona> sp = new HashSet<Persona>();
		
		MetodosPersona mp = new MetodosPersona();
		mp.agregarSet(sp, p);
	}
	
	@Test
	public void testAgregarMap()
	{
		Map <Integer, Persona> mapa = new HashMap<Integer, Persona>();
		mapa.put(3, new Persona("nombrepp", "apellidopp", 30));

		System.out.println(mapa.get(3));
	}

}
