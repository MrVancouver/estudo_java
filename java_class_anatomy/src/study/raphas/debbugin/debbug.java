package study.raphas.debbugin;

public class debbug {
public static void main(String[] args) {
    System.out.println("Entrou no metodo main");
    a();
    System.out.println("Terminou o método main.");
}
static void a(){
    System.out.println("Entrou no método a");
    b();
    System.out.println("Terminou o método a");
}
static void b(){
    System.out.println("Entrou no método b");
    for(int x=1;x<20;x++) System.out.println(x);
    c();
    System.out.println("Terminou o método b");
}
static void c(){
    System.out.println("Entrou no método c");
    Thread.dumpStack();
    System.out.println("Terminou o método c");
}

}