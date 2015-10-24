package ar.com.utn.prog_av1.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Interfaz List*/
		List<String> lista = new ArrayList<String>();
		lista.add("Elemento1");
		lista.add("elemento2");

		lista.add("Elemento3");

		for ( int i = 0 ; i < lista.size() ; i++ )
			System.out.println( lista.get(i) );


		Collections.sort(lista);
		for ( int i = 0 ; i < lista.size() ; i++ )
			System.out.println( lista.get(i) );

		
		lista.remove(0);
		
		for ( int i = 0 ; i < lista.size() ; i++ )
			System.out.println( lista.get(i) );
		
		/*Interfaz Set*/
		/*Retorna la cantida de elementos diferentes*/
		Set lis = new HashSet();
		lis.add("Hola");
		lis.add("Chau");
		lis.add("hola");

		System.out.println(lis.size());
		
	}

}
