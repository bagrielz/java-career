package classes;

public class BoletoBancario extends Pagamento {
    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        var valorTaxa = (super.getValor() * 1) / 100;
        System.out.printf("Boleto de %.2f gerado com sucesso (taxa: %.2f)\n", super.getValor(), valorTaxa);
    }
}
