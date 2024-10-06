package dtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Clase que almacena los campos y metodo de las productos
 * msm - 051024
 */
public class ProductoDto {

	//campos
		int id;
		String nombreProducto = "aaa";
		int cantidadProducto = 0;
		LocalDate fechaEntrega;
		
		//getters and setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombreProducto() {
			return nombreProducto;
		}
		public void setNombreProducto(String nombreProducto) {
			this.nombreProducto = nombreProducto;
		}
		public int getCantidadProducto() {
			return cantidadProducto;
		}
		public void setCantidadProducto(int cantidadProducto) {
			this.cantidadProducto = cantidadProducto;
		}
		public LocalDate getFechaEntrega() {
			return fechaEntrega;
		}
		public void setFechaEntrega(LocalDate fechaEntrega) {
			this.fechaEntrega = fechaEntrega;
		}
		
		
		//contructores
		
		public ProductoDto(int id, String nombreProducto, int cantidadProducto, LocalDate fechaEntrega) {
			
			this.id = id;
			this.nombreProducto = nombreProducto;
			this.cantidadProducto = cantidadProducto;
			this.fechaEntrega = fechaEntrega;
		}
		
		public ProductoDto() {
			
		}
		
		//toString 
		@Override
		public String toString() {
			
			
			
			return "Producto: " + nombreProducto + "\n"+ 
				   "Cantidad del producto: " + cantidadProducto + "\n"+
				   "Fecha entrega: " + fechaEntrega;
		}
		
	
}
