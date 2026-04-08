package study.raphas.collections.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Classe que implementa Comparable
class Produto implements Comparable<Produto> {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }
}

public class StudyComparable {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Teclado", 150.0));
        produtos.add(new Produto("Mouse", 50.0));
        produtos.add(new Produto("Monitor", 900.0));

        // Ordena usando Comparable
        Collections.sort(produtos);

        for (Produto p : produtos) {
            System.out.println(p.nome + " - " + p.preco);
        }
        System.out.println("__________________________________");
        
        
        // Comparator por nome
        Comparator<Produto> porNome = (p1, p2) ->
            p1.nome.compareTo(p2.nome);

        // Ordena usando Comparator
        Collections.sort(produtos, porNome);

        for (Produto p : produtos) {
            System.out.println(p.nome + " - " + p.preco);
    }
}
}