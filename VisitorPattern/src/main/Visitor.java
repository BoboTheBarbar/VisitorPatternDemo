package main;// The visitor pattern is used when you have to perform
// the same action on many objects of different types

interface Visitor {

    // Created to automatically use the right
    // code based on the Object sent
    // Method Overloading

    String visit(Alkohol alkohol);

    String visit(Tabak tabak);

    String visit(Lebensmittel lebensmittel);

}