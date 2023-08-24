package dominio.producto;

public enum UnidadDeVenta {
    KILO("kilo");

    private final String valor;

    UnidadDeVenta(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }
}
