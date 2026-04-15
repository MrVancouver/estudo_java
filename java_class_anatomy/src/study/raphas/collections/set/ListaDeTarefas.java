package study.raphas.collections.set;
import java.util.HashSet;
import java.util.Set;
public class ListaDeTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaDeTarefas(){
        this.tarefaSet = new HashSet<>(); 
    }
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa paraRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    paraRemover = t;
                    break;
                }
            }
            tarefaSet.remove(paraRemover);
        }
        else{
            System.out.println("O conjunto está vazio.");
        }
        if(paraRemover == null){
            System.out.println("O conjunto está vazio.");
        }
    }
    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public Set<Tarefa> tarefasConcluidas(){
        Set<Tarefa> concluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.isConcluida() == true){
                    concluidas.add(t);
                }
            }
        }
        return concluidas;
    }
    public Set<Tarefa> tarefasPendentes(){
        Set<Tarefa> pendentes = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.isConcluida() == false){
                    pendentes.add(t);
                }
            }
        }
        return pendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                    break;
                }
            }
        }
        else{
            System.out.println("Listagem de tarefas vazia!");
        }
    }
    public void marcarTarefaPendente(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                    break;
                }
            }
        }
        else{
            System.out.println("Listagem de tarefas vazia!");
        }
    }
    public void LimparListaTarefas(){
        if(tarefaSet.isEmpty()){
            System.out.println("Lista já está vazia!");
        }
        else{
            tarefaSet.clear();
        }
    }
    public static void main(String[] args) {
    // Criando uma instância da classe ListaTarefas
    ListaDeTarefas listaTarefas = new ListaDeTarefas();

    // Adicionando tarefas à lista
    listaTarefas.adicionarTarefa("Estudar Java");
    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
    listaTarefas.adicionarTarefa("Ler livro");
    listaTarefas.adicionarTarefa("Preparar apresentação");

    // Exibindo as tarefas na lista
    listaTarefas.exibirTarefas();

    // Removendo uma tarefa
    listaTarefas.removerTarefa("Fazer exercícios físicos");
    listaTarefas.exibirTarefas();

    // Contando o número de tarefas na lista
    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

    // Obtendo tarefas pendentes
    System.out.println(listaTarefas.tarefasPendentes());

    // Marcando tarefas como concluídas
    listaTarefas.marcarTarefaConcluida("Ler livro");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    // Obtendo tarefas concluídas
    System.out.println(listaTarefas.tarefasConcluidas());

    // Marcando tarefas como pendentes
    listaTarefas.marcarTarefaPendente("Estudar Java");
    listaTarefas.exibirTarefas();

    // Limpando a lista de tarefas
    listaTarefas.LimparListaTarefas();
    listaTarefas.exibirTarefas();
  }
        
}

