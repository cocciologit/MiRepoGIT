package ar.com.utn.progav1.reflection.tppag82.utilidades;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import ar.com.utn.progav1.reflection.tppag82.anotaciones.Test2;

//@Test2
public class UBean 
{
//	@Test2
	private String atributo;

	public static ArrayList<Field> obtenerAtributos(Object objeto)
	{
		ArrayList<Field> vecFields = new ArrayList<Field>();
		
		for ( Field f : objeto.getClass().getDeclaredFields() )
		{
			vecFields.add(f);
		}

		return vecFields;
	}/*obtenerAtributos*/
	
	//El metodo se ejecutara tres veces
	@Test2(i = 3, nombre = "testEjecutarSet")
	public static void ejecutarSet(Object objeto, String attr, Object valor)
	{
		Object obj = objeto;
		Class c = obj.getClass();
		Method m = null;
		
		try {
			m = c.getMethod("set" + attr);
			m.invoke(objeto, valor);
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
	
	public static Object ejecutarGet(Object obj, String attr)
	{
		Object objeto = obj;
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
