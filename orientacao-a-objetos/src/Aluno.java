public class Aluno {
    String nome;
    double nota1;
    double nota2;

    void calculaMedia() {
        var media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);

        var situacao = media >= 7 ? "Situação: Aprovado" : "Situação: Reprovado";
        System.out.println(situacao);
    }
}
