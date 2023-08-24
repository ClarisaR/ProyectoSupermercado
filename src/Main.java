import dominio.Supermercado;
import dominio.producto.*;
import excepciones.ProductoNoExistenteException;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final List<Producto> listaDeProductos = Arrays.asList(
            new Bebida("Coca-Cola Zero", new BigDecimal(20), 1.5),
            new Bebida("Coca-Cola", new BigDecimal(18), 1.5),
            new ProductoDeLimpieza("Shampoo Sedal", new BigDecimal(19), 500),
            new Fruta("Frutillas", new BigDecimal(64), UnidadDeVenta.KILO)
    );

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        agregarProductos(supermercado);
        mostrarProductos(supermercado);

        System.out.println("=======================================================");
        mostrarProductoMasCaro(supermercado);
        mostrarProductoMasBarato(supermercado);
    }

    private static void mostrarProductoMasBarato(Supermercado supermercado) {
        try {
            System.out.println("Producto más barato: " + supermercado.obtenerProductoMasBarato().getNombre());
        } catch (ProductoNoExistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mostrarProductoMasCaro(Supermercado supermercado) {
        try {
            System.out.println("Producto más caro: " + supermercado.obtenerProductoMasCaro().getNombre());
        } catch (ProductoNoExistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void agregarProductos(Supermercado supermercado) {
        for (Producto producto : Main.listaDeProductos) {
            supermercado.agregarProducto(producto);
        }
    }

    private static void mostrarProductos(Supermercado supermercado) {
        for (Producto producto : supermercado.obtenerTodosLosProductos()) {
            System.out.println(producto);
        }
    }
}