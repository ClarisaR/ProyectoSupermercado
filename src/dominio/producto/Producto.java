package dominio.producto;

import java.math.BigDecimal;

public abstract class Producto implements Comparable<Producto> {
    private final String nombre;
    private final BigDecimal precio;

    public Producto(String nombre, BigDecimal precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto o) {
        return (this.precio.compareTo(o.precio));
    }

    public String getNombre() {
        return this.nombre;
    }

    protected BigDecimal getPrecio() {
        return this.precio;
    }
}
