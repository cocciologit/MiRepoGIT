package ar.com.utn.progav1.reflection.tppag82.utilidades;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import ar.com.utn.progav1.reflection.tppag82.anotaciones.Test2;
import ar.com.utn.progav1.reflection.tppag82.pojo.Persona;

//@Test2
public class UBean 
{
//	@Test2
	private String atributo;

	public static ArrayList<Field> obtenerAtributos(Object objeto)
	{
		ArrayList<Field> vecFields = new ArrayList<Field>();
		
		for ( Field f : objeto.getClass().getFields() )
		{
			vecFields.add(f);
		}

		return vecFields;
	}/*obtenerAtributos*/
	
	//El metodo se ejecutara tres veces
	public static void ejecutarSet(Object objeto, String attr, Object vec)
	{
		//Object obj = objeto;
		Class c = objeto.getClass();
		Method m = null;

		try {
			
			System.out.println(attr + " - " + vec + " " + objeto );
			
			m = c.getMethod( "set" + attr, vec.getClass());
			m.invoke( objeto, vec);

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}/*ejecutarSet*/
	
	public static Object ejecutarGet(Object objeto, String attr)
	{
		//Object objeto = obj;
		Class c = objeto.getClass();
		Method m = null;
		
		Object ret = null;
		
		try
		{
			m = c.getMethod("get" + attr);
			ret = m.invoke(objeto, null);
		}
		catch ( IllegalArgumentException e )
		{
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
		
	}/*ejecutarGet*/
	
	
	

}
