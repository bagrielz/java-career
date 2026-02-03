//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    var sc = new Scanner(System.in);

    // Formatando data e hora para relatórios
//    var dataAtual = LocalDate.now();
//    var horaAtual = LocalTime.now();
//
//    var dataAtualFormatted = dataAtual.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//    var horaAtualFormatted = horaAtual.format(DateTimeFormatter.ofPattern("HH:mm"));
//
//    System.out.println("Data formatada: " + dataAtualFormatted);
//    System.out.println("Hora formatada: " + horaAtualFormatted);

    // Diferença entre horas
//    var horarioInicio = LocalTime.of(14, 30);
//    var horarioFim = LocalTime.of(16, 45);
//
//    var diferenca = Duration.between(horarioInicio, horarioFim);
//    System.out.println("Diferença de tempo: " + diferenca.toHours() + " horas e " + diferenca.toMinutesPart() + " minutos");

    // Calculando a data de entrega
//    var dataInicio = LocalDate.now();
//    var prazo = 15;
//    var dataEntrega = dataInicio.plusDays(prazo);
//
//    var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//    var dataFormatada = dataEntrega.format(formatter);
//
//    System.out.println("Data de entrega: " + dataFormatada);

    // Ajustando a data de vencimento
//    var vencimento = LocalDate.of(2026, 2, 2);
//    var novaData = vencimento.plusMonths(6);
//
//    var formatted = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//    var dataFormatada = novaData.format(formatted);
//
//    System.out.println("Nova data de vencimento: " + dataFormatada);

    // Verificando a data de um evento
//    var dataCadastrada = LocalDate.of(2025, 3, 10);
//    var dataAtual = LocalDate.now();
//
//    var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//
//    var dataAtualFormatada = formatter.format(dataAtual);
//    var dataCadastradaFormatada = formatter.format(dataCadastrada);
//
//    System.out.println("Data do evento: " + dataCadastradaFormatada);
//    System.out.println("Data atual: " + dataAtualFormatada);
//
//    if (dataCadastrada.isAfter(dataAtual)) {
//        System.out.println("O evento já ocorreu.");
//    } else if (dataCadastrada.isBefore(dataAtual)) {
//        System.out.println("O evento ainda não ocorreu.");
//    } else if (dataCadastrada.isEqual(dataAtual)) {
//        System.out.println("O evento é hoje.");
//    }

    // Fuso horário
    var horaAtual = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    var formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    var horarioFormatado = horaAtual.format(formatter);

    System.out.println("Horário atual em Tóquio: " + horarioFormatado);
}
