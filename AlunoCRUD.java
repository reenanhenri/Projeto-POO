import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoCRUD {
    private List<Aluno> alunos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Método para criar um novo aluno
    public void createAluno() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        alunos.add(new Aluno(nome, cpf, matricula));
        System.out.println("Aluno criado com sucesso!");
    }

    // Método para listar todos os alunos
    public void readAlunos() {
        System.out.println("Lista de alunos:");
        alunos.forEach(aluno -> aluno.exibirDetalhes());
    }

    // Método para atualizar as informações de um aluno existente
    public void updateAluno() {
        System.out.print("CPF do aluno a ser atualizado: ");
        String cpf = scanner.nextLine();
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                System.out.print("Novo nome: ");
                aluno.setNome(scanner.nextLine());
                System.out.print("Nova matrícula: ");
                aluno.setMatricula(scanner.nextLine());
                System.out.println("Aluno atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Aluno não encontrado!");
    }

    // Método para deletar um aluno existente
    public void deleteAluno() {
        System.out.print("CPF do aluno a ser deletado: ");
        String cpf = scanner.nextLine();
        alunos.removeIf(aluno -> aluno.getCpf().equals(cpf));
        System.out.println("Aluno deletado com sucesso!");
    }
}