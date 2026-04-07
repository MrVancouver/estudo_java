package study.raphas.collections;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>(); 
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if(t.get_descricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
            System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número total de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("vaca");
        listaTarefa.adicionarTarefa("vaca");
        listaTarefa.adicionarTarefa("boi");
        listaTarefa.obterDescricoesTarefas();
        System.out.println("Número total de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("vaca");
        System.out.println("Número total de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());
    }
}
