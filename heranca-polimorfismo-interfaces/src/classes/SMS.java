package classes;

public class SMS extends Notificacao {
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.printf("Enviando SMS para: %s  \n" +
                "Mensagem: %s \n", super.getDestinatario(), super.getMensagem());
    }
}
