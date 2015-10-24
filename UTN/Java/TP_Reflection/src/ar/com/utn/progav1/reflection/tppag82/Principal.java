package ar.com.utn.progav1.reflection.tppag82;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import ar.com.utn.progav1.reflection.tppag82.pojo.Persona;
import ar.com.utn.progav1.reflection.tppag82.utilidades.UBean;

import ar.com.utn.progav1.reflection.tppag82.anotaciones.Test2;

public class Principal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List<Field> listadoAttrs = new ArrayList<Field>();
		Persona persona = new Persona();
		
		UBean ub = new UBean();
		
		listadoAttrs = UBean.obtenerAtributos(persona);
		
/*		for ( Field field : listadoAttrs )
			System.out.println(field.getName());*/

		/*Getter*/
		System.out.println("Getters...");
		for ( Field field : listadoAttrs )
		{
			System.out.println( "get" + field.getName().substring(0,  1).toUpperCase() + field.getName().substring(1, field.getName().length()) );
			System.out.println( UBean.ejecutarGet(persona, field.getName().substring(0,  1).toUpperCase() + field.getName().substring(1, field.getName().length()) ) );
		}

		/*Setter*/
		System.out.println("Setters...");
		Object[]vec = new Object[4];
		
		vec[0] = 1L;
		vec[1] = "Ignacio";
		vec[2] = "Cocciolo";
		vec[3] = 31884457L;

		int i = 0;
		for ( Field field : listadoAttrs )
		{
			System.out.println( "set" + field.getName().substring(0,  1).toUpperCase() + field.getName().substring(1, field.getName().length()) + "("+ vec[i] + ")" );
			UBean.ejecutarSet( persona
						      ,field.getName().substring(0,  1).toUpperCase() + field.getName().substring(1, field.getName().length())
						      ,vec[i]
						      );
			i++;
		}
		
		
		/*Getter*/
		for ( Field field : listadoAttrs )
		{
			System.out.println( field.getName().substring(0,  1).toUpperCase() + field.getName().substring(1, field.getName().length()) );
			System.out.println( UBean.ejecutarGet(persona, field.getName().substring(0,  1).toUpperCase() + field.getName().substring(1, field.getName().length()) ) );
		}
		
		/************************/
		/*fuera del TP Pag 82: Creacion de anotaciones propias y consultar metodos con alguna anotacion en particular*/
		Method[] metodosTest = ub.getClass().getMethods();
		for ( Method m : metodosTest )
		{
			Test2 an = (Test2) m.getAnnotation(Test2.class);
			if ( an != null )
			{
				/*Obtengo los valores asignados en la annotation mia*/
				int repe = an.i();
				String nomMetodoAnnotation = an.nombre();
				
				System.out.println(repe + " " + nomMetodoAnnotation);

				System.out.println("Metodo " + m.getName() + " tiene la Annotation propia @Test2");
			}
		}

	}

}
