package clases;

import java.util.ArrayList;

public class Edificio {
	Planta[] edificio = new Planta[4];

	public Edificio(Planta[] edificio) {
		super();
		this.edificio = edificio;
	}

	public Edificio() {
		super();
	}

	public void crearEstructuraCompleta() {
		for (int i = 0; i < edificio.length; i++) {
			this.edificio[i] = Utilidades.rellenarPlanta();
		}
	}

	public void addEmpresaOptimizado(Empresa e) {

		int minEmpleados = 1000000;
		for (int i = 0; i < edificio.length; i++) {
			Planta planta = edificio[i];
			if (planta.getEmpresas().get(i).getNumEmp() < minEmpleados)
				minEmpleados = planta.getEmpresas().get(i).getNumEmp();
		}
		for (int i = 0; i < edificio.length; i++) {
			Planta planta = edificio[i];
			if (planta.getEmpresas().get(i).getNumEmp() == minEmpleados) {
				planta.getEmpresas().remove(i);
				planta.getEmpresas().add(e);
			}
		}
	}

	public void mostrarPlantasEmpresas() {
		for (int i = 0; i < edificio.length; i++) {
			System.out.println(edificio[i]);
		}
	}

	public Empresa mostrarEmpresaMasEmpleados() {
		Empresa e = null;
		int empleados = -1000000000;
		for (int i = 0; i < edificio.length; i++) {
			ArrayList<Empresa> empresas = edificio[i].getEmpresas();
			for (int j = 0; j < empresas.size(); j++) {
				if (empresas.get(j).getNumEmp() > empleados) {
					e = empresas.get(j);
					empleados = e.getNumEmp();
				}
			}
		}
		return e;
	}

	public Empresa mostrarEmpresaMasFacturacion() {
		Empresa e = null;
		double facturacion = -1000000000d;
		for (int i = 0; i < edificio.length; i++) {
			ArrayList<Empresa> empresas = edificio[i].getEmpresas();
			for (int j = 0; j < empresas.size(); j++) {
				if (empresas.get(j).getFacturacion() > facturacion) {
					e = empresas.get(j);
					facturacion = e.getFacturacion();
				}

			}
		}
		return e;
	}

	public void addEmpresa(Empresa e) {
		int planta = Utilidades.pedirEntero("Introduzca numero de planta");
		for (int i = 0; i < edificio.length; i++) {
			if (edificio[i].getNumeroPlanta() == planta) {
				edificio[i].addEmpresa(e);
			}
		}
	}

	public void mostrarEmpresasConMasFacturacionDeLaIntroducida() {
		ArrayList<Empresa> empresasQueSuperanFacturacion = new ArrayList<>();
		double facturacion = Utilidades.pedirDouble("Introduce la facturacion ");
		for (int i = 0; i < edificio.length; i++) {
			ArrayList<Empresa> empresasPlanta = edificio[i].getEmpresas();
			for (int j = 0; j < empresasPlanta.size(); j++) {
				if (empresasPlanta.get(i).getFacturacion() >= facturacion) {
					empresasQueSuperanFacturacion.add(empresasPlanta.get(i));
				}
			}
		}
		System.out.println(empresasQueSuperanFacturacion);
	}

	public void eliminarEmpresa() {
		String nombre = Utilidades.pedirCadena("Introduce el nombre de la empresa");
		for (int i = 0; i < edificio.length; i++) {
			ArrayList<Empresa> empresas = edificio[i].getEmpresas();
			for (int j = 0; j < empresas.size(); j++) {
				if (empresas.get(j).getNombre().equalsIgnoreCase(nombre)) {
					edificio[i].getEmpresas().remove(j);
				}
			}
		}
	}

	public void contratarEmpleado() {
		String nombre = Utilidades.pedirCadena("Introduce el nombre de la empresa");
		for (int i = 0; i < edificio.length; i++) {
			ArrayList<Empresa> empresas = edificio[i].getEmpresas();
			for (int j = 0; j < empresas.size(); j++) {
				if (empresas.get(j).getNombre().equalsIgnoreCase(nombre)) {
					empresas.get(j).setNumEmp(empresas.get(j).getNumEmp() + 1);
				}
			}
		}
	}

	public void despedirEmpleado() {
		String nombre = Utilidades.pedirCadena("Introduce el nombre de la empresa");
		for (int i = 0; i < edificio.length; i++) {
			ArrayList<Empresa> empresas = edificio[i].getEmpresas();
			for (int j = 0; j < empresas.size(); j++) {
				if (empresas.get(j).getNombre().equalsIgnoreCase(nombre)) {
					empresas.get(j).setNumEmp(empresas.get(j).getNumEmp() - 1);
				}
			}
		}
	}
}
