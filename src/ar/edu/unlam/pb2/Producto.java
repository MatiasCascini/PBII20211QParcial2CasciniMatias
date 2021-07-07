package ar.edu.unlam.pb2;

public class Producto {
	private Integer id;
	private String desc;
	private Double precio;
	
	public Producto(Integer id, String desc, Double precio) {
		this.id=id;
		this.desc=desc;
		this.precio=precio;
	}

	public Integer getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}
	
	public Double getPrecio() {
		return precio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Producto other = (Producto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
}
