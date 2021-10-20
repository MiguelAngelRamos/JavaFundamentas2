package estructuras;

public class EjemploIf {
	
	public static void main(String[] args) {
		/* Supongamos que una persona desea ver una pelicula
		 * La pelicula tiene como requisito ser mayor de edad (Mayor 18)
		 */
		int edad = 7;
		System.out.println(edad >= 18);
		
		if(edad >=18) {
			System.out.println("Es mayor de edad");
			System.out.println("Tienes acceso a ver la pelicula");
			// cuando la condicion es verdadera
		} else if (edad <=8) {
			System.out.println("Informar a sus padres y no permitir la entrada");
		} else {
			System.out.println("Solo se permiten mayores de edad");
		}
	}

}
