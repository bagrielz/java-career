package classes;

public class Email extends Notificacao {
    public Email(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.printf("Enviando Email para: %s  \n" +
                "Assunto: Promoção especial!  \n" +
                "Corpo: %s \n", super.getDestinatario(), super.getMensagem());
    }
}
