package ar.com.utn.progav1.parte2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Principal 
{
	public static void main(String[] args)
	{
		/*Class clase = new Persona().getClass();*/
		/* o */
		
		/*clase2 va a ser una clase de tipo Persona*/
		Class clase2 = Persona.class;
		
		/*Obtengo los atributos de esa clase*/
		Field[] vecField = clase2.getFields();
		System.out.println(vecField.length);
		
		/*Obtengo los metodos de accesibles desde fuera de esa clase tambien*/
		Method[] vecField2 = clase2.getMethods();
		for (Method m : vecField2)
			System.out.println(m.getName());
		
		Persona p = new Persona();
		p.setNombrePersona("pepito");
		
		try
		{
			/*obtengo el metodo getNombre de la instancia de Persona*/
			Method m2 = p.getClass().getMethod("getNombrePersona");
			/*invoco p sobre el metodo m2*/
			System.out.println(m2.invoke(p, null));
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		
		
		/*INTEGRADOR*/
		Persona p2 = new Persona();
		p2.setIdPersona(1);
		p2.setNombrePersona("ignacio");
		p2.setDescPersona("persona");
		
		Class pers = Persona.class;
		/*Obtengo atributos de una clase que son accesibles desde afuera (publicos)*/
		Field[] attrPersona = pers.getFields();
		
		/*Obtengo los attrs de una clase que son accesibles para la case (-, +, #)*/
		/*Field[] attrPersona = pers.getDeclaredFields();*/
		
		for ( Field field : attrPersona )
		{
			String attr = field.getName();
			String attrFinal = "get" + attr.substring(0, 1).toUpperCase() + attr.substring(1, attr.length());
			System.out.println( attrFinal );
				try {
					/*Obtengo metodo armado como string de la clase*/
					Method m3 = p2.getClass().getMethod( attrFinal );
					/*el metodo que referencia m3 debe estar dentro de la clase p2*/
					/*El segundo parametro "null" es para el parametro que reciba el metodo (set)*/
					System.out.println(m3.invoke(p2, null));
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch ( IllegalAccessException e ){
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
	}
}
