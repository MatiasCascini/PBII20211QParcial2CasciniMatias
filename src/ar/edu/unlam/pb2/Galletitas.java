package ar.edu.unlam.pb2;

public class Galletitas extends Producto implements Comestible {

	private String marca;
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	
	public Galletitas (Integer codigo, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, String marca, Double precio) {
		super(codigo, descripcion,precio);
		this.fechaDeElaboracion=fechaDeElaboracion;
		this.fechaDeVencimiento=fechaDeVencimiento;
		this.marca=marca;
	}


	public String getMarca() {
		return marca;
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
