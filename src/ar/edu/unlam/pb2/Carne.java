package ar.edu.unlam.pb2;

public class Carne extends Producto implements Comestible {

	private String marca;
	private Double kilos;
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	
	public Carne (Integer codigo, String descripcion, String fechaDeElaboracion,String fechaDeVencimiento,Double kilos,  String marca, Double precio) {
		super(codigo, descripcion, precio);
		this.fechaDeElaboracion=fechaDeElaboracion;
		this.fechaDeVencimiento=fechaDeVencimiento;
		this.marca=marca;
		this.kilos=kilos;
	}

	public Double getKilos() {
		return this.kilos;
	}

	@Override
	public Object getFechaDeElaboracion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
