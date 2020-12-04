package main;

public class DemoApp {
    public static void main(String[] args) {

        Visitor taxCalc = new SteuerVisitor();
        Visitor taxHolidayCalc = new SteuerFeiertagVisitor();

        Lebensmittel milk = new Lebensmittel(3.47);
        Alkohol vodka = new Alkohol(11.99);
        Tabak cigars = new Tabak(19.99);

        System.out.println(milk.accept(taxCalc) + "\n");
        System.out.println(vodka.accept(taxCalc) + "\n");
        System.out.println(cigars.accept(taxCalc) + "\n");

        System.out.println("TAX HOLIDAY PRICES\n");

        System.out.println(milk.accept(taxHolidayCalc) + "\n");
        System.out.println(vodka.accept(taxHolidayCalc) + "\n");
        System.out.println(cigars.accept(taxHolidayCalc) + "\n");
    }
}
