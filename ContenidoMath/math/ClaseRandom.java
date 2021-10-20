package math;

import java.util.Random;

public class ClaseRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};// longitud 6
		Random randomObj = new Random();
		
		int randomInt = randomObj.nextInt();
		System.out.println("randomInt: " +randomInt);
		
		// vamos a generar valores del 0 al 6 pero sin incluir el 6
		int randomIntParams = randomObj.nextInt(colores.length);
		System.out.println(randomIntParams);
		
		// Obtengo el color por su indice aleatorio
		System.out.println("random color: " + colores[randomIntParams]);
		
		// ejemplo de un numero entre 15 y 25
		int randomIntRango = 15 + randomObj.nextInt(25-15);
		System.out.println(randomIntRango);

	}

}
