package entities;

public class Product {

    public String name;
    public Double price;
    public double quantity;

    public double TotalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // argumento da função
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ "
                + String.format("%.2f, ", price)
                + String.format("%.2f ", quantity) + " units, Total: $ "
                + TotalValueInStock();
    }

}
