package org.example;

public class Carro {

    private String marca;
    private String modelo;
    private float cilindrada;
    private boolean automatico;
    private int preco;

    public Carro(String marca, String modelo, float cilindrada, boolean automatico, int preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.automatico = automatico;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
