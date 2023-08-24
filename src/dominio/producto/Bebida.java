package dominio.producto;

import java.math.BigDecimal;

public class Bebida extends Producto {
    private final Double litros;
    private static final String FORMATO_DE_SALIDA = "Nombre: %s /// Litros: %.1f /// Precio: $%.0f";

    public Bebida(String nombre, BigDecimal precio, Double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return String.format(FORMATO_DE_SALIDA, super.getNombre(), this.litros, super.getPrecio());
    }
}
