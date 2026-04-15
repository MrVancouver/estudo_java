package study.raphas.collections.set;
import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome(){
        return nome;
    }
    public int getCodigo(){
        return codigoConvite;
    }
    @Override
    public String toString(){
        return "Convidado{" +
        "nome'" + nome + '\'' +
        "codigoConvite'" + codigoConvite +
        "}";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Convidado convidado)) return false;
        return getCodigo() == convidado.getCodigo();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getCodigo());
    }

}
