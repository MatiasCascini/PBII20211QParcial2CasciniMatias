package ar.edu.unlam.pb2;

public class Televisor extends Producto implements Electrodomestico {
	
	private Integer pulgadas;
	private Integer garantia;
	private String marca;
	
	public Televisor(Integer id, String desc, Integer pulgadas, Integer garantia, String marca, Double precio) {
		super(id, desc,precio);
		this.garantia=garantia;
		this.marca=marca;
		this.pulgadas=pulgadas;
	}


	public Integer getPulgadas() {
		return pulgadas;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public Integer getGarantia() {
		return garantia;
	}
	
	
}
