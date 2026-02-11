package classes;

public class CartaoCredito extends Pagamento {
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        var valorTaxa = (super.getValor() * 3) / 100;
        System.out.printf("Pagamento de %.2f confirmado no cartão de crédito (taxa: %.2f)\n", super.getValor(), valorTaxa);
    }
}
