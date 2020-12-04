package main;

public class Tabak implements Visitable {

    private double price;

    public Tabak(double item) {
        price = item;
    }

    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}
