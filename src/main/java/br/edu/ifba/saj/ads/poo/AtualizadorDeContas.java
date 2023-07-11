package br.edu.ifba.saj.ads.poo;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    public void roda(Conta c) {
        // aqui você imprime o saldo anterior, atualiza a conta,
        // e depois imprime o saldo final
        // lembrando de somar o saldo final ao atributo saldoTotal
    }
    // outros métodos, colocar o getter para saldoTotal!
}