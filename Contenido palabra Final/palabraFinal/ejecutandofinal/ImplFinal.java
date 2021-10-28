package ejecutandofinal;

import dominio.Persona;

public class ImplFinal {

	public static void main(String[] args) {
		// Persona.MI_CONSTANTE = 20;
		System.out.println(Persona.MI_CONSTANTE);
		Persona p1 = new Persona();
		p1.setNombre("Miguel");
		/*Final en objetos no puedo asignar una nueva referencia (instancia) de persona
		 * final Persona p1 = new Persona();
		 * */
		p1 = new Persona();
		
	}

}
