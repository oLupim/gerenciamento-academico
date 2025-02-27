import java.util.ArrayList;
import java.util.List;

public class Turma {
    public String nome;
    public Professor professor;
    public List<Aluno> alunosMatriculados;

    public Turma(String nome, Professor professor){
        this.nome = nome;
        this.professor = professor;
        this.alunosMatriculados = new ArrayList<>();
    }

    public void inserirAluno(Aluno aluno){
        alunosMatriculados.add(aluno);
        System.out.println("Aluno inserido");
    }

    public void listarAlunos(){
        System.out.println("Lista de Aluno");
        for (Aluno aluno: alunosMatriculados){
            System.out.println("Aluno " + aluno.nome);
        }
    }



}
