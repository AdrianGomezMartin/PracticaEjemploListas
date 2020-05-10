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
		// TODO Auto-generated constructor stub
	}

	public void addEmpresaOptimizado(Empresa e) {
		Empresa empresaMenosEmpleados = new Empresa();
		int minEmpleados = 1000000;
		for (int i = 0; i < edificio.length; i++) {
			Planta planta = edificio[i];
			if (planta.getEmpresas().get(i).getNumEmp() < minEmpleados)
				empresaMenosEmpleados = planta.getEmpresas().get(i);
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

	public Empresa mostrarEmpresaMenosEmpleados() {
		Empresa e = null;
		int empleados = 1000000000;
		for (int i = 0; i < edificio.length; i++) {
			ArrayList<Empresa> empresas = edificio[i].getEmpresas();
			for (int j = 0; j < empresas.size(); j++) {
				if (empresas.get(j).getNumEmp() < empleados) {
					e = empresas.get(j);
				}
			}
		}
		return e;
	}
}
