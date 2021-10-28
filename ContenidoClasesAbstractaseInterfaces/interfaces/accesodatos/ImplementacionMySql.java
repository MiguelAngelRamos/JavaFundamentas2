package accesodatos;

/*
 * Implementamos la interface, pero si no queremos implementar los m�todos en esta clase
 * tenemos que definir esta clase como abstracta
 * public abstract class ImplementacionMySql implements IAccesoDatos
 * 
 * Pero las clases que hereden de ImplementacionMysql si tienen que implementar los m�todos
 * de la interface IAccesoDatos
 */
public class ImplementacionMySql implements IAccesoDatos{

	@Override
	public void insertar() {
		System.out.println("Insertar datos desde Mysql");
		
	}

	@Override
	public void listar() {
		System.out.println("Listar datos desde Mysql");
		
	}

	@Override
	public void actualizar() {
		System.out.println("Actualizar datos desde Mysql");
		
	}

	@Override
	public void eliminar() {
		System.out.println("Eliminar datos desde Mysql");
		
	}




}
