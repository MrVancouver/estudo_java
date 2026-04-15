package study.raphas.collections.set;
import java.util.HashSet;
import java.util.Set;
public class ConjuntoConvidado {
    
    private Set<Convidado> convidadoSet;
    public ConjuntoConvidado(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigo() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjunto = new ConjuntoConvidado();

        conjunto.adicionarConvidado("Raphael",1234);
        conjunto.adicionarConvidado("Vanessa",1235);
        conjunto.adicionarConvidado("Julia",1234);

        System.out.println(conjunto.contarConvidados());
        conjunto.exibirConvidados();
        
        conjunto.adicionarConvidado("Julia",1236);
        
        System.out.println(conjunto.contarConvidados());
        conjunto.exibirConvidados();
        
        conjunto.removerConvidadoPorCodigo(1234);

        System.out.println(conjunto.contarConvidados());
        conjunto.exibirConvidados();
    }


}
