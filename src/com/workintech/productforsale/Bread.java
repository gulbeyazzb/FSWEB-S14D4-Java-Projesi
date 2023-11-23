package com.workintech.productforsale;

public class Bread extends ProductForSale{

    private final boolean justBread=true;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("bu bir bread mi? "+ justBread+ " bu bir " + getClass().getSimpleName() + " " +
                "ve tipi: " + this.getType());

    }
}
