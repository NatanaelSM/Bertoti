package org.example;

import java.util.ArrayList;

public class ProductLeaf implements ProductComponent{

    private int price;
    private String nome;

    public ProductLeaf(int price, String nome) {
        this.price = price;
        this.nome = nome;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
