package ar.com.utn.progav1.reflection.tppag82;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import ar.com.utn.progav1.reflection.tppag82.pojo.Persona;
import ar.com.utn.progav1.reflection.tppag82.utilidades.UBean;

public class Principal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List<Field> listadoAttrs = new ArrayList<Field>();
		Persona persona = new Persona();

		UBean ub = new UBean();
		
		listadoAttrs = UBean.obtenerAtributos(persona);
		
		for ( Field field : listadoAttrs )
			System.out.println(field.getName());

		/*Getter*/
		for ( Field field : listadoAttrs )
		{
			System.out.println( field.getName().substring(0,  1).toUpperCase() + field.getName().substring(1, field.getName().length()) );
			System.out.println( ub.ejecutarGet(persona, field.getName().substring(0,  1).toUpperCase() + field.getName().substring(1, field.getName().length()) ) );
		}

		/*Setter - probar*/
		
	
	
	
	}

}
