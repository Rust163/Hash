import java.util.*;
public class Recipes {
    private String recipesName;
    Set<Product> products = new HashSet<>();

    public Recipes(String name, Set<Product> products) {
        this.recipesName=name;
        this.products = products;
    }
    public void getRecipes() {
        ArrayList<Product> items =new ArrayList<Product>();
        System.out.println("Состав слата " + getRecipesName() + ": ");
        int sum=0;
        for (Product product : products) {
            items.add(product);
            sum+=product.getCount()* product.getValue();
        }
        System.out.println(Arrays.toString(products.toArray()));
        System.out.println("Сумма продуктов салата: "+sum);
    }
    public String getRecipesName() {
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

