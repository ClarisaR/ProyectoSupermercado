package dominio.producto;

import java.math.BigDecimal;

public class ProductoDeLimpieza extends Producto {
    private final Integer contenido;
    private static final String FORMATO_DE_SALIDA = "Nombre: %s /// Contenido: %d ml /// Precio: $%.0f";

    public ProductoDeLimpieza(String nombre, BigDecimal precio, Integer contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return String.format(FORMATO_DE_SALIDA, super.getNombre(), this.contenido, super.getPrecio());
    }
}
