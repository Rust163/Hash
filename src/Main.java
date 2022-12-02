import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product sourCream = new Product("Сметана", 1, 1, 38);
        products.add(sourCream);
        Product tomato = new Product("Помидор", 1, 1, 48);
        products.add(tomato);
        Product wather = new Product("Вода", 1, 1, 2);
        products.add(wather);
        products.add(new Product("Вода",1,1,2));
        Product coffe = new Product("Кофе", 1, 1, 2);
        products.add(coffe);
        Product cucumber = new Product("Огурец", 1, 1, 48);
        products.add(cucumber);


        HashMap<Product, Integer> salatProducts1 = new HashMap<>();
        salatProducts1.put(new Product("Кофе", 1, 1, 2), 2);
        salatProducts1.put(new Product("Вода", 1, 1, 2), 2);

        HashMap<Product, Integer> salatProducts2 = new HashMap<>();
        salatProducts2.put(new Product("Сметана", 1, 1, 38), 1);
        salatProducts2.put(new Product("Огурец", 2, 1, 48), 2);
        salatProducts2.put(new Product("Помидор", 2, 1, 48), 2);

        System.out.println(products.toString());

        Recipes salat1 = new Recipes("Кофе вареный", salatProducts1);
        salat1.getRecipes();
        Recipes salat2 = new Recipes("Салат летний", salatProducts2);
        salat2.getRecipes();

        Set<Recipes> recipesList = new HashSet<>();
        recipesList.add(salat1);
        recipesList.add(salat2);
        recipesList.add(salat2);
    }
}
