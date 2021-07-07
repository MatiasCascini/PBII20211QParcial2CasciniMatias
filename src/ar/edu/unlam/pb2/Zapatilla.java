package ar.edu.unlam.pb2;

public class Zapatilla extends Producto implements Indumentaria {

	private String talle;
	private String marca;
	private String color;
	
	public Zapatilla(Integer id, String desc, String talle, String marca, String color, Double precio){
		super(id, desc, precio);
		this.talle=talle;
		this.marca=marca;
		this.color=color;
	}
	
	@Override
	public String getTalle() {
		return talle;
	}

	public String getMarca() {
		return marca;
	}
	
	@Override
	public String getColor() {
		return color;
	}
	
	

}
