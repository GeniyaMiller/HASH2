package listProducts;

import product.Product;

import java.util.*;

public class listProducts {
    private HashMap<Product, Double> set = new HashMap<>();

    public listProducts() {
    }


    public void addProduct(Product product) {
        set.put(product, product.getQuantity());
    }

    public void removeProduct(Product product){
        set.remove(product.getName());
    }

    public void showInfo (){
        System.out.println("Список продуктов");
        for (Map.Entry<Product, Double> productEntry: set.entrySet()) {
            System.out.println("Продукт " + productEntry.getKey() + ": " + productEntry.getValue());
        }
    }


}
