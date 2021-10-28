package claseabstracta;

public class EjecutandoAbstract {

	public static void main(String[] args) {
		// FiguraGeometrica figura = new FiguraGeometrica(); no se puede crear una instancia de una clase Abstracta
		
		// Estamos generando un código mas generico
		//Rectangulo r = new Rectangulo("Rectangulo");
		FiguraGeometrica figura = new Rectangulo("Rectangulo");
		
		/*
		 * Cuando la clase de declaración es padre (FiguraGeometrica figura) y 
		 * el objeto se crea desde el hijo (new Rectangulo("Rectangulo"), se produce una conversion implicita que es
		 * "UpCasting"
		 */
		figura.dibujar(); // ambas clases tiene el mismo método se va ejecutar la clase con menos jerarquia
		
		// De hecho ni siquiera el método dibujar de la clase padre se podria implementar por que es abstracto.
		
	}

}
