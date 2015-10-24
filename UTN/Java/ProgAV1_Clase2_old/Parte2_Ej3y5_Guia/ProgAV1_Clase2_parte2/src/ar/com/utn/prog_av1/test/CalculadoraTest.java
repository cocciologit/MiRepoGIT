package ar.com.utn.prog_av1.test;

import org.junit.Test;

import ar.com.utn.prog_av1.practica.ICalcular;

public class CalculadoraTest implements ICalcular {

	@Override
	@Test
	public Double sumar(Number a, Number b) {
		// TODO Auto-generated method stub
		return (a.doubleValue() + b.doubleValue());
	}

	@Override
	@Test
	public Double restar(Number a, Number b) {
		// TODO Auto-generated method stub
		return (a.doubleValue() - b.doubleValue());
	}

	@Override
	@Test
	public Double multiplicar(Number a, Number b) {
		// TODO Auto-generated method stub
		return (a.doubleValue() * b.doubleValue());
	}

	@Override
	@Test
	public Double dividir(Number a, Number b) throws Exception {
		// TODO Auto-generated method stub
		if ( b.doubleValue() == 0D )
		{
			throw new Exception();
		}

		return (a.doubleValue() / b.doubleValue());
	}	

}
