package org.example.contas;

import org.example.model.Cliente;
import org.example.model.conta.Agencia;
import org.example.model.conta.Conta;
import org.example.service.IConta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int i, Agencia agencia, Cliente cliente) {

        super(cliente);
    }


    @Override
    public void sacar(double valor, IConta ContaDeOrigem) {
        super.sacar(valor, ContaDeOrigem);
    }

    @Override
    public void despositar(double valor, IConta contaDeDestino) {
        super.despositar(valor, contaDeDestino);
    }

    @Override
    public void transferir(double valor, IConta contDeDestino) {
        super.transferir(valor, contDeDestino);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Imprimir extrato Conta Poupanca. ");
        super.imprimirExtrato();
    }

    @Override
    public void depositar(int i) {

    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
