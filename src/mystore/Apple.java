package mystore;

public class Apple extends Computer implements Product {
    private double price;
    private int stock;

    //CONSTRUCTOR
    public Apple(boolean newIsLaptop, String newType, double price, int stock) {
        super(newIsLaptop, newType);
        this.price = price;
        this.stock = stock;
    }

    public Apple(boolean newIsLaptop, String newAppleType){
        super(newIsLaptop, newAppleType);
        super.setOS("macOS");
    }

    @Override
    public double getPrice() {
        return this.price * 2;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public void setStock(int newStock) {
        this.stock = newStock;
    }
}
