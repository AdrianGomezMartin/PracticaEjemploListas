package vista;

import java.util.ArrayList;
import java.util.Arrays;

import clases.*;;

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
				"Mostrar empresa con más facturacion de la que se introduzca", "Eliminar Empresa", "Contratar Empleado",
				"Despedir Empleado", "Salir" };
		Empresa emp1 = new Empresa("Repsol", 200, 120000.56d, false);
		Empresa emp2 = new Empresa("Intel", 2000, 125600.87d, true);
		Empresa emp3 = new Empresa("Zara", 10000, 1400000.26d, false);
		Empresa emp4 = new Empresa("AMD", 1000, 500001.98d, true);
		Empresa emp5 = new Empresa("Campsa", 200, 100000.56d, false);
		Planta p1 = new Planta(1, new ArrayList<Empresa>(Arrays.asList(emp1, emp2)));
		Planta p2 = new Planta(2, new ArrayList<Empresa>(Arrays.asList(emp3)));
		Planta p3 = new Planta(3, new ArrayList<Empresa>(Arrays.asList(emp4)));
		Planta p4 = new Planta(4, new ArrayList<Empresa>(Arrays.asList(emp5)));
		Edificio ed1 = new Edificio(new Planta[] { p1, p2, p3, p4 });

		boolean salir = false;
		do {
			switch (Menu(opc)) {
			case 0:

				break;
			case 1:
				ed1.mostrarPlantasEmpresas();
				break;
			case 2:
				System.out.println(ed1.mostrarEmpresaMasFacturacion());
				break;
			case 3:
				System.out.println(ed1.mostrarEmpresaMasEmpleados());
				break;
			case 4:
				ed1.addEmpresa(Utilidades.rellenarEmpresa());
				break;
			case 5:
				ed1.addEmpresaOptimizado(Utilidades.rellenarEmpresa());
				break;
			case 6:
				ed1.mostrarEmpresasConMasFacturacionDeLaIntroducida();
				break;
			case 7:
				ed1.eliminarEmpresa();
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
