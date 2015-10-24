package ar.com.utn.prog_av1.practica;

public class Calculadora implements ICalcular {

	@Override
	public Double sumar(Number a, Number b) {
		// TODO Auto-generated method stub
		return (a.doubleValue() + b.doubleValue());
	}

	@Override
	public Double restar(Number a, Number b) {
		// TODO Auto-generated method stub
		return (a.doubleValue() - b.doubleValue());
	}

	@Override
	public Double multiplicar(Number a, Number b) {
		// TODO Auto-generated method stub
		return (a.doubleValue() * b.doubleValue());
	}

	@Override
	public Double dividir(Number a, Number b) throws exceptionZeroDivide, Exception {
		// TODO Auto-generated method stub
		if ( b.doubleValue() == 0D )
		{
			throw new exceptionZeroDivide();
		}

		return (a.doubleValue() / b.doubleValue());
	}	

}
