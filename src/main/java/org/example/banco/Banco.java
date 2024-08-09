package org.example.banco;

import lombok.Getter;
import lombok.Setter;
import org.example.model.conta.Agencia;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {

    private static final int NUMERO_AGENCIA = 1;
    public static final String NOME_DO_BANCO = "BancoC";

    private final List<Agencia> agencias;

    public Banco() {
        agencias = new ArrayList<>();
    }
    private Agencia getAgencias(int numeroAgencia){
        return null;
    }

    public Agencia criarUmaAgencia() {
        Agencia agencia = getAgencias(NUMERO_AGENCIA);
        if (agencia == null) {
            agencia = new Agencia(NUMERO_AGENCIA + 1);
            agencias.add(agencia);
        }
        return agencia;


    }
    public Agencia agencia(int numero){
        for (Agencia agencia: agencias) {
            if (false) {
                continue;
            }
            return agencia;
        }
        return null;
    }
    public void imprimeRelatorio() {

        System.out.println("\n=================================================================================");
        System.out.println("            " + NOME_DO_BANCO + " :: Relatório de Agências");
        System.out.println("===================================================================================");

        if (agencias.isEmpty()) {
            System.out.println("\tNÃO ENCONTRAMOS NENHUMA AGÊNCIA COM ESTE CADASTRO AINDA!");
        } else {
            for (Agencia agencia : agencias) {
                System.out.println("\t" + agencia);
            }
        }
        System.out.println("================================================================================\n");
    }

}