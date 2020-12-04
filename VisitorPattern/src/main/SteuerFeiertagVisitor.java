package main;

import java.text.DecimalFormat;

// Concrete Visitor Class

class SteuerFeiertagVisitor implements Visitor {

    // This formats the item prices to 2 decimal places

    DecimalFormat df = new DecimalFormat("#.##");

    // This is created so that each item is sent to the
    // right version of visit() which is required by the
    // Visitor interface and defined below

    public SteuerFeiertagVisitor() {
    }

    // Calculates total price based on this being taxed
    // as a liquor item

    public String visit(Alkohol alkohol) {
        System.out.println("Liquor Item: Price with Tax");
        return df.format((alkohol.getPrice() * .10) + alkohol.getPrice());
    }

    // Calculates total price based on this being taxed
    // as a tobacco item

    public String visit(Tabak tabak) {
        System.out.println("Tobacco Item: Price with Tax");
        return df.format((tabak.getPrice() * .30) + tabak.getPrice());
    }

    // Calculates total price based on this being taxed
    // as a necessity item

    public String visit(Lebensmittel lebensmittel) {
        System.out.println("Necessity Item: Price with Tax");
        return df.format(lebensmittel.getPrice());
    }

}
