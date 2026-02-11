package classes;

public class Notificacao1 {
    public void enviarMensagem(String mensagem) {
        System.out.printf("Mensagem enviada para todos: %s\n", mensagem);
    }

    public void enviarMensagem(String nome, String mensagem) {
        System.out.printf("Mensagem para %s: %s\n", nome, mensagem);
    }

    public void enviarMensagem(String nome, String mensagem, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Mensagem para %s: %s\n", nome, mensagem);
        }
    }
}
