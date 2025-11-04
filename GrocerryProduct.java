package MinistoreInvontory;

public class GrocerryProduct extends Product{
    private String expiryDate;

    public GrocerryProduct(int id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
