package ar.edu.unlam.pb2;

public class Venta {
	private Integer dni;
	private String nombre;
	private Double importe;
	
	public Venta (Integer dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
		this.importe=0.0;
	}
	
	public void agregarImporte(Double importe) {
		this.importe+=importe;
	}
	
	public Double getImporte() {
		return importe;
	}
}
