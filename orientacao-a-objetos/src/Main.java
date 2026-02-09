//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Produto
    var produto = new Produto();

    produto.nome = "Mouse Gamer";
    produto.preco = 159.9;
    produto.quantidade = 25;

    produto.exibirInformacoes();

    System.out.println();

    // Livro
    var livro = new Livro();

    livro.titulo = "O Guia do Mochileiro das Galáxias";
    livro.autor = "Douglas Adams";
    livro.paginas = 208;

    livro.exibirResumo();

    System.out.println();

    // Conta Bancária
    var conta = new ContaBancaria();

    conta.saldo = 1579.42;

    conta.exibirSaldo();
    conta.zerarSaldo();
    conta.exibirSaldo();

    System.out.println();

    // Controle de Temperatura
    var controle = new ControleTemperatura();

    controle.local = "Setor A";
    controle.temperaturaAtual = 39.2;

    controle.exibirLocal();
    controle.exibirTemperatura();
    controle.exibirRelatorio();

    System.out.println();

    // Média
    var aluno = new Aluno();

    aluno.nome = "João Silva";
    aluno.nota1 = 6.5;
    aluno.nota2 = 7.5;

    aluno.calculaMedia();
}
