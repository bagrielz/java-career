//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    var sc = new Scanner(System.in);

//    // Verifica se número é ímpar ou par
//    int numero = 8;
//    if (numero % 2 != 0) {
//        System.out.println("O número " + numero + " é ímpar.");
//    } else {
//        System.out.println("O número " + numero + " é par.");
//    }
//
//    System.out.println();
//    System.out.println("================================");
//
//    // Verifica média do aluno
//    System.out.println();
//
//    double nota1 = 8.1;
//    double nota2 = 9;
//    double media = (nota1 + nota2) / 2;
//
//    if (media >= 7) {
//        System.out.println("O estudante teve média " + media + " e foi aprovado.");
//    } else if (media >= 5) {
//        System.out.println("O estudante teve média " + media + " e está de recuperação.");
//    } else {
//        System.out.println("O estudante teve média " + media + " e foi reprovado.");
//    }
//
//    System.out.println();
//    System.out.println("================================");
//
//    // Validação de senha
//    System.out.println();
//
//    System.out.print("Digite a senha: ");
//    var password = sc.nextLine();
//
//    if (!password.equals("123456")) {
//        System.out.println("Acesso negado!");
//    } else {
//        System.out.println("Acesso permitido!");
//    }
//
//    System.out.println();
//    System.out.println("================================");
//
//    // Comparando dois números
//    System.out.println();
//
//    System.out.print("Digite o primeiro número: ");
//    var primeiroNumero = sc.nextInt();
//    System.out.print("Digite o primeiro número: ");
//    var segundoNumero = sc.nextInt();
//
//    if (primeiroNumero > segundoNumero) {
//        System.out.println("O maior número é " + primeiroNumero);
//    } else if (primeiroNumero < segundoNumero) {
//        System.out.println("O maior número é " + segundoNumero);
//    } else {
//        System.out.println("Os números são iguais");
//    }
//
//    System.out.println();
//    System.out.println("================================");

    // Verificação de desconto em compras
//    System.out.println();
//
//    System.out.print("Digite o valor da compra: ");
//    var valor = sc.nextDouble();
//
//    if (valor >= 100) {
//        var desconto = (valor / 100) * 10;
//        var valorComDesconto = valor - desconto;
//        System.out.println("Desconto de 10% aplicado.");
//        System.out.println("Novo valor: R$ " + valorComDesconto);
//    } else {
//        System.out.println("Nenhum desconto aplicado.");
//        System.out.println("Valor total: R$ " + valor);
//    }
//
//    System.out.println();
//    System.out.println("================================");
//
//    // Verificação de desconto em compras
//    System.out.println();
//
//    System.out.print("Digite o valor da compra: ");
//    var valor1 = sc.nextDouble();
//
//    if (valor1 >= 100) {
//        var desconto = (valor1 / 100) * 10;
//        var valorComDesconto = valor1 - desconto;
//        System.out.println("Desconto de 10% aplicado.");
//        System.out.println("Novo valor: R$ " + valorComDesconto);
//    } else {
//        System.out.println("Nenhum desconto aplicado.");
//        System.out.println("Valor total: R$ " + valor1);
//    }
//
//    System.out.println();
//    System.out.println("================================");

    // Verificação de dia útil
//    System.out.println();
//
//    System.out.print("Digite o dia da semana (em letras minúsculas): ");
//    var dia = sc.nextLine();
//
//    if (dia.equals("segunda")) {
//        System.out.println("Segunda é um dia útil.");
//    } else if (dia.equals("terça")) {
//        System.out.println("Terça é um dia útil.");
//    } else if (dia.equals("quarta")) {
//        System.out.println("Quarta é um dia útil.");
//    } else if (dia.equals("quinta")) {
//        System.out.println("Quinta é um dia útil.");
//    } else if (dia.equals("sexta")) {
//        System.out.println("Sexta é um dia útil.");
//    } else {
//        System.out.println(dia + " não é um dia útil.");
//    }
//
//    System.out.println();
//    System.out.println("================================");
//
//    // Verificando se um número está em um intervalo
//    System.out.println();
//
//    System.out.print("Digite o valor do empréstimo: ");
//    var emprestimo = sc.nextInt();
//
//    if (emprestimo >= 1000 && emprestimo <= 5000) {
//        System.out.println("O valor " + emprestimo + ", está dentro do intervalo permitido.");
//    } else {
//        System.out.println("O valor " + emprestimo + ", não está dentro do intervalo permitido para empréstimo.");
//    }
//
//    System.out.println();
//    System.out.println("================================");

    // Verificação de triângulo
//    System.out.println();
//
//    System.out.print("Digite o primeiro lado: ");
//    var primeiroLado = sc.nextInt();
//    System.out.print("Digite o segundo lado: ");
//    var segundoLado = sc.nextInt();
//    System.out.print("Digite o terceiro lado: ");
//    var terceiroLado = sc.nextInt();
//
//    if (primeiroLado + segundoLado > terceiroLado && primeiroLado + terceiroLado > segundoLado && segundoLado + terceiroLado > primeiroLado) {
//        System.out.println("Os lados podem formar um triângulo.");
//    } else {
//        System.out.println("Os lados não podem formar um triângulo.");
//    }
    //    System.out.println();
//    System.out.println("================================");

    //  Verificação de compatibilidade de doação de sangue
//    System.out.println();
//
//    System.out.println("Digite a idade do doador: ");
//    var idade = sc.nextInt();
//    System.out.println("Digite o peso do doador (em kg): ");
//    var peso = sc.nextDouble();
//
//    if (idade <= 18 || idade >= 65) {
//        System.out.println("O doador não é compatível.");
//        System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
//    } else if (peso <= 50) {
//        System.out.println("O doador não é compatível.");
//        System.out.println("Motivo: Deve ter mais de 50kg.");
//    } else {
//        System.out.println("O doador é compatível.");
//    }
//
//    System.out.println();
//    System.out.println("================================");

    //     Verificação de código de acesso e nível de permissão
    System.out.println();

    System.out.print("Digite o código de acesso: ");
    var codigoDeAcesso = sc.nextLine();
    System.out.print("Digite o nível de permissão: ");
    var nivelDePermissao = sc.nextInt();

    boolean codigoDeAcessoValido = codigoDeAcesso.equals("2023");
    boolean nivelDePermissaoValido = nivelDePermissao >= 1 && nivelDePermissao <= 3;

    if (!codigoDeAcessoValido && !nivelDePermissaoValido) {
        System.out.println("Código de acesso e nível de permissão incorretos.");

    } else if (!nivelDePermissaoValido) {
        System.out.println("Nível de permissão incorreto.");
    } else if (!codigoDeAcessoValido) {
        System.out.println("Código de acesso incorreto.");
    } else {
        System.out.println("Acesso permitido. Bem-vindo ao sistema!");
    }

    System.out.println();
    System.out.println("================================");
}
