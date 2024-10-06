package controladores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import dtos.ProductoDto;
import dtos.VentasDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/**
 * Clase principal del programa
 * msm - 051024
 */
public class inicio {

	/**
	 * Clase que se encarga de controlar el recorrido de la aplicacion
	 * msm - 051024
	 * @param args
	 */
	public static Scanner sc = new Scanner (System.in);
	public static ArrayList<VentasDto> ventas = new ArrayList<VentasDto>();
	public static ArrayList<ProductoDto> producto = new ArrayList<ProductoDto>();
	public static String rutaLog = "C:\\Users\\Alumno\\Desktop\\archivoLog.txt";
	public static FileWriter escrituraArchivo;
	public static BufferedWriter contenidoArchivo;
	
	public static void main(String[] args) {
		
		byte opcionUsuario = 0;
		boolean cerrarMenu = false;
		
		MenuInterfaz mi = new MenuImplementacion();
		
		do {
			try {
				opcionUsuario = mi.mostrarMenuPrincipal();	
				switch(opcionUsuario) {
				case 0:
					escrituraArchivo = new FileWriter(rutaLog, true);
					escrituraArchivo.write("Se ha cerrado la aplicacion" + "\n");
					escrituraArchivo.close();
					cerrarMenu = true;
					break;
				case 1:
					escrituraArchivo = new FileWriter(rutaLog, true);
					escrituraArchivo.write("Se ha seleccionado el menu empleado" + "\n");
					escrituraArchivo.close();
					mi.menuEmpleado();
					break;
				case 2:
					escrituraArchivo = new FileWriter(rutaLog, true);
					escrituraArchivo.write("Se ha elegido el menu de gerente" + "\n");
					escrituraArchivo.close();
					mi.menuGerente();
					break;
				
				default:
					System.out.println("ESA OPCION NO EXISTE");
					break;
				}	
				
			}catch(IOException io) {
				
				System.out.println("ErrorIO[!]: " + io.getMessage());
				
			}catch(Exception ex) {
				
				System.out.println("Error[!]: " + ex.getMessage());
				
			}
		}while(!cerrarMenu);
	}
}
