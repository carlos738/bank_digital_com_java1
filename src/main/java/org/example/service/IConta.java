package org.example.service;

public interface IConta {
    void sacar(double valor,IConta ContaDeOrigem);
    void despositar(double valor, IConta contaDeDestino);
    void transferir(double valor,IConta contDeDestino);
    void imprimirExtrato();
}
