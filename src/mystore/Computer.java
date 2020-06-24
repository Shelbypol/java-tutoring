package mystore;

public class Computer {
    private String OS;
    private boolean isLaptop;
    private String type;

    //CONSTRUCTOR
    Computer(boolean newIsLaptop, String newType) {
        this.isLaptop = newIsLaptop;
        this.type = newType;
    }

    //GETTERS & SETTERS
    //command + n
    public String getOS() {
        return OS;
    }
    public void setOS(String OS) {
        this.OS = OS;
    }
    public boolean isLaptop() {
        return isLaptop;
    }
    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
