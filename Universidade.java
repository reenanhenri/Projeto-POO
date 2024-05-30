import java.util.Scanner;

public class Universidade {
    public static void main(String[] args) {
        AlunoCRUD crud = new AlunoCRUD();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Criar Aluno\n2. Listar Alunos\n3. Atualizar Aluno\n4. Deletar Aluno\n5. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha deixada pelo nextInt

            switch (escolha) {
                case 1:
                    crud.createAluno();
                    break;
                case 2:
                    crud.readAlunos();
                    break;
                case 3:
                    crud.updateAluno();
                    break;
                case 4:
                    crud.deleteAluno();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}