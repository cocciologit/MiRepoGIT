package ar.com.utn.progav1.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Principal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		MiClase mc = new MiClase();
		Class c = mc.getClass();
		Method[] m = null;
		
		try
		{
			m = c.getDeclaredMethods();
			
			for ( Method met : m )
			{
				System.out.println(met.getName() );
				if ( met.getName().equals("mostrar") )
				{
					Object[] vec = new Object[met.getParameterCount()];
					vec[0] = "Hola";
					vec[1] = 21L;

					/*Si el metodo es provado, puedo hacerlo accesible igualmente*/
					met.setAccessible(true);
					/*Si el metodo es privado, no puedo invocarlo*/
					met.invoke(mc, vec);
				}
			}
		}
		catch ( IllegalAccessException e )
		{
			e.printStackTrace();
		}
		catch ( IllegalArgumentException e )
		{
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
