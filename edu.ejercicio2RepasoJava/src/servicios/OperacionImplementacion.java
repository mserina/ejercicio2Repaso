package servicios;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import controladores.inicio;
import dtos.ProductoDto;
import dtos.VentasDto;
import utiles.Util;

/**
 * Contiene la logica de los metodos al servicio de operacion
 * msm - 051024
 */
public class OperacionImplementacion implements OperacionInterfaz{

	Scanner sc = controladores.inicio.sc;
	Util util = new Util();
	List<VentasDto> listaVentas = inicio.ventas;
	List<ProductoDto> listaProducto = inicio.producto;
	
	public void añadirVenta() {
		VentasDto nuevaVenta = new VentasDto();
		System.out.println("Inserte importe de la venta");
		nuevaVenta.setImporte(sc.nextInt());
		nuevaVenta.setId(util.idGeneratorVentas());
		nuevaVenta.setFecha(LocalDateTime.now());
		
		listaVentas.add(nuevaVenta);
		
		for(VentasDto venta : listaVentas) {
			System.out.println(" ");
			System.out.println(venta.toString());
			System.out.println(" ");
		}	
	}
	
	
	public void añadirPedido() {
		
		boolean cerrarCiclo = false;
		
		do {
			
			ProductoDto producto = new ProductoDto();
			
			System.out.println(" ");
			producto.setId(util.idGeneratorProducto());
			System.out.println("Inserte nombre del producto");
			producto.setNombreProducto(sc.next());
			System.out.println("Inserte cantidad del producto");
			producto.setCantidadProducto(sc.nextInt());
			System.out.println("Fecha estimada");
			String fechaString = sc.next();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			producto.setFechaEntrega(LocalDate.parse(fechaString, formato));
			System.out.println(" ");
			
			listaProducto.add(producto);
			
			System.out.println("Quieres seguir añadiendo clientes s/n");
			String respuesta = sc.next();
			
			if(respuesta.equals("n")){
				
				cerrarCiclo = true;
			}
			
		}while(!cerrarCiclo);
	
		
		for(ProductoDto producto : listaProducto) {
			System.out.println(" ");
			System.out.println(producto.toString());
			System.out.println(" ");
		}
	}
	
	
	public void mostrarVentasDia() {
		System.out.println("Inserte fecha (dd-MM-yyyy)");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaInsertada = LocalDate.parse(sc.next(),formato);
		
		for(VentasDto ventas : listaVentas) {
			if(ventas.getFecha().equals(fechaInsertada)) {
				System.out.println(ventas.toString());
			}
		}
		
	}
	
	
	public void calculoTotalVentas() {
		
		int contador = 0;
		System.out.println("Inserte fecha (dd-MM-yyyy)");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaInsertada = LocalDate.parse(sc.next(),formato);
		
		for(VentasDto ventas : listaVentas) {
			if(ventas.getFecha().toLocalDate().equals(fechaInsertada)) {
				contador += ventas.getImporte();	
			}
		}
		Duration diferenciaMinutos = Duration.between(listaVentas.getLast().getFecha(), listaVentas.getFirst().getFecha());
		
		System.out.println(" ");
		System.out.println("Importe Total: " + contador + "\n" + "Minutos: " + diferenciaMinutos.toMinutes());
		System.out.println(" ");
	}
}
