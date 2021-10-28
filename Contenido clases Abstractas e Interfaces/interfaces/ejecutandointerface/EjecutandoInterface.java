package ejecutandointerface;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;

public class EjecutandoInterface {

	public static void main(String[] args) {
		/*
		 * Recordar que las interfaces se implementan cuando hay funcionalidad o comportamiento en comun
		 * */
		
		//IAccesoDatos datos = new IAccesoDatos(); No se puede crear objetos de una interface
		
		/* Uno de los objetivos de la POO es hacer código lo mas generico posible
		 * En caso vamos definir tipos Interface (IAccesoDatos datos) y estos tipos van apuntar objetos y a las clases
		 * que hayan implementado esta interface
		 * */
		IAccesoDatos datos  = new ImplementacionMySql();
		actualizar(datos);
		
		datos = new ImplementacionOracle();
		actualizar(datos);

	} // main
	
	public static void actualizar(IAccesoDatos datos) {
		datos.actualizar();
	}

}
