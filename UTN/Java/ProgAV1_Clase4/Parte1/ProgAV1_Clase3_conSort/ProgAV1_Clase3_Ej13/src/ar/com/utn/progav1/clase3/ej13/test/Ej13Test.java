package ar.com.utn.progav1.clase3.ej13.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.com.utn.progav1.ej13.pojo.Persona;
import ar.com.utn.progav1.ej13.metodos.MetodosPersona;

public class Ej13Test {
	
	public void testAgregarList()
	{
		Persona p = new Persona("ignacio", "cocciolo", 29);
		List<Persona> lp = new ArrayList<Persona>(); 
		
		MetodosPersona mp = new MetodosPersona();
		mp.agregarList(lp, p);
		
	}
	
	public void testAgegarSet()
	{
		Persona p = new Persona("andres", "perez", 28);
		Set<Persona> sp = new HashSet<Persona>();
		
		MetodosPersona mp = new MetodosPersona();
		mp.agregarSet(sp, p);
	}

}
