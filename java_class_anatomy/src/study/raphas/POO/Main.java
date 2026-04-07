package study.raphas.POO;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal("xanim","Miau","Frajola",1012);//nasceu
        a.setIdade(2); //cresceu
    }
}

class Animal{
    private String som;
    private String pelagem;
    private String nome;
    private int chip;
    private int idade = 0;

    //CONSTRUTOR
    Animal(String nome,String som, String pelagem, int chip){
        setNome(nome);
        setSom(som);
        setPelagem(pelagem);
        setChip(chip);
    }
    //GETTERS   
    public String getNome(){
        return nome;
    }
    public String getPelagem(){
        return pelagem;
    }
    public String getSom(){
        return som;
    }
    public int getChip(){
        return chip;
    }
    public int getIdade(){
        return idade;
    }
    //SETTERS
    public void setNome(String nome){
        if(nome == null || nome.isEmpty()){
            this.nome = "Galaxy Destroyer";
        }
        else{
        this.nome = nome;
        }
    }
    public void setPelagem(String pelagem){
        if(pelagem == null || pelagem.isEmpty()){
            this.pelagem = "PCB";
        }
        else{
        this.pelagem = pelagem;
        }
    }
    public void setSom(String som){
    if(som == null || som.isEmpty()){
        this.som = "Som genérico";
    }    
    else{
        this.som = som;
    }
    }
    public void setChip(int num){
        if (num <= 0){
           System.out.println("Número invalido");
        }
        else{
        this.chip = num;
        }
    }
    public void setIdade(int num){
        if (num < 0){
            this.idade = 0;
        }
        else{
            this.idade = num;
        }
    }
}

interface Nadador {
    void nadar();
}
