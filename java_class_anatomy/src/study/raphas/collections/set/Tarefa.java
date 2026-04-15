package study.raphas.collections.set;
import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }
    public String getDescricao() {
        return descricao;
    }
    public boolean isConcluida(){
        return concluida;
    }
    public void serDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }
    @Override
    public String toString(){
        return "Tarefa{" +
        "descricao'" + descricao + '\'' +
        "concluida'" + concluida +
        "}" + "\n";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Tarefa tarefa)) return false;
        return getDescricao() == tarefa.getDescricao();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getDescricao());
    }

}
