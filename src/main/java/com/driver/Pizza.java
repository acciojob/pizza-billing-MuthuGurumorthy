package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price+=(isVeg?300:400);
        System.out.println("Base Price Of The Pizza: "+(isVeg?"300":"400"));
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price+=80;
        System.out.println("Extra Cheese Added: 80");
    }

    public void addExtraToppings(){
        // your code goes here
        this.price+=isVeg?70:120;
        System.out.println("Extra Toppings Added: "+(isVeg?"70":"120"));
    }

    public void addTakeaway(){
        // your code goes here
        this.price+=20;
        System.out.println("Paperbag Added: 20");
    }

    public String getBill(){
        // your code goes here
        System.out.println("Total Price:"+this.price);
        return this.bill;
    }
}
