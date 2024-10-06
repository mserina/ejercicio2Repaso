package utiles;

import java.util.List;

import controladores.inicio;
import dtos.ProductoDto;
import dtos.VentasDto;

public class Util {

	
	public int idGeneratorProducto() {
		List<ProductoDto> producto = inicio.producto;
		
		int listaTamanoProducto = producto.size() -1;	
		int idNuevo = 0;
		
		if(listaTamanoProducto > 0) {
			idNuevo = producto.get(listaTamanoProducto).getId() + 1;
		}
		else {
			idNuevo = 0;
		}
		
		return idNuevo;
	}
	
	public int idGeneratorVentas() {
		List<VentasDto> ventas = inicio.ventas;
		
		int listaTamanoVentas = ventas.size() -1;	
		int idNuevo = 0;
		
		if(ventas.size() > 0) {
			idNuevo = ventas.get(listaTamanoVentas).getId() + 1;
		}
		else {
			idNuevo = 1;
		}
		
		return idNuevo;
	}
}
