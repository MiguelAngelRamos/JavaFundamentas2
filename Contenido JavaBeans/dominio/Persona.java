package dominio;

import java.io.Serializable;

public class Persona implements Serializable {
	
	private String nombre;
	private String apellido;
	
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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
}
