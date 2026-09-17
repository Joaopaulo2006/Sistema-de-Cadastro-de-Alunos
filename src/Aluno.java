
public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double CalcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean Aprovado() {
        return CalcularMedia() >= 7.0;
    }

    public void ExibirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Média: %.2f%n", CalcularMedia());

        if (Aprovado()) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

}
