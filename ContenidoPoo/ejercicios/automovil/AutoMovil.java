package ejercicios.automovil;

public class AutoMovil {
	
	public String marca;
	public String modelo;
	public String color;
	public double precio;
	public String patente;
	
	public AutoMovil() {
		
	}
	
	public AutoMovil(String marca, String modelo, String color, double precio, String patente) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.patente = patente;
	}
	
	public void arrancar() {
		System.out.println("Arrancar");
	}
	
	public void detener() {
		System.out.println("Detener");
	}
	
	public void acelerar() {
		System.out.println("Acelerar");
	}
	
	public void verPrecio() {
		System.out.println("EL precio es: " + precio);
	}
	
	public void imprimirAutoMovil() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Color: " + color);
		System.out.println("Precio: " + precio);
		System.out.println("Patente: " + patente);
	}

}
