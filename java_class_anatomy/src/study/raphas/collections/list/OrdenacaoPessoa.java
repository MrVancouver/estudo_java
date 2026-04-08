package study.raphas.collections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){this.pessoaList = new ArrayList<>();}
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){ //Comparable
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    public List<Pessoa> ordendarPorAltura(){ //Comparator
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura,new comparatorPorAltura());
        return pessoaPorAltura;
    }
    public static void main(String[] args) {
        OrdenacaoPessoa ordenar = new OrdenacaoPessoa();
        ordenar.adicionarPessoa("Raphael", 23, 1.96);
        ordenar.adicionarPessoa("Vanessa", 46, 1.70);
        ordenar.adicionarPessoa("Julia", 22, 1.72);

        System.out.println(ordenar.pessoaList);
        System.out.println(ordenar.ordenarPorIdade());
        System.out.println(ordenar.ordendarPorAltura());
    }


}
