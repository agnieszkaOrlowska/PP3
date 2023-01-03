
public class Product
{
    private String name;
    private boolean isVegetarian;
    
    Product(String name, boolean isVegetarian) {
        this.name=name;
        this.isVegetarian=isVegetarian;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name=newName;
    }
    
    public String toString() {
        return getName();
    }
    
    public static void main(String[] args) {
        Product p1 = new Product("Banan", false);
        System.out.println(p1.toString());
    }
}
