package com.company;

import java.util.ArrayList;
import java.util.List;

public class Steam implements Observable {
    //Steam is an online service for the digital distribution of computer games and programs
    //My example is about discounts on some games
    private List<String> gamesWithDiscount = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addDiscounts(String discountedGame){
        this.gamesWithDiscount.add(discountedGame);
        notifyAllObserves();
    }

    public void removeDiscounts(String discountedGame){
        this.gamesWithDiscount.remove(discountedGame);
        notifyAllObserves();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObserves() {
        for(Observer observer: observers ){
            observer.update(this.gamesWithDiscount);
        }
    }
}
