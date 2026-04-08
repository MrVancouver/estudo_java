# Introdução
A definição de Programação Orientada a Objetos é definida por uma abordagem estruturada e organizada para modelar sistemas complexos. POO envolve a criação de classes e objetos que representam entidades do mundo real. Por exemplo:
```java
public class Pessoa{
	String nome;
	int idade;
}
public class Main{
	public static void main(String[] args){
		pessoa p1 = new Pessoa();
		p1.nome = "Raphael";
		p1.idade = 22;
	}
}
```
## Modelagem(como pensar como programador)
Modelagem em Programação Orientada a Objetos (POO) é o processo de representar coisas do mundo real usando classes e objetos, organizando o código com base no que essas coisas têm (atributos) e no que elas fazem (métodos).

|Nome|Definição|
|-----------|-------------------------------------------------------------|
|Classe| É o modelo que define como os objetos serão.|
|Instância/Objeto| É um objeto criado a partir da classe.|
|Atributos (características)|São os dados que o objeto possui.|
|Métodos (comportamentos)|São ações que o objeto pode fazer.|
```java
class Gato {
    String nome;
    double peso;

    void miar() {
        System.out.println("Miau");
    }
}

public class Main {
    public static void main(String[] args) {

        // criando instância
        Gato g1 = new Gato();

        // definindo atributos
        g1.nome = "Mingau";
        g1.peso = 4.5;

        // usando método
        g1.miar();
    }
}
```

## Aprofundando em Atributos e Métodos
É necessário criar a comparação com o mundo real, nesse caso pensamos os atributos como a característica de uma pessoa e os métodos como as ações dessa pessoa
```java
public class Pessoa{
	String nome;
	int idade;
	// características = atributos
	void falar(){
		System.out.println("Olá estou falando");
	}
	void comer(){
		System.out.println("Comendo comida");
	}
	// ações = métodos
}
```
Temos dois termos que são os de **Estado**, **Comportamento** e **Implementação**. Eles estão relacionados ao método, sendo o comportamento aquilo que define ***o que o código faz*** (e isso independe da existência de linhas de código) e a implementação é ***como o código faz***, sendo melhor expresso pela seguinte lógica.
O Estado é o momento em que um atributo se encontra.

*estado*(momento do atributo antes da função)
*comportamento* (conceito)
 função(){
  *implementação* (prática)
 }
 *estado*(momento do atributo após a função)
 
 ## Construtores
 É um bloco especial de uma classe que é executado automaticamente quando um objeto é criado, usado para inicializar seu estado inicial. Podendo definir regras e validar o estado dos atributos e receber e aplicar valores aos atributos. Por exemplo:
 ```java
class Gato {
    String nome;
    double peso;
    boolean surdo;

    Gato(String nome, double peso, boolean surdo) {

        // validação
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        if (peso < 0) {
            throw new IllegalArgumentException("Peso não pode ser negativo");
        }

        // aplicação do estado
        this.nome = nome;
        this.peso = peso;
        this.surdo = surdo;
    }
}
```
```java

public class Main {
    public static void main(String[] args) {

        // ✅ criando gato válido
        Gato g1 = new Gato("Mingau", 4.5, false);

        System.out.println("Nome: " + g1.nome);
        System.out.println("Peso: " + g1.peso);
        System.out.println("Surdo: " + g1.surdo);

        System.out.println("----------------------");

        // ❌ criando gato inválido (vai dar erro)
        Gato g2 = new Gato("", -2, true);

        System.out.println(g2.nome); // nem chega aqui
    }
}
```
## Atributos Private e Métodos Getter e Setter
Esses são as principais funções para se trabalhar com atributos que não podem ser acessadas fora da classe em que foi criada. O intuito não é esconder os dados mas sim manter eles controlados através de métodos getter e setter. Esse é o princípio do encapsulamento que será visto mais pra frente.

#### Private:
Restringe o acesso direto aos atributos da classe, impedindo que outras partes do código modifiquem o estado do objeto sem controle.

#### Getter:
Método que permite acessar (ler) o valor de um atributo de forma controlada.

#### Setter:
Método que permite modificar o valor de um atributo, aplicando regras para garantir que o estado permaneça válido.
```java
class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }
}
// evitando: 
conta.saldo = -1000;
// pois dessa maneira o estado do atributo pode mudar
// de forma que quebre a regra de negócio
// maneira correta:
conta.sacar(100);
```

# Pilares da POO
## 1. Encapsulamento
Encapsulamento é o mecanismo que protege o estado interno de um objeto e controla como ele pode ser acessado e modificado. A segurança do encapsulamento não envolve senhas, login ou autentificação de entrada, a segurança é a segurança do estado do objeto, não permitindo o acesso dele diretamente por outras classes.

**Exemplo de não encapsulamento:**
```java
class Conta {
    public double saldo;
}
conta.saldo = -1000; // acesso permitido
```
Nesse exemplo, eu consigo acessar e modificar o estado do atributo diretamente e fora da classe em que ele foi criada.

