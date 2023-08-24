package dominio;

import dominio.producto.Producto;
import excepciones.ProductoNoExistenteException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Supermercado {
    private final List<Producto> productos;

    public Supermercado() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto obtenerProductoMasCaro() throws ProductoNoExistenteException {
        Optional<Producto> productoOptional = productos.stream().max(Producto::compareTo);
        if (!productoOptional.isPresent()) {
            throw new ProductoNoExistenteException("No existe producto más caro");
        }
        return productoOptional.get();
    }

    public Producto obtenerProductoMasBarato() throws ProductoNoExistenteException {
        Optional<Producto> productoOptional = productos.stream().min(Producto::compareTo);
        if (!productoOptional.isPresent()) {
            throw new ProductoNoExistenteException("No existe producto más barato");
        }
        return productoOptional.get();
    }

    public List<Producto> obtenerTodosLosProductos() {
        return this.productos;
    }
}
