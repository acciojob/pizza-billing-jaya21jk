package com.driver;

public class DeluxePizza extends Pizza {

    private int price;
    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
