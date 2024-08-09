package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome) {
        this.nome = nome;
        this.cpf =  "11223344509";
        this.endereco =  "Rua C";
    }
    /*
    public void Cliente1(String nome) {
        this.nome = nome;
        this.cpf = cpf = "00998877667";
        this.endereco = endereco = "Rua C";
    }

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
*/
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
