package MinistoreInvontory;

public class ElectronicProduct extends Product{
    private int warrantyPeriod;

    public ElectronicProduct(int id, String name, double price, int warrantyPeriod) {
        super(id, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warrantyPeriod + " months");
    }
}
