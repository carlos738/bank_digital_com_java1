package org.example.model.conta;

import lombok.Getter;
import lombok.Setter;
import org.example.model.Cliente;
import org.example.service.IConta;

@Getter
@Setter
public abstract class Conta implements IConta {
    public static final int TIPO_CONTA_POUPANCA = 1;
    public static final int TIPO_CONTA_CORRENTE = 1;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta( Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        //this.saldo = saldo;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor, IConta ContaDeOrigem) {
        if (valor > this.saldo){
            System.out.println("Informe valor saldo:" + ContaDeOrigem);
        }
        saldo -=valor;
    }

    @Override
    public void despositar(double valor, IConta contaDeDestino) {

        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contDeDestino) {
        this.sacar(valor, contDeDestino);
        contDeDestino.despositar(valor, contDeDestino);
    }

    @Override
    public void imprimirExtrato() {

    }

    public abstract void depositar(int i);
}
