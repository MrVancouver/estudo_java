package study.raphas.collections.list;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtor
    Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    //métodos GET
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAno(){
        return anoPublicacao;
    }
    @Override
    public String toString() {
    return "Livro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", anoPublicacao=" + anoPublicacao +
        '}';

    }
}
