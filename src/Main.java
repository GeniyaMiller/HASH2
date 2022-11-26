import multiplicationTable.MultiplicationTable;
import product.Product;
import listProducts.listProducts;
import recipe.Recipe;
import recipe.SetRecipe;


import java.util.HashMap;
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

        Recipe barbeque = new Recipe("Шашлык");
        barbeque.addProductForRecipe(meat);
        barbeque.addProductForRecipe(onion);

        System.out.println(barbeque);

        Recipe saladVegetable = new Recipe("Овощной салат");
        saladVegetable.addProductForRecipe(cabbage);
        saladVegetable.addProductForRecipe(carrot);
        saladVegetable.addProductForRecipe(tomato);
        saladVegetable.addProductForRecipe(onion);

        System.out.println(saladVegetable);

        Recipe vegetableVegetable = new Recipe("Овощной");
        vegetableVegetable.addProductForRecipe(cabbage);
        vegetableVegetable.addProductForRecipe(carrot);
        vegetableVegetable.addProductForRecipe(tomato);
        vegetableVegetable.addProductForRecipe(onion);


        System.out.println(vegetableVegetable);

        SetRecipe setRecipe = new SetRecipe();
        setRecipe.addRecipe(barbeque);
        setRecipe.addRecipe(saladVegetable);
        setRecipe.addRecipe(vegetableVegetable);

        setRecipe.printSetRecipe();

        IteratorInteger iteratorInteger = new IteratorInteger();

        iteratorInteger.generationNumbers();
        System.out.printf(String.valueOf(iteratorInteger));
        System.out.println();

        iteratorInteger.removeNumbers();
        System.out.println(iteratorInteger);

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.addSetTasks();


        System.out.println("ТЕЛЕФОННЫЙ СПРАВОЧНИК");
        HashMap<String, String> telephoneDirectory = new HashMap<>();
        telephoneDirectory.put("Кобзев И.В.", "84535224341");
        telephoneDirectory.put("Юрьев А.З.", "84847543341");
        telephoneDirectory.put("Алексеев И.И.", "84535298574");
        telephoneDirectory.put("Храмов П.В.", "89558377462");
        telephoneDirectory.put("Попов К.С.", "8995588447");
        telephoneDirectory.put("ТетеревП.Р.", "89800799685");
        telephoneDirectory.put("Титов Ф.В.", "87446366251");
        telephoneDirectory.put("Павлова И.А.", "87226166352");
        telephoneDirectory.put("Шмелева П.П.", "89005588473");
        telephoneDirectory.put("Тиль А.А.", "89337726361");
        telephoneDirectory.put("Иванова А.А.", "87668857473");
        telephoneDirectory.put("Шахова М.М.", "89005500400");
        telephoneDirectory.put("Стегалова П.А.", "84530004341");
        telephoneDirectory.put("Хмель Р.В.", "88999999341");
        telephoneDirectory.put("Катечкина О.", "89112233456");
        telephoneDirectory.put("Чижова Р.Р.", "84535229999");
        telephoneDirectory.put("Васечкина О.Ж.", "84535667788");
        telephoneDirectory.put("Кобзева Й.У.", "84530778441");
        telephoneDirectory.put("Попугаев Д.Д.", "85557744737");
        telephoneDirectory.put("Катц П.П.", "84944837261");

        System.out.println(telephoneDirectory.keySet());
        System.out.println(telephoneDirectory.values());







    }
}