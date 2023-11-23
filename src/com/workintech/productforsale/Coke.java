package com.workintech.productforsale;

public class Coke extends ProductForSale{

    private final boolean justCoke = true;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("bu bir coke mu? "+ justCoke+ " bu bir " + getClass().getSimpleName() + " " +
                "ve tipi: " + this.getType());
    }
}
