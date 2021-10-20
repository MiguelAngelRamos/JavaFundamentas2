package arreglos.recorrer;

public class RecorrerArreglos {

	public static void main(String[] args) {
		int [] numeros = {303,151,14}; // 3
		int [] numbers = new int[3];
		// Recorrer un Arreglo
		
		for(int i=0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		// rellenar el arreglo
		for(int y=0; y < numbers.length; y++) {
			numbers[y] = y;
		}
		
		// imprimos los valores
		for(int y=0; y < numbers.length; y++) {
			System.out.println(numbers[y]);
		}
		
	}

}
