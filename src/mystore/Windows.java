package mystore;

//Window subclass of Computer whihch is a
public class Windows extends Computer implements Product{
    private double price;
    private int stock;

    public Windows(String newComputerOs, boolean newIsLaptop, String newComputerType){
        super(newIsLaptop, newComputerType);
        super.setOS(newComputerOs);
    }

    //implement
    @Override
    public double getPrice() {
        return this.price;
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
