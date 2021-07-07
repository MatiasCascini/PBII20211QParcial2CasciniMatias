package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes = new HashSet<>(); // Listado de productos que se comercializan
	private List<Producto> productosDisponibles = new ArrayList<>(); // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas = new HashMap<>(); // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta
	
	public Supermercado(String nombre) {
		this.nombre=nombre;
		this.contadorDeVentas=0;
	}

	public void ingresarProducto(Producto nuevo) {
		productosExistentes.add(nuevo);
		productosDisponibles.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		return productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		Integer stock=0;
		
		for (Producto producto : productosDisponibles) {
			if(producto.getId().equals(codigo))
				stock++;
		}
		return stock;
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		for (Producto producto : productosExistentes) {
			if(producto.getId().equals(codigoDeProducto))
				return true;
		}
		throw new ProductoInexistente();
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		for (Producto producto : productosDisponibles) {
			if(producto.getId().equals(codigoDeProducto))
				return producto;
		}
		throw new ProductoSinStock();
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer nueroDeVenta) {
		return ventasRealizadas.get(nueroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		if(productoExiste(codigoDeProducto)) {
			if(getProductoPorCodigo(codigoDeProducto).getId().equals(codigoDeProducto)) {
				ventasRealizadas.get(numeroDeVenta).agregarImporte(getProductoPorCodigo(codigoDeProducto).getPrecio());
				quitarStock(codigoDeProducto);
			}else
				throw new ProductoSinStock();
		}else
			throw new ProductoInexistente();
	}
	
	public void quitarStock(Integer codigoDeProducto) {
		for (Producto producto : productosDisponibles) {
			if(producto.getId().equals(codigoDeProducto)) {
				productosDisponibles.remove(producto);
			}
		}
	}
	
	public Integer productosComestibles() {
		Integer cont=0;
		for (Producto producto : productosDisponibles) {
			if(producto instanceof Comestible)
			cont++;
		}
		return cont;
	}

}

