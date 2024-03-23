package pl.coderslab.web.sessions;

public class CartItem {

    private String name;
    private double price;
    private int quantity;

    public CartItem(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
