package com.gaurav.ghati;

public class StokeItem implements Comparable<StokeItem> {

    private final String name;
    private double price;
    private int quantityStoke;
    private int reserved = 0;


    StokeItem(String name, double price, int quantityStoke) {
        this.name = name;
        this.price = price;
        this.quantityStoke = quantityStoke;
    }

    void requestStoke(int quantity){
        if(this.reserved <= this.quantityStoke){
            this.reserved = this.reserved + quantity;
        }
    }

    void unreserved(int number){
        if(reserved >= number)
            reserved = reserved - number;
    }

    void calculate(){
        if(quantityStoke>=reserved){
             quantityStoke = quantityStoke - reserved;
        }
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    void adjustStoke(int quantity){
        int newStoke = this.quantityStoke + quantity;
        if(newStoke>0)
           this.quantityStoke = newStoke;
    }

    int quantityInStoke() {
        return quantityStoke;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        StokeItem stokeItem = (StokeItem) o;
        return this.name.equals(stokeItem.getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 45;
    }

    @Override
    public int compareTo(StokeItem o) {
        if(o == this)
            return 0;

        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
         return this.name+ "  | price : "+this.price + " | Reserved : "+this.reserved;
    }


}
