package org.example;

public class Cliente {

    private PagamentoStrategy pagamentoStrategy;
    private String nome;
    private String cpf;
    private String rg;

    public Cliente(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public PagamentoStrategy getPagamentoStrategy() {
        return pagamentoStrategy;
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void realizarPagamento(int valor){
        this.pagamentoStrategy.pagar(valor);
    }
}
