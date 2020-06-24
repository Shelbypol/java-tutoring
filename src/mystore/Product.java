package mystore;

//interfaces are abstracts
//all properties are static and final
//all methods are
//this is the way people interact without messing up the getters and setters
public interface Product {
    double getPrice();
    void setPrice(double newPrice);
    int getStock();
    void setStock(int newStock);
}
