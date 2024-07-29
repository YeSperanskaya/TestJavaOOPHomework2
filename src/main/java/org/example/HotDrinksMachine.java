package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachine{
    private List<HotDrink> hotDrinkList = new ArrayList<>();

    public HotDrinksMachine(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public HotDrinksMachine(HotDrink hotDrink) {
        hotDrinkList.add(hotDrink);
    }

    @Override
    public Coffe getProduct(String name, int volume, int temperature) {
        Coffe coffe = new Coffe(name, volume,temperature);
        if(hotDrinkList.contains(coffe)) {
            return coffe;
        } else {
            return new Coffe("emty", 0,0);
        }
    }

    public void addCoffee(Coffe coffe) {
        hotDrinkList.add(coffe);
    }

    public List<HotDrink> getHotDrinkList() {
        return hotDrinkList;
    }

    public void setHotDrinkList(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    @Override
    public String toString() {
        return "Автомат горячих напитков: " + "\n" +
                "Список напитков: " + hotDrinkList;
    }
}
