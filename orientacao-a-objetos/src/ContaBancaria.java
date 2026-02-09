public class ContaBancaria {
    double saldo;

    public void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f", saldo);
    }

    public void zerarSaldo() {
        this.saldo = 0.0;
    }
}
