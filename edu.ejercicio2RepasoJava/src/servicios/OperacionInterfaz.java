package servicios;

/**
 * Contiene la cabezera de los metodos del servicio del operacion
 * msm - 05102024
 */
public interface OperacionInterfaz {

	/**
	 * Metodo que añade las ventas
	 * msm - 061024
	 */
	public void añadirVenta();
	
	/**
	 * Metodo que añade productos a un pedido
	 * msm - 061024
	 */
	public void añadirPedido();
	
	/**
	 * Metodo que muestra las ventas del dia
	 * msm - 061024
	 */
	public void mostrarVentasDia();
	
	/**
	 * Meotod que obtiene el calculo total de las ventas del dia
	 * msm - 061024
	 */
	public void calculoTotalVentas();
}
