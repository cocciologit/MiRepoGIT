package ar.com.utn.progav1.reflection.tppag82.pojo;
import ar.com.utn.progav1.reflection.tppag82.anotaciones.*;

@Tabla(nombre="personas")
public class Persona 
{
	@Id(nombre="id")
	@Columna(nombre="id")
	public Long id;
	
	@Columna(nombre="nombre")
	public String nombre;
	
	@Columna(nombre="apellido")
	public String apellido;
	
	@Columna(nombre="dni")
	public Long dni;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}

}
