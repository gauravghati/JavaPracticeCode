package com.gaurav.ghati;

import java.util.*;

public class StokeList {

    private final Map<String, StokeItem> list;

    StokeList() {
        this.list = new TreeMap<>();
    }

    void addStoke(StokeItem items){

        if(items!=null) {
            StokeItem inStoke = list.getOrDefault(items.getName(), items);
            if(inStoke!=items){
                items.adjustStoke(inStoke.quantityInStoke());
            }
            list.put(items.getName(),items);
        }
    }

//    public int sellStoke(StokeItem item, int quantity){
//        StokeItem inStoke = list.getOrDefault(item.getName(),null);
//        if(inStoke != null){
//            if(inStoke!=null && quantity>0 && inStoke.quantityInStoke()>=quantity){
//                inStoke.adjustStoke(-quantity);
//                return quantity;
//            }else if(inStoke.quantityInStoke()==0){
//                System.out.println("THe stoke get finished");
//            }
//        }
//        return 0;
//    }

    StokeItem get(String key){
        return list.getOrDefault(key,null);
    }

    @Override
    public String toString() {

        String s = "This are the items of the Stoke :";
        double totalCost = 0;
        for(Map.Entry<String,StokeItem> t : list.entrySet()){
            StokeItem inStoke = t.getValue();
            totalCost = totalCost + inStoke.getPrice() * inStoke.quantityInStoke();
            s = s +"\n--> "+ inStoke.getName() + ": | price: " + String.format("%.2f",inStoke.getPrice())+" | LeftItems: "+inStoke.quantityInStoke()
            +" | Total cost :"+String.format("%.2f",inStoke.getPrice() * inStoke.quantityInStoke());
        }
        s = s + "\n\nTotal prize : "+String.format("%.2f",totalCost);
        return s;
    }
}
