package com.gaurav.ghati;

public class Main {

    private static StokeList stokeList = new StokeList();
    public static void main(String[] args) {
        StokeItem temp = new StokeItem("bread", 0.86, 100);
        stokeList.addStoke(temp);

        temp = new StokeItem("cake", 1.10, 7);
        stokeList.addStoke(temp);

        temp = new StokeItem("car", 12.50, 2);
        stokeList.addStoke(temp);

        temp = new StokeItem("chair", 62.0, 10);
        stokeList.addStoke(temp);

        temp = new StokeItem("cup", 0.50, 200);
        stokeList.addStoke(temp);

        temp = new StokeItem("door", 72.95, 4);
        stokeList.addStoke(temp);

        temp = new StokeItem("juice", 2.50, 36);
        stokeList.addStoke(temp);

        temp = new StokeItem("phone", 96.99, 35);
        stokeList.addStoke(temp);

        temp = new StokeItem("towel", 2.40, 80);
        stokeList.addStoke(temp);

        temp = new StokeItem("vase", 8.76, 40);
        stokeList.addStoke(temp);

        Basket timsBasket = new Basket("Tim");
        sellitem(timsBasket, "car", 1);
        sellitem(timsBasket, "car", 1);
        sellitem(timsBasket, "spanner", 5);
        sellitem(timsBasket, "juice", 4);
        sellitem(timsBasket, "cup", 12);
        sellitem(timsBasket, "bread", 1);
        System.out.println(timsBasket);

        System.out.println(stokeList);


        Basket basket = new Basket("Customer");
        sellitem(basket,"cup",100);
        sellitem(basket,"juice",5);
        unreversMain(basket,"cup",1);
        System.out.println(basket);

        unreversMain(timsBasket,"car",2);
        unreversMain(timsBasket,"cup",9);
        System.out.println("Car removed " + unreversMain(timsBasket,"car",1));

        System.out.println(timsBasket);

        unreversMain(timsBasket,"bread",1);
        unreversMain(timsBasket,"cup",3);
        unreversMain(timsBasket,"juice",4);
        unreversMain(timsBasket,"cup",3);

        System.out.println(timsBasket);

        System.out.println(basket);
        System.out.println("Display stockList befour andd after checkout");
        System.out.println(stokeList);
        basket.checkOut();
        System.out.println(basket);
        System.out.println(stokeList);

        stokeList.get("car").adjustStoke(2000);
        stokeList.get("car").adjustStoke(-1000);
        System.out.println(stokeList);

        timsBasket.checkOut();
        System.out.println(timsBasket);

    }

    private static void sellitem(Basket basket,String item , int quantity){
        StokeItem newitem = stokeList.get(item);
        if(newitem == null){
            System.out.println("There is no such "+item+" element in the stokelist.");
        }else{
            if(stokeList.get(item).quantityInStoke() >= quantity) {
                stokeList.get(item).requestStoke(quantity);
                basket.addtoBasket(newitem, quantity);
            }else{
                System.out.println(""+quantity + " of "+item + " Is not present.");
            }
        }
    }

    private static int unreversMain(Basket basket ,String item ,int quantity){
        StokeItem newItem = stokeList.get(item);
        if(newItem == null){
            System.out.println("There is no such "+item+" element in the stokelist.");
            return 0;
        }else{
            stokeList.get(item).unreserved(quantity);
            basket.addtoBasket(newItem,-quantity);
            return quantity;
        }
    }
}
