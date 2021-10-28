package dominio;
/* si una clase tiene la palabra final no se podra usar como clase padre
 ni heredar de ella (public final class Persona) */

public class Persona {
	
	private String nombre;
	public final static int MI_CONSTANTE = 1;
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/* si un método contiene la palabra final, no se podra
	 * sobre escribir en clases hijas
	 * public final void bailar()
	 */

	public void bailar() {
		System.out.println("Método bailar");
	}
	
}
