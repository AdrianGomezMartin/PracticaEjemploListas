package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utilidades {

	public static String pedirCadena(String enunciado) {
		System.out.println(enunciado);
		return dameScanner().nextLine();
	}

	public static short pedirOpcion(String texto) {
		System.out.println(texto);
		return dameScanner().nextShort();
	}

	public static int pedirEntero(String texto) {
		System.out.println(texto);
		return dameScanner().nextInt();
	}

	public static double pedirDouble(String texto) {
		System.out.println(texto);
		return dameScanner().nextDouble();
	}

	public static Empresa rellenarEmpresa() {
		return new Empresa(pedirCadena("Nombre?"), pedirEntero("Numero Empleados?"), pedirDouble("Facturacion?"),
				(pedirCadena("Tecnologica(S/n)").equalsIgnoreCase("S") ? true : false));
	}

	public static Planta rellenarPlanta() {
		Empresa [] empresas  = new Empresa[ pedirEntero("Cuantas empresas va a introducir en la planta?")];
		for (int i = 0; i < empresas.length; i++) {
			empresas[i] = rellenarEmpresa();
		}
		return new Planta(pedirEntero("Introduce el numero de la planta"), new ArrayList<Empresa>(Arrays.asList(empresas)));
	}
	private static Scanner dameScanner() {
		return new Scanner(System.in);
	}
}
