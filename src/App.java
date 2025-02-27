import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Sistema Iniciado");

        Professor professor = new Professor("Tiago", "tiago@gmail.com");
        Turma turma = new Turma("324", professor);
        Aluno aluno1 = new Aluno("Gustavo", "gustavo@gmail.com");
        Aluno aluno2 = new Aluno("Anderson", "Andi@gmail.com");

        turma.inserirAluno(aluno1);
        turma.inserirAluno(aluno2);
        turma.listarAlunos();

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome o aluno: ");
        String nome = sc.nextLine();
        System.out.println("Informe o email o aluno: ");
        String email = sc.nextLine();


        Aluno aluno3 = new Aluno(nome, email);
        turma.inserirAluno(aluno3);

        turma.listarAlunos();
        System.out.println("Fim do sistema!");
    }
}
