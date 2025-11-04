package MinistoreInvontory;

import java.util.ArrayList;

public class InventorySystem {
    private ArrayList<Product> products = new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }
    public void showAllProducts(){
        for (Product p: products){
            p.displayInfo();
            System.out.println("_____________");
        }
    }
}
