package clases;

import java.util.ArrayList;

public class Planta {
	private int numeroPlanta;

	public Planta(int numeroPlanta, ArrayList<Empresa> empresas) {
		super();
		this.numeroPlanta = numeroPlanta;
		this.empresas = empresas;
	}

	private ArrayList<Empresa> empresas = new  ArrayList<Empresa>();

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}
	public int getNumeroPlanta() {
		return numeroPlanta;
	}

	public void setNumeroPlanta(int numeroPlanta) {
		this.numeroPlanta = numeroPlanta;
	}

	public void addEmpresa (Empresa e) {
		this.empresas.add(e);
	}
	
	public void borrarEmpresaPorNombre(Empresa e) {
		String nombreEmpresa = Utilidades.pedirCadena("Introduce el nombre de la empresa que desea borrar");
		for (int i = 0; i < this.empresas.size(); i++) {
			if (this.empresas.get(i).getNombre().equalsIgnoreCase(nombreEmpresa))
				this.empresas.remove(i);
		}
	}

	@Override
	public String toString() {
		return "\nPlanta [numeroPlanta=" + numeroPlanta + ", empresas=" + empresas + "]";
	}
	
}
