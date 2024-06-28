package gestionEventos;

public enum EstadosEvento {
    BORRADOR(1), CONFIRMADO(2), CANCELADO(3);

    public int valor;

    private EstadosEvento(int valor) {
        this.valor = valor;
    }
}
