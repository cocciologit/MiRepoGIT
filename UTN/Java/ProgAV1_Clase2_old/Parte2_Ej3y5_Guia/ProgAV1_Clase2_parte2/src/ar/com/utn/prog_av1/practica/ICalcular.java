package ar.com.utn.prog_av1.practica;

public interface ICalcular {
	
	/* sumar
	 * restar
	 * multiplicar
	 * dividir throw MiExcepcion
	 */
	
	public Double sumar(Number a, Number b);
	
	public Double restar(Number a, Number b);
	
	public Double multiplicar(Number a, Number b);
	
	public Double dividir(Number a, Number b) throws Exception;

}


