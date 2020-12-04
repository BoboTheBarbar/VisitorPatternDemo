package main;

public class Alkohol implements Visitable {

    private double price;

    public Alkohol(double item) {
        price = item;
    }

    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}