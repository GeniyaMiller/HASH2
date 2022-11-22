import product.Product;
import listProducts.listProducts;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Product tomato = new Product("Томат", 130, 4.0);
        Product potato = new Product("Картофель", 55, 4.5);
        Product carrot = new Product("Морковь", 60, 1.5);
        Product cabbage = new Product("Капуста", 99, 1.3);
        Product onion = new Product("Лук", 43, 2.2);
        Product meat = new Product("Мясо", 800, 4.0);
        Product bread = new Product("Хлеб", 67, 1.0);

        listProducts listProducts = new listProducts();


        listProducts.addProduct(tomato);
        listProducts.addProduct(potato);
        listProducts.addProduct(carrot);
        listProducts.addProduct(cabbage);
        listProducts.addProduct(onion);
        listProducts.addProduct(meat);
        listProducts.addProduct(bread);
        listProducts.showInfo();

        listProducts.removeProduct(potato);
        listProducts.showInfo();









    }
}