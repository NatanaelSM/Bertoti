package org.example;

import java.util.ArrayList;

public class ProductComposite implements ProductComponent{

    private ArrayList<ProductComponent> children;

    public void setChildren(ArrayList<ProductComponent> children) {
        this.children = children;
    }

    @Override
    public int getPrice() {
        int valorTotal = 0;
        for(ProductComponent product : this.children){
            valorTotal =+ product.getPrice();
        }
        return valorTotal;
    }

    public void addProduct(ProductComponent product) {
        children.add(product);
    }

    public void removeProduct(ProductComponent product) {
        int cont = 0;
        for(ProductComponent p : this.children) {
            if (p == product) {
                this.children.remove(cont);
            }
            cont++;
        }
    }

    public ArrayList<ProductComponent> getChildren() {
        return this.children;
    }
}
