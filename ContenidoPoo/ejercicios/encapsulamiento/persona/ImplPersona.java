package ejercicios.encapsulamiento.persona;

public class ImplPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("Miguel Ramos", 38);
		Persona p2 = new Persona("Catalina Gonzalez", 35);
		Persona p3 = new Persona("Rocky Balboa", 32);
		
		System.out.println("El total de personas: " + Persona.getContadorPersonas());

	}

}
