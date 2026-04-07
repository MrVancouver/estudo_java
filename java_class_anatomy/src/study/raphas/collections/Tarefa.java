package study.raphas.collections;
//estudando list
public class Tarefa {
    private String descricao;

    Tarefa(String descricao){
        this.descricao = descricao; 
    }
    public String get_descricao(){
        return descricao;
    }
    @Override
    public String toString(){
        return descricao;
    }
}
