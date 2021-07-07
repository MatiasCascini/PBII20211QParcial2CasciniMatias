package ar.edu.unlam.pb2;

public class ProductoSinStock extends Exception {
	public ProductoSinStock() {
		System.out.println("El producto no esta en stock");
	}
}
