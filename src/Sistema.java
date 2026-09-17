
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Scanner scn = new Scanner(System.in);

    public void iniciar() {

        int opc;

        do {
            System.out.println("\n============= SISTEMAS DOS ALUNOS =============\n");
            System.out.println("\t1 - Cadastrar Alunos");
            System.out.println("\t2 - Listar Alunos");
            System.out.println("\t3 - Buscar Alunos");
            System.out.println("\t4 - Remover Alunos");
            System.out.println("\t0 - Sair");
            System.out.print("\tEscolha uma opção: ");

            opc = scn.nextInt();
            scn.nextLine();

            switch (opc) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    buscarAluno();
                    break;
                case 4:
                    removerAluno();
                    break;
                case 0:
                    System.out.println("\tSaindo do Sistema");
                    break;
                default:
                    System.out.println("\nOpção Invalida");
                    break;
            }
        } while (opc != 0);
    }

    private void cadastrarAluno() {

        System.out.println("\nNome do Aluno: ");
        String nome = scn.nextLine();

        System.out.println("\n1° nota: ");
        double nota1 = scn.nextDouble();

        System.out.println("\n2° nota: ");
        double nota2 = scn.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2);
        alunos.add(aluno);

        System.out.println("\n==========================");
        System.out.println("Aluno Cadastrado Com Sucesso");
        System.out.println("\n==========================");
    }

    private void listarAlunos() {
        if (alunos.isEmpty()) {

            System.out.println("\n=======================");
            System.out.println("\nNenhum Aluno Cadastrado");
            System.out.println("\n=======================");
            return;
        }

        System.out.println("\n=====ALUNOS CADASTRADOS=====");

        for (Aluno aluno : alunos) {
            aluno.ExibirDados();
            System.out.println("\n==========================");
        }

    }

    private void buscarAluno() {
        System.out.println("\nInsira o nome do Aluno: ");
        String nome = scn.nextLine();

        for (Aluno aluno : alunos) {

            if (aluno.getNome().equalsIgnoreCase(nome)) {
                aluno.ExibirDados();
                return;
            }
        }

        System.out.println("\n====================");
        System.out.println("\nAluno Nao Encontrado");
        System.out.println("\n====================");
    }

    private void removerAluno() {
        System.out.println("\nInsira o nome do Aluno: ");
        String nome = scn.nextLine();

        for (Aluno aluno : alunos) {

            if (aluno.getNome().equalsIgnoreCase(nome)) {
                alunos.remove(aluno);

                System.out.println("\n==========================");
                System.out.println("\nAluno Removido com Sucesso");
                System.out.println("\n==========================");
                return;
            }
        }

        System.out.println("\n====================");
        System.out.println("\nAluno Não Encontrado");
        System.out.println("\n====================");
    }
}
