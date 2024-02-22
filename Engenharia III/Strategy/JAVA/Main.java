package org.example;

public class Main {
    public static void main(String[] args) {
        //Criando carros da loja
        Carro carro1 = new Carro("Chevrolet", "Camaro", 2.5f,
                true, 150000);
        Carro carro2 = new Carro("Buggati", "Chiron", 4.0f,
                true, 15000000);
        Carro[] carros = new Carro[2];
        carros[0] = carro1;
        carros[1] = carro2;

        //Criando motos da loja
        Moto moto1 = new Moto("Ducati", "Pindagale", 2.0f,
                true, 150000);
        Moto moto2 = new Moto("BMW", "S1000", 3.0f,
                true, 200000);
        Moto[] motos = new Moto[2];
        motos[0] = moto1;
        motos[1] = moto2;

        //Criando cliente
        Cliente cliente = new Cliente("Jorge", "45588892804", "3968854798");
        cliente.setPagamentoStrategy(new CartaoCreditoStrategy());

        //Criando a loja
        Loja loja = new Loja(motos, carros);
        loja.venderCarro(loja.getCarros()[0], cliente);
        loja.venderMoto(loja.getMotos()[1], cliente);
    }
}
