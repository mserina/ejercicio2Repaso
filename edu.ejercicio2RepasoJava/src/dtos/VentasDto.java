package dtos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Clase que almacena los campos y metodo de las ventas
 * msm - 051024
 */
public class VentasDto {

	int id; 
	int importe = 0;
	LocalDateTime fecha ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
	public VentasDto(int id, int importe, LocalDateTime fecha) {
		this.id = id;
		this.importe = importe;
		this.fecha =  fecha;
	}
	
	public VentasDto() {
		
	}
	
	
	@Override
	public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
		return "Venta numero: " + id + "\n" + "Euros: " + importe + "\n" +"Instante de compra: " + fecha.format(formatter);
	}
	
	
}
