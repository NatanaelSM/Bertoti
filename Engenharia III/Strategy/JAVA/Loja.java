package org.example;

public class Loja {

    private Cliente[] clientes;
    private Moto[] motos;
    private Carro[] carros;

    public Loja(Moto[] motos, Carro[] carros) {
        this.motos = motos;
        this.carros = carros;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Moto[] getMotos() {
        return motos;
    }

    public void setMotos(Moto[] motos) {
        this.motos = motos;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }

    public void venderCarro(Carro carro, Cliente cliente){
        cliente.realizarPagamento(carro.getPreco());
        System.out.println("Carro " + carro.getModelo() + " vendido para o cliente " + cliente.getNome() + " com sucesso!");
    }

    public void venderMoto(Moto moto, Cliente cliente){
        cliente.realizarPagamento(moto.getPreco());
        System.out.println("Moto " + moto.getModelo() + " vendida para o cliente " + cliente.getNome() + " com sucesso!");
    }
}