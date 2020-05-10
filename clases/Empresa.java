package clases;

public class Empresa {
	private String nombre;
	private int numEmp;
	private double facturacion;
	private boolean tecnologica;

	public Empresa() {
		super();
	}

	public Empresa(String nombre, int numEmp, double facturacion, boolean tecnologica) {
		super();
		this.nombre = nombre;
		this.numEmp = numEmp;
		this.facturacion = facturacion;
		this.tecnologica = tecnologica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}

	public double getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(double facturacion) {
		this.facturacion = facturacion;
	}

	public boolean isTecnologica() {
		return tecnologica;
	}

	public void setTecnologica(boolean tecnologica) {
		this.tecnologica = tecnologica;
	}

	@Override
	public String toString() {
		return "\nEmpresa [nombre=" + nombre + ", numEmp=" + numEmp + ", facturacion=" + facturacion + ", tecnologica="
				+ (tecnologica ? "Tecnologica" : "No es Tecnologica") + "]";
	}

}
