package servicios;

import java.io.IOException;

/**
 * Contiene la cabezera de los metodos del servicio del menu
 * msm - 05102024
 */
public interface MenuInterfaz {

	/**
	 * Muestra el menu y recoge la respueta del usuario
	 * msm - 051024
	 * @return la respuesta del usuario
	 */
	public byte mostrarMenuPrincipal();
	
	
	//logicas
	/**
	 * Contiene la logica del menu de gerentes
	 * msm - 051024
	 */
	public void menuGerente() throws IOException;
	
	/**
	 * Contiene la logica del menu de empleados
	 * msm - 051024
	 */
	public void menuEmpleado() throws IOException; 
}
