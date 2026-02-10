package classes;

public class Aluno1 extends Pessoa {
    private double nota;

    public Aluno1(String nome, int idade, double nota) {
        super(nome, idade);

        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Aluno: %s - Idade: %d - Nota: %.1f \n", super.nome, super.idade, nota);
    }
}
