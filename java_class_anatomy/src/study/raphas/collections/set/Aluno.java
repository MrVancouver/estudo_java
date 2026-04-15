package study.raphas.collections.set;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double media;

    Aluno(String nome, long matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }
    @Override
    public int compareTo(Aluno a){
        return nome.compareToIgnoreCase(a.getNome());
    }
    public String getNome(){
        return nome;
    }
    public long getMatricula(){
        return matricula;
    } 
    public double getMedia(){
        return media;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(long matricula){
        this.matricula = matricula;
    }
    @Override
    public String toString(){
        return "Tarefa{" +
        "nome '" + nome + '\'' +
        "matricula '" + matricula + '\''+
        "media '" + media +'\''+
        "}" + "\n";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getMatricula());
    }
}

class ComparatorPorMedia implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2){
        return Double.compare(a1.getMedia(), a2.getMedia()); 
    }
}
