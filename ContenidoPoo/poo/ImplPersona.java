package poo;

public class ImplPersona {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Pedro", 18, 'M');
		persona.imprimirInformacion();
		
		Persona personaDos = new Persona("Maria", 20, 'F');
		personaDos.imprimirInformacion();
		persona.bailar(personaDos);
		
		Persona personaTres = new Persona();
		personaTres.nombre = "Ricardo";
	

	}

}
