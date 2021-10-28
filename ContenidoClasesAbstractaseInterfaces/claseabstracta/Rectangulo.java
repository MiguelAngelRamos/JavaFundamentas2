package claseabstracta;

public class Rectangulo extends FiguraGeometrica{

	Rectangulo(String tipoFigura) {
		super(tipoFigura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar() {
		// se imprime el tipo de la clase this.getClass() y con getSimpleName() se imprime el nombre
		System.out.println("Se imprime un: " + this.getClass().getSimpleName());
		
	}



}
