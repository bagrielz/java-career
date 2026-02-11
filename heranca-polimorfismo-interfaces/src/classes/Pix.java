package classes;

public class Pix extends Pagamento {
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento via pix de R$ %.2f \n", super.getValor());
    }
}
