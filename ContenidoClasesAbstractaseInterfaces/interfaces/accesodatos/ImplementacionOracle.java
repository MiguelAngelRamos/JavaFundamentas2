package accesodatos;

public class ImplementacionOracle implements IAccesoDatos {

	@Override
	public void insertar() {
		System.out.println("Insertando datos desde ORACLE");
		
	}

	@Override
	public void listar() {
		System.out.println("Listando datos desde ORACLE");
		
	}

	@Override
	public void actualizar() {
		System.out.println("Actualizar datos desde ORACLE");
		
	}

	@Override
	public void eliminar() {
		System.out.println("Eliminar datos desde ORACLE");
		
	}

}
