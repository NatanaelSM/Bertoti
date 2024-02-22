package org.example;

public class DinheiroStrategy implements PagamentoStrategy{

    @Override
    public void pagar(double valor) {
        System.out.println("Compra no dinheiro no valor de R$" + valor + " realizada com sucesso!");
    }

}
