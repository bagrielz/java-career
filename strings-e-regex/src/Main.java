//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    var scanner = new Scanner(System.in);

//    System.out.print("Digite o nome: ");
//    var nome = scanner.nextLine();
//
//    var nomeformatado = nome.trim();
//    System.out.println("Nome sem espaços: " + nomeformatado);

//    System.out.print("Digite o texto: ");
//    var titulo = scanner.nextLine();
//
//    var tituloMaiusculo = titulo.toUpperCase();
//    var tituloMinusculo = titulo.toLowerCase();
//    System.out.println("Texto em maiúsculas: " + tituloMaiusculo);
//    System.out.println("Texto em minúsculas: " + tituloMinusculo);

    // Substituindo parte de uma string
//    System.out.print("Digite o texto: ");
//    var texto = scanner.nextLine();
//
//    System.out.print("Digite a palavra a ser substituída: ");
//    var palavraSubstituida = scanner.nextLine();
//
//    if (!texto.contains(palavraSubstituida)) {
//        System.out.println("Palavra não encontrada");
//    }
//
//    System.out.print("Digite a nova palavra: ");
//    var palavraNova = scanner.nextLine();
//
//    var textoModificado = texto.replace(palavraSubstituida, palavraNova);
//    System.out.println("Texto modificado: " + textoModificado);

    // Extensão de arquivo
//    System.out.print("Digite o nome do arquivo: ");
//    var arquivo = scanner.nextLine();
//
//    int posicaoPonto = arquivo.lastIndexOf(".");
//    System.out.println(posicaoPonto);
//    if (posicaoPonto != -1) {
//        String nomeSemExtensao = arquivo.substring(0, posicaoPonto);
//        System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
//    } else {
//        System.out.println("O arquivo não possui extensão.");
//    }

    // Validar CPF
//    System.out.print("Digite o CPF: ");
//    var cpf = scanner.nextLine();
//
//    var regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
//
//    if (cpf.matches(regex)) {
//        System.out.println("O CPF " + cpf + " está no formato válido");
//    } else {
//        System.out.println("O CPF " + cpf + " não está no formato válio");
//    }

    // Extraindo hashtags de um texto
    System.out.print("Digite o texto: ");
    var texto = scanner.nextLine();

    var pattern = Pattern.compile("#\\w+");
    var matcher = pattern.matcher(texto);

    var hashtags = new ArrayList<>();

    while (matcher.find()) {
        hashtags.add(matcher.group());
    }

    if (hashtags.isEmpty()) {
        System.out.println("Nenhuma hashtag encontrada");
    } else {
        System.out.println("Hashtags encontradas: " + hashtags);
    }
}
