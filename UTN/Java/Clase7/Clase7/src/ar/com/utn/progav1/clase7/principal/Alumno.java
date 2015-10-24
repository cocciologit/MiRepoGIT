package ar.com.utn.progav1.clase7.principal;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int legajo;
	private String carrera;
	private IEstado estado;

	public Alumno() {
		this.estado = new Ingreso();
	}
	
	public Alumno(String nombre, String apellido, int legajo, String carrera) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.carrera = carrera;
		this.estado = new Ingreso();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public IEstado getEstado() {
		return estado;
	}

	public void setEstado(IEstado estado) {
		this.estado = estado;
	}	

}
