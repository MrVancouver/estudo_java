package study.raphas.collections.list;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){this.livroList = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisaPorAno(int ano_inicio, int ano_final){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAno() >= ano_inicio && l.getAno()<= ano_final){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros Catalago = new CatalogoLivros();
        Catalago.adicionarLivro("Ordem da Fenix", "J.K. Rowling",1994);
        Catalago.adicionarLivro("Pedra Filosofal", "J.K. Rowling",1990);
        Catalago.adicionarLivro("Ordem da Fenix","J. Rowling",1990);
        
        System.out.println(Catalago.pesquisaPorAno(1991,2000));
        System.out.println(Catalago.pesquisarPorTitulo("Pedra Filosofal"));
        System.out.println(Catalago.pesquisarPorAutor("J. Rowling"));
    }

}
