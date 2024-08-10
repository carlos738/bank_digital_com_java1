
1. Introdução à Orientação a Objetos

A orientação a objetos é baseada em quatro princípios fundamentais:

    Abstração: O processo de simplificar complexidades, focando nos aspectos essenciais de um objeto e ignorando os detalhes irrelevantes.
    Encapsulamento: O encapsulamento oculta os detalhes de implementação de um objeto e expõe apenas uma interface consistente para interagir com ele.
    Herança: A herança permite que uma classe herde atributos e métodos de outra classe, promovendo a reutilização de código e facilitando a extensão.
    Polimorfismo: O polimorfismo permite que um objeto se comporte de várias maneiras diferentes, dependendo do contexto em que é utilizado.

2. Classes e Objetos em Java

Em Java, uma classe é um modelo para criar objetos. Ela define os atributos e métodos que os objetos de uma classe específica terão. Por exemplo:

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
        

Um objeto é uma instância de uma classe. Podemos criar objetos da classe Pessoa da seguinte forma:

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 30);
        Pessoa pessoa2 = new Pessoa("Maria", 25);

        pessoa1.imprimirDados();
        pessoa2.imprimirDados();
    }
}
        

3. Encapsulamento em Java

O encapsulamento em Java é alcançado usando modificadores de acesso, como private, public e protected. Os atributos de uma classe geralmente são declarados como private, e métodos públicos são fornecidos para acessar e modificar esses atributos.

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
}
        

4. Herança em Java

A herança em Java permite que uma classe herde atributos e métodos de outra classe. Isso promove a reutilização de código e facilita a extensão de funcionalidades.

public class Animal {
    public void fazerSom() {
        System.out.println("Som do animal");
    }
}

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Latido");
    }
}
        

5. Polimorfismo em Java

O polimorfismo em Java permite que um objeto se comporte de várias maneiras diferentes, dependendo do contexto em que é utilizado. Isso é alcançado usando métodos sobrescritos e interfaces.

public interface Animal {
    void fazerSom();
}

public class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Latido");
    }
}

public class Gato implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miado");
    }
}
        


