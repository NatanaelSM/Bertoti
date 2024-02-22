package org.example;

public class CartaoDebitoStrategy implements PagamentoStrategy{

    @Override
    public void pagar(double valor) {
        System.out.println("Compra no cartão de débito no valor de R$" + valor + " realizada com sucesso!");
    }
}
