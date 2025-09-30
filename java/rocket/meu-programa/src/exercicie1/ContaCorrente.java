package exercicie1;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String titular;
    LocalDate dataDeNascimento;
    private Double saldo;
    Status status;

    Double consultaSaldo() {
        return saldo;
    }

    List consultarExtrato(LocalDate dataInicial, LocalDate dataFinal) {
        return List.of();
    }

    void cancelar(String justificativa) {

    }

    void transferir(ContaCorrente contaDeDestino, Double valorTransferido) {

    }

    void sacar(double valorSolicitado) {

    }
}

enum Status {
    ACTIVE,
    INACTIVE
}
