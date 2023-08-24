package dominio.producto;

import java.math.BigDecimal;

public class Fruta extends Producto {
    private final UnidadDeVenta unidadDeVenta;
    private static final String FORMATO_DE_SALIDA = "Nombre: %s /// Precio: $%.0f /// Unidad de venta: %s";

    public Fruta(String nombre, BigDecimal precio, UnidadDeVenta unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return String.format(FORMATO_DE_SALIDA, super.getNombre(), super.getPrecio(), this.unidadDeVenta.getValor());
    }
}
