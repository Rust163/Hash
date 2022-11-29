import java.util.*;
public class Recipes {
    private final String recipesName;
    HashMap<Product, Integer> products = new HashMap<>();

    public Recipes(String name,HashMap<Product,Integer> products) {
        this.recipesName = name;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if(entry.getValue()<1){
                products.replace(entry.getKey(),entry.getValue(),1);
            }
            this.products = products;
        }
    }
    public void getRecipes() {
        var b=products.values().toArray();
        int i=0;
        int sum=0;
        for (Product product : products.keySet()) {
            sum=product.getValue() * ((Integer) b[product.getCount()]);
            i++;
        }
        System.out.println(getRecipesName());
        System.out.println(products);
        System.out.println("Сумма равна = " + sum);
    }
    private String getRecipesName() {
        return recipesName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes that = (Recipes) o;
        return recipesName.equals(that.recipesName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recipesName);
    }
}

