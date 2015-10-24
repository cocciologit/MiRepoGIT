package ar.com.utn.progav1.clase7.principal;

public interface IEstado {
	
	public void cambiarAIngreso(Alumno alumno);
	public void cambiarAERegular(Alumno alumno);
	public void cambiarAIrregular(Alumno alumno);
	public void cambiarARecibido(Alumno alumno);
	public void cambiarAFinalizado(Alumno alumno);

}
