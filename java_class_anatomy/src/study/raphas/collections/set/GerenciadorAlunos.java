package study.raphas.collections.set;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setAluno;
    public GerenciadorAlunos(){
        this.setAluno = new HashSet<>();
    }
    public void AdicionarAluno(String nome, long matricula, double media){
        setAluno.add(new Aluno(nome, matricula, media));
    }
    public void RemoverAluno(long matricula){
        if(!setAluno.isEmpty()){
            for(Aluno a : setAluno){
                if(a.getMatricula() == matricula){
                    setAluno.remove(a);
                    break;
                }
                else{
                    System.out.println("Matricula não correspondente!");
                }
            }
        }
        else{
            System.out.println("Não Lista vazia");
        }
    }
    public Set<Aluno> ExibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>();
        alunosPorNome.addAll(setAluno);
        return alunosPorNome;
    }
    public Set<Aluno> ExibirAlunosPorMedia(){
        Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorPorMedia());
        alunosPorMedia.addAll(setAluno);
        return alunosPorMedia;
    }
    public void ExibirAlunos(){
        if(!setAluno.isEmpty()){
            for(Aluno a : setAluno){
                System.out.println(a);
            }
        }
        else{
            System.out.println("Lista Vazia");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos GerAlunos = new GerenciadorAlunos();

        GerAlunos.AdicionarAluno("Raphael",1L,3);
        GerAlunos.AdicionarAluno("Julia",2L,5);
        GerAlunos.AdicionarAluno("Vanessa",3L,10);
        GerAlunos.AdicionarAluno("Rafael",1L,7);

        // GerAlunos.ExibirAlunos();
        // System.out.println(GerAlunos.ExibirAlunosPorMedia());
        // System.out.println(GerAlunos.ExibirAlunosPorNome());
        
        GerAlunos.RemoverAluno(1L);
        GerAlunos.AdicionarAluno("Rafael",1L,7);

        GerAlunos.ExibirAlunos();
        System.out.println(GerAlunos.ExibirAlunosPorMedia());
        System.out.println(GerAlunos.ExibirAlunosPorNome());

        
    }

}
