//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Conversão de temperatura
    int temperaturaCelsius = 20;
    var temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

    System.out.println("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit);
    System.out.println();
    System.out.println("================================");

    // Cadastro de livros
    System.out.println();

    var titulo = "1984";
    var autor = "George Orwell";
    var numeroDePaginas = 320;
    var preco = 15;
    var categoria = 'F';

    String categoriaDescricao;

    if (categoria == 'F') {
        categoriaDescricao = "Ficcção";
    } else if (categoria == 'N') {
        categoriaDescricao = "Não-ficção";
    } else if (categoria == 'T') {
        categoriaDescricao = "Tecnologia";
    } else {
        categoriaDescricao = "Categoria inválida";
    }

    System.out.println("Livro cadastrado: " + titulo + ", de " + autor + ". Ele possui " + numeroDePaginas + " páginas, custa R$" + preco + " e pertence a categoria " + categoriaDescricao + ".");
    System.out.println();
    System.out.println("================================");

    // Classificação por categoria
    System.out.println();

    double precoProduto = 0.00;

    if (precoProduto <= 50) {
        System.out.println("Categoria do produto: Econômico");
    } else if (precoProduto > 50 && precoProduto <= 200) {
        System.out.println("Categoria do produto: Intermediário");
    } else {
        System.out.println("Categoria do produto: Premium");
    }

    System.out.println();
    System.out.println("================================");

    // Par ou ímpar
    System.out.println();

    int numero = 7;

    if (numero / 2 == 0) {
        System.out.println("O número é par");
    } else {
        System.out.println("O número é ímpar");
    }

    System.out.println();
    System.out.println("================================");

    // Conversor de moedas
    System.out.println();

    double valorReais = 451.50;
    double valorDolar = valorReais / 5.25;

    System.out.println("O valor em dólares é: U$" + valorDolar);
    System.out.println();
    System.out.println("================================");

    // Verificação de idae e escopo de variáveis
    System.out.println();

    var idade = 17;
    String mensagem;

    if (idade >= 18) {
        mensagem = "Você é maior de idade.";
    } else {
        mensagem = "Você é menor de idade.";
    }

    System.out.println(mensagem);
    System.out.println();
    System.out.println("================================");

    // Planejando uma viagem: consumo e autonomia
    System.out.println();

    double consumoMedio = 12.5;
    double capacidadeTanque = 50;
    double combustivelAtual = 20;
    double distanciaViagem = 200;

    var autonomiaMaxima = consumoMedio * capacidadeTanque;
    var autonomiaAtual = consumoMedio * combustivelAtual;

    String message = "";

    if (autonomiaAtual > distanciaViagem) {
        message = "Você conseguirá completar a viagem sem precisar abastecer.";
    }

    System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + " km");
    System.out.println("Autonomia atual: " + autonomiaAtual + " km");
    System.out.println(message);
    System.out.println();
    System.out.println("================================");
}
