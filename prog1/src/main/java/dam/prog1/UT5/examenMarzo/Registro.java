package dam.prog1.UT5.examenMarzo;

public class Registro {
	private String descripcion;
	private double presupuesto;
	
	public Registro(String descripcion, double presupuesto) {
		this.descripcion = descripcion;
		this.presupuesto = presupuesto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Registro [descripcion=" + descripcion + ", presupuesto=" + presupuesto + "]";
	}
	
	
	

}
