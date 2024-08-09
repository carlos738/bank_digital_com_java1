package org.example.model.conta;

import lombok.Getter;

@Getter
public enum TipoDeConta {
    CONTA_CORRENTE("Conta Corrente"),
    CONTA_POUPANCA("Conta Poupanca");

    private final String descricao;

    TipoDeConta(String descricao) {
        this.descricao = descricao;
    }
}
