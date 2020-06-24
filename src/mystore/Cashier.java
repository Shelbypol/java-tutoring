package mystore;

import peoplestuff.Person;

import java.util.List;

//option + enter is quick import
public class Cashier extends Person {

    public double total(List<Product> cart){
        double sum = 0;
        for(Product item : cart){
            sum += item.getPrice();
        }
        return sum;
    }

    //control enter quick make constructor
//    public Cashier(String newPersonFirstName, String newPersonLastName, int newPersonAge) {
//        super(newPersonFirstName, newPersonLastName, newPersonAge);
//    }

}
