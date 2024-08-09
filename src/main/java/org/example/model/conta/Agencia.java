package org.example.model.conta;

import lombok.Getter;
import lombok.Setter;
import org.example.contas.ContaPoupanca;
import org.example.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class Agencia {

    private static int NUMERO_CONTAS = 1;

    private final int numero;
    private final List<Conta> contas;

    public Agencia(int numero) {
        this.numero = numero;
        contas = new ArrayList<>();
    }
    public Conta criarConta(Cliente cliente,int tipo) {
        Conta conta = getConta(cliente);
        if (conta == null) {
            if (tipo == Conta.TIPO_CONTA_POUPANCA) {
                conta = new ContaPoupanca(NUMERO_CONTAS++, this, cliente);
            } else {
                throw new RuntimeException("O TIPO DE CONTA INFORMADO NÃO É CONSIDERADO VÁLIDO!");
            }

            contas.add(conta);
        }
        return conta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencia agencia = (Agencia) o;
        return numero == agencia.numero && Objects.equals(contas, agencia.contas);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(numero, contas);
    }

    public Conta getConta(Cliente cliente) {
        for (Conta conta : contas) {
            if (conta.equals(cliente))
                return conta;
        }
        return null;
    }

    public void imprimeRelatorio() {

        System.out.println("\n============================================================");
        System.out.println("            Agência " + numero + " :: Relatório de Contas");
        System.out.println("==============================================================");

        if (contas.isEmpty()) {
            System.out.println("\tNÃO EXISTE NENHUM CADASTRO DE CONTA NESSA AGÊNCIA.");
        } else {
            for (Conta conta : contas) {
                System.out.println("\t" + conta);
            }
        }
        System.out.println("============================================================\n");
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "numero: " + numero +
                ", contas: " + contas.size() +
                '}';
    }
}