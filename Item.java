import java.util.List;

public class Item {

    private int id;
    private String Name;
    private double Price;
    private String Category;

    public Item(int id, String name, double price, String category) {
        this.id= id;
        this.Name=name;
        this.Price= price;
        this.Category=category;

    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                ", Category='" + Category + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;

    }
}