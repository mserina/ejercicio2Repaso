package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import controladores.inicio;

/**
 * Contiene la logica de los metodos al servicio de menu
 * msm - 051024
 */
public class MenuImplementacion implements MenuInterfaz {

	public static inicio i = new inicio();
	Scanner sc = controladores.inicio.sc;
	OperacionInterfaz op = new OperacionImplementacion();

	public byte mostrarMenuPrincipal() {
		byte opcionUsuario = 0;

		System.out.println(" ");
		System.out.println("MENU PRINCIPAL");
		System.out.println("--------------");
		System.out.println("0[] CERRAR MENU");
		System.out.println("1[] MENU EMPLEADO");
		System.out.println("2[] MENU GERENTE");
		System.out.println(" ");

		opcionUsuario = sc.nextByte();
		return opcionUsuario;
	}

	private byte mostrarMenuGerente() {
		byte opcionUsuario = 0;

		System.out.println(" ");
		System.out.println("MENU GERENTE");
		System.out.println("--------------");
		System.out.println("0[] CERRAR MENU");
		System.out.println("1[] MOSTRAR VENTAS DEL DIA");
		System.out.println("2[] CREAR NUEVO PEDIDO PARA PROVEEDORES");
		System.out.println(" ");

		opcionUsuario = sc.nextByte();
		return opcionUsuario;
	}
	
	private byte mostrarMenuEmpleado() {
		byte opcionUsuario = 0;

		System.out.println(" ");
		System.out.println("MENU EMPLEADO");
		System.out.println("--------------");
		System.out.println("0[] CERRAR MENU");
		System.out.println("1[] CALCULO TOTAL DE VENTAS");
		System.out.println("2[] AÑADIR VENTAS");
		System.out.println(" ");

		opcionUsuario = sc.nextByte();
		return opcionUsuario;
	}
	

	public void menuGerente() throws IOException{
		byte opcionUsuario = 0;
		boolean cerrarMenu = false;


		do {

			opcionUsuario = mostrarMenuGerente();
			switch (opcionUsuario) {
			case 0:
				i.escrituraArchivo = new FileWriter(i.rutaLog, true);
				i.escrituraArchivo.write("Se ha cerrado el menu de gerente" + "\n");
				i.escrituraArchivo.close();
				cerrarMenu = true;
				break;
			case 1:
				i.escrituraArchivo = new FileWriter(i.rutaLog, true);
				i.escrituraArchivo.write("Se ha seleccionado Ventas del Dia" + "\n");
				i.escrituraArchivo.close();
				op.mostrarVentasDia();
				cerrarMenu = true;
				break;
			case 2:
				i.escrituraArchivo = new FileWriter(i.rutaLog, true);
				i.escrituraArchivo.write("Se ha seleccionado añadir Pedido " + "\n");
				i.escrituraArchivo.close();
				op.añadirPedido();
				cerrarMenu = true;
				break;

			default:
				System.out.println("ESA OPCION NO EXISTE");
				break;
			}

		} while (!cerrarMenu);
	}
	
	public void menuEmpleado() throws IOException{
		byte opcionUsuario = 0;
		boolean cerrarMenu = false;
		

		do {

			opcionUsuario = mostrarMenuEmpleado();
			switch (opcionUsuario) {
			case 0:
				i.escrituraArchivo = new FileWriter(i.rutaLog, true);
				i.escrituraArchivo.write("Se ha cerrado el menu de empleado" + "\n");
				i.escrituraArchivo.close();
				cerrarMenu = true;
				break;
			case 1:
				i.escrituraArchivo = new FileWriter(i.rutaLog, true);
				i.escrituraArchivo.write("Se ha seleccionado calculo total de ventas" + "\n");
				i.escrituraArchivo.close();
				op.calculoTotalVentas();
				cerrarMenu = true;
				break;
			case 2:
				i.escrituraArchivo = new FileWriter(i.rutaLog, true);
				i.escrituraArchivo.write("Se ha seleccionado añadir ventas" + "\n");
				i.escrituraArchivo.close();
				op.añadirVenta();
				cerrarMenu = true;
				break;

			default:
				System.out.println("ESA OPCION NO EXISTE");
				break;
			}

		} while (!cerrarMenu);
	}

}
