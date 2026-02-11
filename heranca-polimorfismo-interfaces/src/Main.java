import classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    var aluno1 = new Aluno("Fernanda", "regular");
    var aluno2 = new Bolsista("Lucas");

    aluno1.identificar();
    aluno2.identificar();

    var aluno3 = new Aluno1("Julia", 16, 8.5);
    var aluno4 = new Aluno1("Caio", 17, 7.2);
    var docente1 = new Docente("Marta", 40, "Matemática");
    var docente2 = new Docente("Marta", 38, "História");

    aluno3.exibirDados();
    aluno4.exibirDados();

    docente1.exibirDados();
    docente2.exibirDados();

//    var email = new Email("cliente@exemplo.com", "Aproveite nossos descontos esta semana.");
//    var sms = new SMS("(11) 98765-4321", "Sua fatura foi paga com sucesso.");
//    var push = new Push("usuario_app", "Você tem uma nova mensagem não lida");
//
//    email.enviar();
//    sms.enviar();
//    push.enviar();

    var notificacoes = List.of(new Email("cliente@exemplo.com", "Aproveite nossos descontos esta semana."), new SMS("(11) 98765-4321", "Sua fatura foi paga com sucesso."), new Push("usuario_app", "Você tem uma nova mensagem não lida"));

    for (Notificacao n : notificacoes) {
        n.enviar();
    }

    var pagamentos = List.of(new CartaoCredito(250.00), new BoletoBancario(500.00), new Pix(300.00));

    for (Pagamento p : pagamentos) {
        p.confirmarPagamento();
    }

    var notificacao = new Notificacao1();

    notificacao.enviarMensagem("Olá!");
    notificacao.enviarMensagem("João", "Bom dia!");
    notificacao.enviarMensagem("Maria", "Atenção!", 2);

    var operacoes = List.of(new Deposito(200), new Saque(50.5));

    for (OperacaoBancaria o : operacoes) {
        o.executar();
    }
}
