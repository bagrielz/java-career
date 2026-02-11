package classes;

public abstract class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void confirmarPagamento();

    public double getValor() {
        return valor;
    }
}
