package ar.com.utn.progav1.clase7.principal;

public class Irregular implements IEstado
{

	@Override
	public void cambiarAIngreso(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarAERegular(Alumno alumno) {
		// TODO Auto-generated method stub
		alumno.setEstado(new ERegular());
		System.out.println("Cambio a estado ERegular");		
	}

	@Override
	public void cambiarAIrregular(Alumno alumno) {
		// TODO Auto-generated method stub
	}

	@Override
	public void cambiarARecibido(Alumno alumno) {
		// TODO Auto-generated method stub
	}

	@Override
	public void cambiarAFinalizado(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}

}
