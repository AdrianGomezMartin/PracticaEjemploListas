package clases;

public class Edificio {
	Planta[] edificio = new Planta[4];

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
}
