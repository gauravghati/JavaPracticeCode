package com.gaurav.ghati;

import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final String name;
    private Map<StokeItem,Integer> list;

    Basket(String name) {
        this.name = name;
        list = new TreeMap<>();
    }

    void addtoBasket(StokeItem item , int quantity){
        int inBasket = list.getOrDefault(item , 0);
        if(item != null && quantity > 0){
            list.put(item, quantity + inBasket);
        }else if(inBasket >= (-quantity) && quantity < 0){
            list.put(item,inBasket + quantity);
        }
    }

    void checkOut (){
        System.out.println("After checkout : ");
        for(StokeItem s : list.keySet()){
            s.calculate();
        }
        list = new TreeMap<>();
    }

    @Override
    public String toString() {
        String s = "These Items are present in the "+name+" basket: \n";
        double itemCost = 0;

        for(Map.Entry<StokeItem,Integer> item : list.entrySet()){
            itemCost = itemCost + item.getKey().getPrice() * item.getValue();
            s = s + "--> " + item.getKey().getName() + " : "+item.getValue()+"" + "\n";
        }
        s = s + " \nTotal Cost  = "+ String.format("%.2f",itemCost)+"\n\n";
        return s;
    }

}
