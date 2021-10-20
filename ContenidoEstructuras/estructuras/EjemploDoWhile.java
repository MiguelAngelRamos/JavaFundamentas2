package estructuras;

public class EjemploDoWhile {

	public static void main(String[] args) {
		int x = 1;
		
		do {
			System.out.println("Soy el do while");
			System.out.println(x);
			x++;
		} while(x < 100);
		
		
		// Si la condición no se cumple el "do while" en la parte del "do", se ejecuta al menos
		// una vez.
	}

}
