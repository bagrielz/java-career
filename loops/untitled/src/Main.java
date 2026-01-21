//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    var sc = new Scanner(System.in);
    // Contagem de degraus
//    System.out.print("Digite a quantidade de degraus: ");
//    var degraus = sc.nextInt();
//
//    for (int i = 1; i <= degraus; i++) {
//        System.out.println("Subindo o degrau " + i);
//    }
//
//    System.out.println("Você chegou ao topo!");

    // Soma de números
//    int[] valores = {10, 20, 30, 40, 50};
//    int soma = 0;
//
//    for (int valor : valores) {
//        soma += valor;
//        System.out.println(soma);
//    }
//
//    System.out.println("A soma total das receitas é: " + soma);

    // Soma dos números pares
//    int soma = 0;
//    for (int i = 1; i <= 100; i++) {
//        if (i % 2 == 0) {
//            soma += i;
//        }
//    }
//
//    System.out.print("A soma dos números pares de 1 a 100 é: " + soma);

    // Calculadora de fatorial
//    System.out.print("Digite um número: ");
//    var valor = sc.nextInt();
//    int acc = 0;
//
//    for (int i = 0; i <= valor; i++) {
//        int valorAtual = (valor - 1) * valor;
//        acc += valorAtual;
//    }
//
//    System.out.print("O fatorial de " + valor + " é: " + acc);

    // Encontrando o maior número
//    System.out.println("Digite os números separados por espaço: ");
//    var numeros = sc.nextLine().split(" ");
//    int maior = Integer.MIN_VALUE;
//    System.out.println(maior);
//
//    for (String numStr : numeros) {
//        int num = Integer.parseInt(numStr);
//
//        if (num > maior) {
//            maior = num;
//        }
//    }
//    System.out.println("O maior número é: " + maior);

    // Tentativas de login
//    final String SENHA_CORRETA = "1234";
//
//    for (int tentativas = 3; tentativas > 0; tentativas--) {
//        System.out.print("Digite sua senha: ");
//        String senha = sc.nextLine();
//
//        if (senha.equals(SENHA_CORRETA)) {
//            System.out.println("Senha correta! Acesso concedido!");
//            break;
//        } else if (tentativas > 1) {
//            System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
//        } else {
//            System.out.println("Conta bloqueada temporariamente.");
//        }
//    }

    // Pedindo um nome válido
//    var condicao = true;
//
//    while (condicao) {
//        System.out.print("Digite seu nome: ");
//        var nomeDigitado = sc.nextLine();
//
//        if (nomeDigitado.length() < 2) {
//            System.out.println("Nome inválido. Digite novamente.");
//        } else {
//            System.out.println("Nome " + nomeDigitado + " cadastrado com sucesso!");
//            condicao = false;
//        }
//    }

    // Números positivos e negativos
//    int positivos = 0;
//    int negativos = 0;
//
//    while (true) {
//        System.out.print("Digite um número (ou 'fim' para encerrar): ");
//        String entrada = sc.nextLine();
//
//        if (entrada.equals("fim")) {
//            break;
//        }
//
//        int numero = Integer.parseInt(entrada);
//
//        if (numero > 0) {
//            positivos++;
//        } else if (numero < 0) {
//            negativos++;
//        }
//    }
//    System.out.println("Números positivos: " + positivos);
//    System.out.println("Números negativos: " + negativos);

    // Números que terminam em 5
//    int contador = 0;
//
//    System.out.print("Digite um número: ");
//    var numero = sc.nextInt();
//
//    for (int i = 1; i <= numero; i++) {
//        contador += i;
//        if (i % 10 == 5) {
//            continue;
//        }
//        System.out.print(i + " ");
//    }

    // Controle de acesso a convidados
    var listaConvidados = new ArrayList<String>();

    while (true) {
        System.out.print("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para teminar): ");
        var entrada = sc.nextLine();

        if (entrada.equalsIgnoreCase("ver")) {
            System.out.println("Lista atualizada de convidados: " + listaConvidados);
            continue;
        } else if (entrada.equalsIgnoreCase("sair")) {
            break;
        }

        boolean jaExiste = false;
        for (String convidado : listaConvidados) {
            if (convidado.toLowerCase().equals(entrada.toLowerCase())) {
                jaExiste = true;
                break;
            }
        }

        if (jaExiste) {
            System.out.println("O nome " + entrada + " já está na lista de convidados.");
        } else {
            listaConvidados.add(entrada);
            System.out.println(entrada + " foi adicionado à lista de convidados.");
        }
    }
}