**Exemplo de encapsulamento:**
```java
class Conta {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
```
Nesse exemplo o encapsulamento garante que eu só vou conseguir acessar e mudar o estado do atributo fora da classe criada com os métodos getter e setter, e nesses métodos eu passo regras claras de modificação e acesso para que haja a segurança do estado do atributo. 
## 2. Herança
Herança é um mecanismo que permite a reutilização de atributos e métodos de uma outra classe denominada classe pai. Funciona com um sistema de hierarquia e com um processo de lógica simples: "O filho herda as características do pai".
Exemplo sem herança:
```java
class Animal {
    String nome;

    void dormir() {
        System.out.println("Dormindo...");
    }
}

class Gato extends Animal {
}
```
Com isso gato possui um nome e a função de dormir, sem precisar repetir código e deixando todo o processo unificado.
```java
class Gato {
    String nome;
    void dormir() {
		System.out.println("Dormindo...");
	}
}

class Cachorro {
    String nome;
    void dormir() {
		System.out.println("Dormindo...");
	}
}
```

Para fixar e construir pense na frase:
"O -___(classe filha)___- é um tipo de  -___(classe pai)___-?"
No nosso caso, o gato e o cachorro são um tipo de animal, então faz sentido usar essa lógica.
 
## 3. Abstração
Abstração é criar um modelo simplificado que serve como base, definindo apenas o que é essencial e deixando os detalhes para serem completados por outras classes-filha. É definido o contexto e comportamentos genérico que serão melhor detalhados em outros momentos do código.

**Abstração de Classes**
```java
abstract class Funcionario {
    String nome;
    double salario;

    void baterPonto() {
        System.out.println(nome + " bateu ponto");
    }

    void receberSalario() {
        System.out.println(nome + " recebeu " + salario);
    }
}

class Medico extends Funcionario {
}
public class Main {
    public static void main(String[] args) {

        Medico m = new Medico();
        m.nome = "Dr. João";
        m.salario = 5000;

        m.baterPonto();
        m.receberSalario();
    }
}
```
Adendo: Embora possível como mostrado acima, não é válido criar uma classe abstrata sem um método abstrato. Num ponto de vista lógico, a abstração serve para generalizar comportamentos que serão especificados mais pra frente, então se criamos uma classe sem comportamentos não há motivos de fazer abstração. Por isso...

**Abstração de métodos**
Abstração de métodos é criar métodos que não possuem implementação, obrigando as classes-filha a dizerem como funciona. Você diz que deve ser feito, mas quem dira como será feito é a classe-filha. Por exemplo:
```java
abstract class Animal {
    abstract void emitirSom();
}
class Gato extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Miau");
    }
}
class Cachorro extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
}
```
Ele não faz nada sozinho, você não pode instanciar uma classe abstrata, você apenas a cria para que ela sirva de molde para as suas classes-filha.

## 4. Polimorfismo
É a capacidade de um mesmo método ter diferentes comportamentos dependendo do objeto ao qual a referência aponta. Por exemplo:
```java
Animal a = new Gato();
a.emitirSom(); // Miau

a = new Cachorro();
a.emitirSom(); // Au au
```
O comportamento real do método depende do objeto. 

## Extra: Implements
 Interface em Java é um contrato que define métodos que uma classe deve implementar. Ela não implementa a lógica, apenas define o que precisa ser feito. A classe que implementa a interface é responsável por definir como o método funciona. Interfaces ajudam a organizar o código e evitar que classes tenham comportamentos que não fazem sentido.

Por exemplo, em uma classe Funcionário, não faz sentido que todos possam realizar cirurgia.
Em vez de colocar esse método na classe pai, criamos uma interface (ex: Cirurgiao) e aplicamos apenas às classes que realmente precisam, como Médico.
Dessa forma, evitamos que outras classes, como Caminhoneiro ou Vendedor, tenham acesso a comportamentos indevidos.
Jeito errado:
```java
class Funcionario {
    void trabalhar() {
        System.out.println("Trabalhando...");
    }

    void realizarCirurgia() {
        System.out.println("Realizando cirurgia");
    }
}
class Caminhoneiro extends Funcionario { }
class Vendedor extends Funcionario { }

Caminhoneiro c = new Caminhoneiro();
c.realizarCirurgia(); // permitido
```
Jeito certo:
```java
class Funcionario {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando");
    }
}

interface Cirurgiao {
    void realizarCirurgia();
}
class Medico extends Funcionario implements Cirurgiao {

    @Override //garantia de sobrescrição do método
    public void realizarCirurgia() {
        System.out.println(getNome() + " está realizando cirurgia");
    }
}
```
## Extra: Protected
O modificador protected em Java permite que atributos e métodos sejam acessados dentro da própria classe, por todas as classes do mesmo pacote e também por subclasses, mesmo que estejam em pacotes diferentes. Fora do pacote, o acesso só é permitido por meio de herança, e deve ocorrer através da própria instância da subclasse, não por objetos comuns. protected permite acesso na própria classe, no mesmo pacote e em subclasses, inclusive em outros pacotes, desde que o acesso seja feito via herança.
```java
package study.raphas.POO;

public class Animal {
    protected String nome = "Animal";
}
```
```java
package study.raphas.POO;

public class Animal {
    protected String nome = "Animal";

    void teste() {
        System.out.println(nome); // ✔ funciona
    }
}
```
```java
package study.raphas.POO;

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        System.out.println(a.nome); // ✔ funciona
    }
}
```
```java
package outro.pacote;

import study.raphas.POO.Animal;

public class Gato extends Animal {

    void teste() {
        System.out.println(nome); // ✔ funciona
    }
}
```
