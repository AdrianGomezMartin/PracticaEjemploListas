package vista;



import clases.*;

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

		Edificio ed1 = new Edificio();

		boolean salir = false;
		do {
			switch (Menu(opc)) {
			case 0:
				ed1.crearEstructuraCompleta();
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
				ed1.contratarEmpleado();
				break;
			case 9:
				ed1.despedirEmpleado();
				break;
			case 10:
				salir = true;
				break;
			}
		} while (!salir);
	}
}
