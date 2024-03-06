package org.example;

public class Main {
    public static void main(String[] args) {

        ProductLeaf pendrive = new ProductLeaf(50, "pendrive");
        ProductLeaf bicicleta = new ProductLeaf(5000, "bicicleta");

        ProductComposite caixa = new ProductComposite();
        caixa.addProduct(pendrive);
        caixa.addProduct(bicicleta);

        System.out.println(pendrive.getPrice());
        System.out.println(bicicleta.getPrice());
        System.out.println(caixa.getPrice());

    }
}
