package MinistoreInvontory;

public class InventoryTest {
    public static void main(String []args) {
        InventorySystem system = new InventorySystem();

        Product genric = new  Product(1, "Genric Item", 10.0);
        ElectronicProduct laptop = new ElectronicProduct(2, "Laptop", 750.0, 24);
        GrocerryProduct milk = new GrocerryProduct(3, "Milk", 1.5, "2025-12-01");
        system.addProduct(genric);
        system.addProduct(laptop);
        system.addProduct(milk);

        system.showAllProducts();
    }
}
