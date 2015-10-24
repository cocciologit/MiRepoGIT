package ar.com.utn.progav1.ej18.testUnit;

import org.junit.Assert;
import org.junit.Test;

import ar.com.utn.progav1.ej18.MiHilo;

public class PrincipalTest 
{
	@Test
	public void testHilo()
	{
		
		Thread t1 = new Thread( new MiHilo(), "Hilo t1" );
		Thread t2 = new Thread( new MiHilo(), "Hilo t2" );
		Thread t3 = new Thread( new MiHilo(), "Hilo t3" );

		t1.start();
		t2.start();
		t3.start();
		
		while(true)
		{
			/*Boolean bT1 = t1.isAlive();
			Boolean bT2 = t2.isAlive();
			Boolean bT3 = t3.isAlive();
			
			Assert.assertEquals(true, bT1);
			Assert.assertEquals(true, bT2);
			Assert.assertEquals(true, bT3);*/
			
			if ( t1.isAlive() == false && t2.isAlive() == false && t3.isAlive() == false )
			{
				System.out.println("Terminaron");
				return;
			}
		}

	}

}
