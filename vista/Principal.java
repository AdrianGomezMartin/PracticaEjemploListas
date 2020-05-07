package vista;

import java.util.Scanner;

import clases.Utilidades;

public class Principal {
	

	
	public static short Menu(String[] opciones) {
		for (int i = 0; i < opciones.length; i++) {
			System.out.println(i + "-.  " + opciones[i].toString());
		}
		System.out.println(
				"|--------------------------------------------------------------------------------------------|");
		System.out.println("|   Introduzca el numero correspondiente a la opcion:        |");
		System.out.println(
				"|--------------------------------------------------------------------------------------------|");
		return Utilidades.pedirOpcion("");
	}

	public static void main(String[] args) {
		String[] opc = { "Rellenar Plantas", "Mostrar Planta y Empresas", "Mostrar empresa que más factura",
				"Mostrar empresa con más empleados", "Añadir empresa",
				"Añadir empresa Optimizado(Sobrescribir la que tenga menos empleados)",
				"Mostrar empresa con más facturacion de (UI)", "Eliminar Empresa", "Contratar Empleado",
				"Despedir Empleado", "Salir" };
		boolean salir = false;
		do {
			switch (Menu(opc)) {
			case 0:

				break;
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:
				salir = true;
				break;
			}
		} while (!salir);
	}
}
