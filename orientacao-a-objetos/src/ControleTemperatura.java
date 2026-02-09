public class ControleTemperatura {
    String local;
    double temperaturaAtual;

    public void exibirLocal() {
        System.out.println("Sensor no local: " + local);
    }

    public void exibirTemperatura() {
        var temperaturaFormatada = String.valueOf(temperaturaAtual).replace(".", ",");
        System.out.println("Temperatura: " + temperaturaFormatada + " ºC");

        if (temperaturaAtual > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }

    void exibirRelatorio() {
        System.out.println("Sensor no local: " + local);
        System.out.printf("Temperatura: %.1f ºC\n", temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}
