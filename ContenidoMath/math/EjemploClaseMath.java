package math;

public class EjemploClaseMath {

	public static void main(String[] args) {
		// Valor absoluto
		int absoluto = Math.abs(3);
		System.out.println("absoluto = " + absoluto);
		absoluto = Math.abs(-3);
		System.out.println("absoluto = " + absoluto);
		
		// EL máximo entre dos numeros
		double max = Math.max(3.5, 0.6);
		System.out.println(max);
		
		double min = Math.min(10, 20);
		System.out.println(min);
		
		// Redondear
		// Hacia Arriba
		double redondearUp = Math.ceil(3.5);
		System.out.println(redondearUp);
		
		// Hacia abajo
		double redondearDown = Math.floor(3.2);
		System.out.println(redondearDown);
		
		/* Redondear un valor en general hacia arriba o hacia abajo*/
		long entero = Math.round(3.2);
		System.out.println(entero);
		
		// Potencia
		double potencia = Math.pow(10, 2);
		System.out.println(potencia);
		// Raices
		double raiz = Math.sqrt(16);
		System.out.println("raiz = " + raiz);

	}

}
