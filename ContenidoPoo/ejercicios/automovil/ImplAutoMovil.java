package ejercicios.automovil;

public class ImplAutoMovil {
	
	public static void main(String[] args) {
		
		// CREAR UNA INSTANCIA DE LA CLASE AUTOMOVIL (2 objetos Automovil)
		
		// VAN ASIGNARLE VALORES A LA PROPIEDADES
		// CON CONSTRUCTOR(TIENE QUE SER CON TODOS LOS PARAMETROS) Y SIN CONTRUCTOR
		
		// MÉTODO QUE IMPRIMA TODAS LAS PROPIEDADES
		
		AutoMovil auto1 = new AutoMovil();
		auto1.marca = "Ford";
		auto1.modelo = "Mustang";
		auto1.color = "Azul";
		auto1.precio = 20000000;
		auto1.patente = "A3F114";
		auto1.imprimirAutoMovil();
		
		AutoMovil auto2 = new AutoMovil();
		auto2.marca = "Hyundai";
		auto2.modelo = "Elantra";
		auto2.color = "Negro";
		auto2.precio = 600000;
		auto2.patente = "A5FF31";
		auto2.imprimirAutoMovil();
		
		
		
		
	}
}
