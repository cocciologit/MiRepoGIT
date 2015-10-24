package ar.com.utn.progav1.clase3.ej13;

import ar.com.utn.progav1.ej13.metodos.MetodosPersona;
import ar.com.utn.progav1.ej13.pojo.Box;
import ar.com.utn.progav1.ej13.pojo.Persona;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*sobreescribir metodos tostring y hashcode poara Set*/
		/*sobreescribir metodos tostring y hashcode poara Set*/
		/*sobreescribir metodos tostring y hashcode poara Set*/
		/*sobreescribir metodos tostring y hashcode poara Set*/
		
		
		/*Interfaz List*/
		MetodosPersona mp = new MetodosPersona();
		List<Persona> lp = new ArrayList<Persona>();
		Set<Persona> sp = new HashSet<Persona>();
		Map<Integer, Persona> mapaP = new HashMap<Integer, Persona>();
		Persona p = new Persona();
		Persona p1 = new Persona();
		
		p.setNombre("pepe"); p.setApellido("apellido pepe"); p.setEdad(29);
		mp.agregarList(lp, p);
		mp.agregarSet(sp, p);

		p1.setNombre("pepde2"); p1.setApellido("apelligfdszdo pepe2"); p1.setEdad(28);
		mp.agregarList(lp, p1);
		mp.agregarSet(sp, p);

		for ( int i = 0 ; i < lp.size() ; i++ )
		{
			Persona p2 = null;
			p2 = (Persona) lp.get(i);

			System.out.println( p2.getNombre() + " " + p2.getApellido() + " " + p2.getEdad() );
		}
		
/*		Object[] lista = sp.toArray();
		for ( int i = 0 ; i < lista.length ; i++ )
		{
			Persona p3 = null;
			p3 = (Persona)lista[i];

			System.out.println( p3.getNombre() + " " + p3.getApellido() + " " + p3.getEdad() );
		}*/
		
		for ( Object o : sp.toArray() )
		{
			Persona p4 = (Persona)o;
			System.out.println(p4.toString());
			//System.out.println( p4.getNombre() + " " + p4.getApellido() + " " + p4.getEdad() );
		}
		
	
		Map <Integer, Persona> mapa = new HashMap();
		mapa.put(3, new Persona("nombrepp", "apellidopp", 30));
		System.out.println(mapa.get(3));
		
		Persona p5 = new Persona("nombrepp", "apellidopp", 310);
		
		mp.agregarMap(mapaP, 4, p5);
		
		System.out.println(mapaP.get(4));
		
		
		/*Generics*/
		Box<Number, String> b = new Box<Number, String>();
		
		Double d = new Double(12.456D);
		b.setObjeto(d);
		b.setObjStr("hola");
		
		System.out.println( b.getObjeto() );
		System.out.println( b.getObjStr() );
		

		
	}

}
 