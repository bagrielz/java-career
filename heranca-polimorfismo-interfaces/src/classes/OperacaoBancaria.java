package classes;

public abstract class OperacaoBancaria implements AcaoBancaria {
    private final double valor;

    protected OperacaoBancaria(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
