package ejercicios.encapsulamiento.persona;

public class Persona {
	
	private String nombre;
	private int edad;
	private static int contadorPersonas;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contadorPersonas++;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static int getContadorPersonas() {
		return contadorPersonas;
	}
	
	public static void setContadorPersonas(int contadorPersonas) {
		Persona.contadorPersonas = contadorPersonas;
	}

}
