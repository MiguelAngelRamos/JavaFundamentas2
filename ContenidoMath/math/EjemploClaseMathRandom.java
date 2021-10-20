package math;

public class EjemploClaseMathRandom {

	public static void main(String[] args) {
		
		String [] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"}; 
		
		double random = Math.random(); // genera un numero aleatorio decimal del 0 al 1, sin incluir 1
		System.out.println(random);
		// System.out.println(colores.length);
		// random = random * colores.length;
		random *= colores.length;
		System.out.println(random);
		
		// para redondear hacia abajo
		random = Math.floor(random);
		System.out.println("random = " + random);
		System.out.println("random = " + (int)random);
		
		// acceder al arreglo por medio de su indice
		System.out.println("colores = " + colores[(int)random]);
				

	}

}
