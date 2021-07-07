package ar.edu.unlam.pb2;

public class ProductoInexistente extends Exception {
	public ProductoInexistente() {
		System.out.println("El producto no existe");
	}
}
