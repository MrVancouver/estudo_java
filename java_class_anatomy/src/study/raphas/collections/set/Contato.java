package study.raphas.collections.set;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }
    public String getNome(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumero(int num){
        this.numero = num;
    }
    

    @Override
    public String toString(){
        return "Contato{" +
        "nome'" + nome + '\'' +
        "numero'" + numero +
        "}" + "\n";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Contato contato)) return false;
        return getNumero() == contato.getNumero();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getNumero());
    }



}
