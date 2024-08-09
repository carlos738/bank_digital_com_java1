package org.example;

import org.example.banco.Banco;
import org.example.model.Cliente;
import org.example.model.conta.Agencia;
import org.example.model.conta.Conta;

public class Main {

    public static void main(String[] args) {
        Banco BancoC = new Banco();

        Agencia agencia = BancoC.criarUmaAgencia();
        BancoC.imprimeRelatorio();
        agencia.imprimeRelatorio();


        Cliente clienteMariana = new Cliente("Mariana");
        //Cliente clienteJoana = new Cliente("Joana");
        //Cliente clienteCharles = new Cliente("Charles");

        Conta contaPoupancaMariana = agencia.criarConta(clienteMariana,Conta.TIPO_CONTA_POUPANCA);
        //Conta contaCorrenteJoana = agencia.criarConta(clienteJoana,Conta.TIPO_CONTA_CORRENTE);
        //Conta contaCorrenteCharles = agencia.criarConta(clienteCharles,Conta.TIPO_CONTA_CORRENTE);

        agencia.imprimeRelatorio();

        contaPoupancaMariana.depositar(234);
        contaPoupancaMariana.imprimirExtrato();

        //contaCorrenteCharles.depositar(86);
        //contaCorrenteCharles.imprimirExtrato();

        //contaCorrenteJoana.depositar(886);
        //contaCorrenteJoana.imprimirExtrato();

        contaPoupancaMariana.imprimirExtrato();

    }


}