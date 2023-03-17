package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private int basePrice;
    private int cheesePrice;
    private int toppingsPrice;
    private int paperBag;
    private boolean addExtraCheese;
    private boolean addExtraToppings;
    private boolean addTakeaway;
    private boolean getBill;

    public Pizza(boolean isVeg){
        if(isVeg){
            basePrice = 300;
            toppingsPrice = 70;
            this.price = 300;
        }else{
            basePrice = 400;
            toppingsPrice = 120;
            this.price = 400;
        }
        paperBag = 20;
        cheesePrice = 80;

        this.bill = "Base Price Of The Pizza: " + basePrice + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(addExtraCheese == false) {
            this.price += 80;
            addExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(addExtraToppings == false) {
            this.price += toppingsPrice;
            addExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(addTakeaway == false) {
            this.price += paperBag;
            addTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(getBill == false) {

            if (addExtraCheese) {
                bill += "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if (addExtraToppings) {

                bill += "Extra Toppings Added: " + toppingsPrice + "\n";
            }
            if (addTakeaway) {
                bill += "Paperbag Added: " + paperBag + "\n";
            }
            bill += "Total Price: " + this.price + "\n";

            getBill = true;
        }
        return this.bill;
    }
}
