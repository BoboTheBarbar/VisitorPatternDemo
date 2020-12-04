package main;

public class Lebensmittel implements Visitable {

    private double price;

    public Lebensmittel(double item) {
        price = item;
    }

    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}
