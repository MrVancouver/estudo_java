package study.raphas.collections.list;
import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;
    

    Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public int compareTo(Pessoa p){//comparable
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }

    @Override
    public String toString() {
    return "Pessoa{" +
        "Nome='" + nome + '\'' +
        ", idade='" + idade + '\'' +
        ", altura=" + altura +
        '}';

    }
}
class comparatorPorAltura implements Comparator<Pessoa>{ //comparator
    @Override
    public int compare(Pessoa p1,Pessoa p2){
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
