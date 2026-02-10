package classes;

public class Push extends Notificacao {
    public Push(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.printf("Enviando Push para: %s  \n" +
                "Título: Novidade!  \n" +
                "Conteúdo: %s \n", super.getDestinatario(), super.getMensagem());
    }
}
