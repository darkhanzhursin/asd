import java.util.ArrayList;
import java.util.List;

public class Category implements ProductCatalog {
    private String name;
    private List<ProductCatalog> components;

    public Category(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(ProductCatalog component) {
        components.add(component);
    }

    public void removeComponent(ProductCatalog component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println("Category: " + name);
        for (ProductCatalog component : components) {
            component.print();
        }
    }
}
