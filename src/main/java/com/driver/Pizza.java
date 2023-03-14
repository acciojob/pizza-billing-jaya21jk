package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private boolean addExtraCheese;
    private boolean addExtraToppings;
    private boolean addTakeaway;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        addExtraCheese = false;
        addExtraToppings = false;
        addTakeaway = false;
        this.bill = "";
        if(isVeg) this.price = 300;
        else this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(addExtraCheese == false) {
            price += 80;
            addExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(addExtraToppings == false) {
            if(isVeg) price += 70;
            else price += 120;
            addExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(addTakeaway == false) {
            price += 20;
            this.bill += "" + price;
            addTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
