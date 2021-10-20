package conversiones;

public class ConversionDeTipo {

	public static void main(String[] args) {
		
		// String a int primitivo
		String numeroStr = "50";
		int numeroInt = Integer.parseInt(numeroStr);
		System.out.println("numeroInt = " + numeroInt);
		
		// String a double
		String realStr = "98765.43";
		double realDouble = Double.parseDouble(realStr);
		System.out.println("Real a double = " + realDouble);
		
		// String a boolean
		String logicoStr = "true";
		boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
		System.out.println("Booleano = " + logicoBoolean);
		
		/* Convertimos de un primitivo a un String */
		int otroNumeroint = 100;
		System.out.println("otroNumeroInt = " + otroNumeroint);
		
		String otroNumeroStr = Integer.toString(otroNumeroint);
		System.out.println("otroNumeroStr = " + otroNumeroStr);
		
		// De primitivo a primitivo
		int numInt = 20000;
		// 
		short numShort = (short)numInt;
		System.out.println(numShort);
		
		long numLong = 350115L;
		int entero = (int)numLong;
		System.out.println(entero);
		
		float numeroFloat = (float)numInt;
		System.out.println(numeroFloat);
		
		

	}

}
