import java.util.Objects;
public class Product {
    private final String name;
    private final int count;
    private final int weight;
    private final int value;
    public Product(String name, int count, int weight, int value) {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException("Незаполненно поле name");
        } else {
            this.name = name;
        }
        this.count = count;
        this.weight = weight;
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
    public int getWeight() {
        return weight;
    }
    public int getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Продукт:" + name +
                ", количество" + count +
                ", вес " + weight +
                ", стоимость " + value + "\n";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        throw new RuntimeException("Продукт уже есть в списке");
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
