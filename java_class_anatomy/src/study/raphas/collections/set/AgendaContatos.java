package study.raphas.collections.set;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatosSet;
    public AgendaContatos(){
        this.contatosSet = new HashSet<>();
    }
    public void AdicionarContatos(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }
    public void ExibirContatos(){
        System.out.println(contatosSet);
    }
    public Set<Contato> PesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatosSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(int numeroAntigo, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatosSet){
            if(c.getNumero() == numeroAntigo){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public Contato atualizarNomeContato(int numero, String nomeNovo){
        Contato contatoAtualizado = null;
        for(Contato c : contatosSet){
            if(c.getNumero() == numero){
                c.setNome(nomeNovo);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.AdicionarContatos("Raphael",1234);
        agenda.AdicionarContatos("Raphael",1235);
        agenda.AdicionarContatos("taliz",1234);
        agenda.AdicionarContatos("Julia",1267);
        agenda.ExibirContatos();
        agenda.atualizarNumeroContato(1234,1238);
        agenda.ExibirContatos();
        System.out.println(agenda.PesquisarPorNome("Raphael"));
    }

}
