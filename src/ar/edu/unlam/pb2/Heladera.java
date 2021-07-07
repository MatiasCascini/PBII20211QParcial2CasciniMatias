package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {

	private Boolean isNoFrost;
	private Integer garantia;
	private String marca;
	
	public Heladera(Integer id, String desc, Boolean frost, Integer garantia, String marca, Double precio) {
		super(id, desc,precio);
		this.garantia=garantia;
		this.isNoFrost=frost;
		this.marca=marca;
	}
	
	@Override
	public Integer getGarantia() {
		return this.garantia;
	}

	public Boolean isNoFrost() {
		return isNoFrost;
	}

	public String getMarca() {
		return marca;
	}
	
	
	

}
