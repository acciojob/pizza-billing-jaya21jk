package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private boolean addExtraCheese;
    private boolean addExtraToppings;
    private boolean addTakeaway;
    private boolean getBill;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true) this.price = 300;
        else this.price = 400;
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
            if(isVeg) this.price += 70;
            else this.price += 120;
            addExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(addTakeaway == false) {
            this.price += 20;
            addTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here

            if (isVeg) {
                bill += "Base Price Of The Pizza: " + 300 + "\n";
            } else {
                bill += "Base Price Of The Pizza: " + 400 + "\n";
            }
            if (addExtraCheese) {
                bill += "Extra Cheese Added: " + 80+"\n";
            }
            if(addExtraToppings) {
                if(isVeg){
                    bill += "Extra Toppings Added: "+70+"\n";
                }
                else bill += "Extra Toppings Added: "+120+"\n";
            }
            if(addTakeaway) {
                bill += "Paperbag Added: " + 20 +"\n";
            }
            bill += "Total Price: "+this.price+"\n";

        return this.bill;
    }
}
