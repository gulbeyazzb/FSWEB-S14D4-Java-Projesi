package com.workintech.productforsale;

public class Chocolate extends ProductForSale{

    private final boolean justChocolate=true;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("bu bir chocolate mı? "+ justChocolate+ " bu bir "
                + getClass().getSimpleName() + " ve tipi: " + this.getType());

    }
}
