package model;

import utils.ContaException;

public class Conta {
    private int num;
    private String nome;
    private double saldo;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos para sacar e depositar
    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor) throws ContaException {
        if (valor > saldo){
            throw new ContaException(1);
        } else {
            saldo -= valor;
        }
    }
}
