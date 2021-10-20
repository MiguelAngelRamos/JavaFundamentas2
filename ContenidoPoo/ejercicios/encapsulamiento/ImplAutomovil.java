package ejercicios.encapsulamiento;

public class ImplAutomovil {

	public static void main(String[] args) {
		
		AutoMovil auto1 = new AutoMovil();
		auto1.descuento = 300;
		auto1.setMarca("Hyundai");
		auto1.setModelo("Elantra");
		auto1.setPatente("AFAF33");
		auto1.setPrecio(20000);
		
		AutoMovil auto2 = new AutoMovil();
		
		auto2.setMarca("Ford");
		auto2.setModelo("Mustang");
		auto2.setPatente("AFF343");
		auto2.setPrecio(30000);
		
		System.out.println(auto1.getMarca());
		System.out.println(auto1);
		
		
		System.out.println(auto2.getMarca());
		System.out.println(auto2);
		
		// Un atributo static: No es especifico de cada objeto. Solo existe una copia del mismo y su valor es compartido por todos los objetos
		// de la clase. ( se podria considerar una variable global a la que tienen acceso todos los objetos

	}

}
