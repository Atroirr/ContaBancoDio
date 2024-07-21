package org.example;

public class ContaTerminal {

    protected Integer numero;
    protected String agencia;
    protected String nomeCliente;
    protected Double saldo = 0.0;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ContaTerminal(){}

    @Override
    public String toString() {
        return "Dados da conta: \n" +
                "Numero: " + numero + "\n" +
                ", Agencia: " + agencia + '\n' +
                ", Nome do Cliente: " + nomeCliente + '\n' +
                ", Saldo: " + saldo;
    }
}