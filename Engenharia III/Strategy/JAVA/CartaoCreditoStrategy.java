package org.example;

public class CartaoCreditoStrategy implements PagamentoStrategy{

    @Override
    public void pagar(double valor) {
        System.out.println("Compra no cartão de crédito no valor de R$" + valor + " realizada com sucesso!");
    }
}
